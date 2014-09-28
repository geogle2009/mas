package com.mingda.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mingda.dao.CsempDAO;
import com.mingda.dao.ExtendsDAO;
import com.mingda.dao.ManagerEmpDAO;
import com.mingda.dao.ManagerOrgDAO;
import com.mingda.dao.NcempDAO;
import com.mingda.dto.RoleDTO;
import com.mingda.dto.UserDTO;
import com.mingda.model.ManagerEmp;
import com.mingda.model.ManagerEmpExample;
import com.mingda.model.ManagerOrg;

public class AuthorityServiceImpl implements AuthorityService {
	private ExtendsDAO extendsDAO;
	private CsempDAO csempDAO;
	private NcempDAO ncempDAO;
	private ManagerEmpDAO managerEmpDAO;
	private ManagerOrgDAO managerOrgDAO;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public UserDTO findUser(UserDTO userDTO) {
		String username = userDTO.getAccout();
		String password = userDTO.getPwd();
		/*
		 * CsempExample example1 = new CsempExample(); example1.createCriteria().andAccoutEqualTo(username).andPwdEqualTo(
		 * password); List<Csemp> list1 = csempDAO.selectByExample(example1); if (null != list1 && list1.size() > 0 &&
		 * list1.size() <= 2) { Csemp s = list1.get(0); userDTO.setEmpid(s.getEmpid()); userDTO.setEmpname(s.getEmpname());
		 * userDTO.setOrganizationId(s.getOrganizationId()); } else { NcempExample example2 = new NcempExample();
		 * example2.createCriteria().andAccoutEqualTo(username).andPwdEqualTo( password); List<Ncemp> list2 =
		 * ncempDAO.selectByExample(example2); if (null != list2 && list2.size() > 0 && list2.size() <= 2) { Ncemp s =
		 * list2.get(0); userDTO.setEmpid(s.getEmpid().toString()); userDTO.setEmpname(s.getEmpname());
		 * userDTO.setOrganizationId(s.getOrganizationId()); } else { userDTO = null; } }
		 */
		// 2010-12-21 �޸�
		ManagerEmpExample example = new ManagerEmpExample();
		example.createCriteria().andAccoutEqualTo(username).andPwdEqualTo(password);
		List<ManagerEmp> list = managerEmpDAO.selectByExample(example);
		if (null != list && list.size() == 1) {
			ManagerEmp s = list.get(0);
			userDTO.setAccout(s.getAccout());
			userDTO.setEmpid(s.getEmpid());
			userDTO.setEmpname(s.getEmpname());
			userDTO.setOrganizationId(s.getOrganizationId());
			userDTO.setPwd(s.getPwd());
			ManagerOrg managerOrg = managerOrgDAO.selectByPrimaryKey(s.getOrganizationId());
			userDTO.setFullname(managerOrg.getFullname());
			userDTO.setOrgname(managerOrg.getOrgname());
			// ����Ȩ���б�
			HashMap param = new HashMap();
			String sql = "select r.role_id,r.rolename from manager_emp_role er ,MANAGER_ROLE r"
					+ " where r.role_id=er.role_id and er.emp_id='" + userDTO.getEmpid() + "'";
			param.put("executsql", sql);
			List<RoleDTO> roles = new ArrayList<RoleDTO>();
			List<HashMap> rolemaps = extendsDAO.queryAll(param);
			for (HashMap ss : rolemaps) {
				RoleDTO e = new RoleDTO();
				e.setRoleId((String) ss.get("ROLE_ID"));
				e.setRolename((String) ss.get("ROLENAME"));
				roles.add(e);
			}
			userDTO.setRoles(roles);
			return userDTO;
		} else {
			return null;
		}
	}

	public void saveUserpwd(UserDTO userDTO) throws RuntimeException {
		try {
			ManagerEmp record = new ManagerEmp();
			record.setEmpid(userDTO.getEmpid());
			record.setPwd(userDTO.getNewpwd());
			managerEmpDAO.updateByPrimaryKeySelective(record);
		} catch (RuntimeException re) {
			re.printStackTrace();
			throw re;
		}
	}

	public ExtendsDAO getExtendsDAO() {
		return extendsDAO;
	}

	public void setExtendsDAO(ExtendsDAO extendsDAO) {
		this.extendsDAO = extendsDAO;
	}

	public CsempDAO getCsempDAO() {
		return csempDAO;
	}

	public void setCsempDAO(CsempDAO csempDAO) {
		this.csempDAO = csempDAO;
	}

	public NcempDAO getNcempDAO() {
		return ncempDAO;
	}

	public void setNcempDAO(NcempDAO ncempDAO) {
		this.ncempDAO = ncempDAO;
	}

	public void setManagerEmpDAO(ManagerEmpDAO managerEmpDAO) {
		this.managerEmpDAO = managerEmpDAO;
	}

	public ManagerEmpDAO getManagerEmpDAO() {
		return managerEmpDAO;
	}

	public void setManagerOrgDAO(ManagerOrgDAO managerOrgDAO) {
		this.managerOrgDAO = managerOrgDAO;
	}

	public ManagerOrgDAO getManagerOrgDAO() {
		return managerOrgDAO;
	}

	public boolean checkReportRight(String uRL, String organizationId) {
		String sqlstr = "select report_info.url,report_info.RIGHT from report_info where url='" + uRL + "'";
		HashMap<String, Comparable> param1 = new HashMap();
		param1.put("executsql", sqlstr);
		List<HashMap> rs1 = extendsDAO.queryAll(param1);
		// ���ϵͳ������Դ�����޴�URL���������
		if (rs1.size() <= 0) {
			return true;
		} else {
			int a;
			for (HashMap s : rs1) {
				try {
					a = Integer.parseInt((String) s.get("RIGHT"));
				} catch (Exception e) {
					a = 5;
				}
				if ((organizationId.length()) / 2 > a) {
					return false;
				}
			}
		}
		return true;
	}
}