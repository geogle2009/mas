package com.mingda.service;

import java.util.HashMap;
import java.util.List;

import com.mingda.dto.DeptDTO;
import com.mingda.dto.DictDTO;
import com.mingda.dto.HospitalPayDTO;
import com.mingda.dto.IcdDTO;
import com.mingda.dto.OrganizationDTO;
import com.mingda.dto.OutIcdDTO;
import com.mingda.dto.UserDTO;

public interface SystemDataService {
	/**
	 * ��ѯ�������û�
	 * 
	 * @param organizationId
	 * @return
	 */
	public List<UserDTO> findUsersByOrgan(String organizationId);

	/**
	 * ��ѯ����
	 * 
	 * @param organizationId
	 * @return
	 */
	public OrganizationDTO findOrganziation(String organizationId);

	/**
	 * ��ѯֱ���¼�����
	 * 
	 * @param organizationId
	 * @return
	 */
	public List<OrganizationDTO> findOrgChilds(String organizationId);

	public List<OrganizationDTO> findOrgParentAndChilds(String organizationId);

	public List<OrganizationDTO> findOrganizationExt(String organizationId);

	/**
	 * ��ѯҽԺ�б�
	 */
	public List<DeptDTO> findDept();

	/**
	 * ��ѯ������ҽԺ�б�
	 * 
	 * @param organizationId
	 * @return
	 */
	public List<DeptDTO> findDeptsByOrg(String organizationId);

	/**
	 * �������Բ�����
	 * 
	 * @param type
	 * @return
	 */
	public List<IcdDTO> findSickens(String type);

	/**
	 * �������Բ�����
	 * 
	 * @param type
	 * @param string 
	 * @return
	 */
	public List<OutIcdDTO> findSickens(String organizationId, String type, String string ,String outtype);

	public List<DeptDTO> findDeptsByOrg1(String oid);

	public List<OrganizationDTO> findOrgAll(String organizationId);

	public void saveResetemp(UserDTO userDTO) throws RuntimeException;

	public void removeEmp(UserDTO userDTO) throws RuntimeException;

	public String saveEmp(UserDTO userDTO) throws RuntimeException;

	public List<UserDTO> findMus(String oid);

	public List<UserDTO> findHus(String oid);

	public List<HospitalPayDTO> findHospitalpays(String oid, String organizationId);

	public HospitalPayDTO findHospitalpay(HospitalPayDTO hospitalPayDTO);

	public List<DeptDTO> findDeptsByOrgExt(String string);

	public HospitalPayDTO saveHospitalpay(HospitalPayDTO hospitalPayDTO);

	public List<DictDTO> findNations();

	// ��֤���֤��
	public HashMap<String, String> findvalpaperid(String paperId);

	// ��ѯ���֤�ظ�
	public String findChachong(String memberId, String paperId);

	public String findPageflag(String organizationId);

	public List<DeptDTO> findDeptsByOrg2(String organizationId);

	public List<DeptDTO> findDeptsByOrg3(String organizationId);


}
