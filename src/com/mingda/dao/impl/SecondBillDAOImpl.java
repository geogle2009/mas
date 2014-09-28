package com.mingda.dao.impl;

import com.mingda.dao.SecondBillDAO;
import com.mingda.model.SecondBill;
import com.mingda.model.SecondBillExample;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class SecondBillDAOImpl extends SqlMapClientDaoSupport implements SecondBillDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public SecondBillDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public int countByExample(SecondBillExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"SECOND_BILL.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public int deleteByExample(SecondBillExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"SECOND_BILL.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public int deleteByPrimaryKey(BigDecimal billId) {
		SecondBill key = new SecondBill();
		key.setBillId(billId);
		int rows = getSqlMapClientTemplate().delete(
				"SECOND_BILL.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public BigDecimal insert(SecondBill record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"SECOND_BILL.ibatorgenerated_insert", record);
		return (BigDecimal) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public BigDecimal insertSelective(SecondBill record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"SECOND_BILL.ibatorgenerated_insertSelective", record);
		return (BigDecimal) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	@SuppressWarnings("unchecked")
	public List<SecondBill> selectByExample(SecondBillExample example) {
		List<SecondBill> list = getSqlMapClientTemplate().queryForList(
				"SECOND_BILL.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public SecondBill selectByPrimaryKey(BigDecimal billId) {
		SecondBill key = new SecondBill();
		key.setBillId(billId);
		SecondBill record = (SecondBill) getSqlMapClientTemplate()
				.queryForObject(
						"SECOND_BILL.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public int updateByExampleSelective(SecondBill record,
			SecondBillExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"SECOND_BILL.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public int updateByExample(SecondBill record, SecondBillExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"SECOND_BILL.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public int updateByPrimaryKeySelective(SecondBill record) {
		int rows = getSqlMapClientTemplate().update(
				"SECOND_BILL.ibatorgenerated_updateByPrimaryKeySelective",
				record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public int updateByPrimaryKey(SecondBill record) {
		int rows = getSqlMapClientTemplate().update(
				"SECOND_BILL.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.SECOND_BILL
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	private static class UpdateByExampleParms extends SecondBillExample {
		private Object record;

		public UpdateByExampleParms(Object record, SecondBillExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}