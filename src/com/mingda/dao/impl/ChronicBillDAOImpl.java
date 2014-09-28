package com.mingda.dao.impl;

import com.mingda.dao.ChronicBillDAO;
import com.mingda.model.ChronicBill;
import com.mingda.model.ChronicBillExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ChronicBillDAOImpl extends SqlMapClientDaoSupport implements ChronicBillDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public ChronicBillDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public int countByExample(ChronicBillExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"CHRONIC_BILL.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public int deleteByExample(ChronicBillExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"CHRONIC_BILL.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public int deleteByPrimaryKey(Integer chronicbillId) {
		ChronicBill key = new ChronicBill();
		key.setChronicbillId(chronicbillId);
		int rows = getSqlMapClientTemplate().delete(
				"CHRONIC_BILL.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public Integer insert(ChronicBill record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"CHRONIC_BILL.ibatorgenerated_insert", record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public Integer insertSelective(ChronicBill record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"CHRONIC_BILL.ibatorgenerated_insertSelective", record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	@SuppressWarnings("unchecked")
	public List<ChronicBill> selectByExample(ChronicBillExample example) {
		List<ChronicBill> list = getSqlMapClientTemplate().queryForList(
				"CHRONIC_BILL.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public ChronicBill selectByPrimaryKey(Integer chronicbillId) {
		ChronicBill key = new ChronicBill();
		key.setChronicbillId(chronicbillId);
		ChronicBill record = (ChronicBill) getSqlMapClientTemplate()
				.queryForObject(
						"CHRONIC_BILL.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public int updateByExampleSelective(ChronicBill record,
			ChronicBillExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"CHRONIC_BILL.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public int updateByExample(ChronicBill record, ChronicBillExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"CHRONIC_BILL.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public int updateByPrimaryKeySelective(ChronicBill record) {
		int rows = getSqlMapClientTemplate().update(
				"CHRONIC_BILL.ibatorgenerated_updateByPrimaryKeySelective",
				record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	public int updateByPrimaryKey(ChronicBill record) {
		int rows = getSqlMapClientTemplate().update(
				"CHRONIC_BILL.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	private static class UpdateByExampleParms extends ChronicBillExample {
		private Object record;

		public UpdateByExampleParms(Object record, ChronicBillExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}