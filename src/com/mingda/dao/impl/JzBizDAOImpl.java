package com.mingda.dao.impl;

import com.mingda.dao.JzBizDAO;
import com.mingda.model.JzBiz;
import com.mingda.model.JzBizExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class JzBizDAOImpl extends SqlMapClientDaoSupport implements JzBizDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public JzBizDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public int countByExample(JzBizExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"JZ_BIZ.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public int deleteByExample(JzBizExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"JZ_BIZ.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public int deleteByPrimaryKey(Integer bizId) {
		JzBiz key = new JzBiz();
		key.setBizId(bizId);
		int rows = getSqlMapClientTemplate().delete(
				"JZ_BIZ.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public Integer insert(JzBiz record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"JZ_BIZ.ibatorgenerated_insert", record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public Integer insertSelective(JzBiz record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"JZ_BIZ.ibatorgenerated_insertSelective", record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	@SuppressWarnings("unchecked")
	public List<JzBiz> selectByExample(JzBizExample example) {
		List<JzBiz> list = getSqlMapClientTemplate().queryForList(
				"JZ_BIZ.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public JzBiz selectByPrimaryKey(Integer bizId) {
		JzBiz key = new JzBiz();
		key.setBizId(bizId);
		JzBiz record = (JzBiz) getSqlMapClientTemplate().queryForObject(
				"JZ_BIZ.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public int updateByExampleSelective(JzBiz record, JzBizExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"JZ_BIZ.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public int updateByExample(JzBiz record, JzBizExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"JZ_BIZ.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public int updateByPrimaryKeySelective(JzBiz record) {
		int rows = getSqlMapClientTemplate().update(
				"JZ_BIZ.ibatorgenerated_updateByPrimaryKeySelective", record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	public int updateByPrimaryKey(JzBiz record) {
		int rows = getSqlMapClientTemplate().update(
				"JZ_BIZ.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.JZ_BIZ
	 * @ibatorgenerated  Fri Oct 15 15:21:28 CST 2010
	 */
	private static class UpdateByExampleParms extends JzBizExample {
		private Object record;

		public UpdateByExampleParms(Object record, JzBizExample example) {
			super(example);
			this.record = record;
		}

		@SuppressWarnings("unused")
		public Object getRecord() {
			return record;
		}
	}
}