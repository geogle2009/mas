package com.mingda.dao.impl;

import com.mingda.dao.ManagerOrgDAO;
import com.mingda.model.ManagerOrg;
import com.mingda.model.ManagerOrgExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ManagerOrgDAOImpl extends SqlMapClientDaoSupport implements ManagerOrgDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public ManagerOrgDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public int countByExample(ManagerOrgExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"MANAGER_ORG.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public int deleteByExample(ManagerOrgExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"MANAGER_ORG.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public int deleteByPrimaryKey(String organizationId) {
		ManagerOrg key = new ManagerOrg();
		key.setOrganizationId(organizationId);
		int rows = getSqlMapClientTemplate().delete(
				"MANAGER_ORG.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public void insert(ManagerOrg record) {
		getSqlMapClientTemplate().insert("MANAGER_ORG.ibatorgenerated_insert",
				record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public void insertSelective(ManagerOrg record) {
		getSqlMapClientTemplate().insert(
				"MANAGER_ORG.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	@SuppressWarnings("unchecked")
	public List<ManagerOrg> selectByExample(ManagerOrgExample example) {
		List<ManagerOrg> list = getSqlMapClientTemplate().queryForList(
				"MANAGER_ORG.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public ManagerOrg selectByPrimaryKey(String organizationId) {
		ManagerOrg key = new ManagerOrg();
		key.setOrganizationId(organizationId);
		ManagerOrg record = (ManagerOrg) getSqlMapClientTemplate()
				.queryForObject(
						"MANAGER_ORG.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public int updateByExampleSelective(ManagerOrg record,
			ManagerOrgExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"MANAGER_ORG.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public int updateByExample(ManagerOrg record, ManagerOrgExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"MANAGER_ORG.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public int updateByPrimaryKeySelective(ManagerOrg record) {
		int rows = getSqlMapClientTemplate().update(
				"MANAGER_ORG.ibatorgenerated_updateByPrimaryKeySelective",
				record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	public int updateByPrimaryKey(ManagerOrg record) {
		int rows = getSqlMapClientTemplate().update(
				"MANAGER_ORG.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.MANAGER_ORG
	 * @ibatorgenerated  Fri Oct 15 11:22:54 CST 2010
	 */
	private static class UpdateByExampleParms extends ManagerOrgExample {
		private Object record;

		public UpdateByExampleParms(Object record, ManagerOrgExample example) {
			super(example);
			this.record = record;
		}

		@SuppressWarnings("unused")
		public Object getRecord() {
			return record;
		}
	}
}