package com.mingda.dao.impl;

import com.mingda.dao.TempCalcRuleSpeDAO;
import com.mingda.model.TempCalcRuleSpe;
import com.mingda.model.TempCalcRuleSpeExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TempCalcRuleSpeDAOImpl extends SqlMapClientDaoSupport implements TempCalcRuleSpeDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public TempCalcRuleSpeDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public int countByExample(TempCalcRuleSpeExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"TEMP_CALC_RULE_SPE.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public int deleteByExample(TempCalcRuleSpeExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"TEMP_CALC_RULE_SPE.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public int deleteByPrimaryKey(Integer ruletempspeId) {
		TempCalcRuleSpe key = new TempCalcRuleSpe();
		key.setRuletempspeId(ruletempspeId);
		int rows = getSqlMapClientTemplate().delete(
				"TEMP_CALC_RULE_SPE.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public Integer insert(TempCalcRuleSpe record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"TEMP_CALC_RULE_SPE.ibatorgenerated_insert", record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public Integer insertSelective(TempCalcRuleSpe record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"TEMP_CALC_RULE_SPE.ibatorgenerated_insertSelective", record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	@SuppressWarnings("unchecked")
	public List<TempCalcRuleSpe> selectByExample(TempCalcRuleSpeExample example) {
		List<TempCalcRuleSpe> list = getSqlMapClientTemplate().queryForList(
				"TEMP_CALC_RULE_SPE.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public TempCalcRuleSpe selectByPrimaryKey(Integer ruletempspeId) {
		TempCalcRuleSpe key = new TempCalcRuleSpe();
		key.setRuletempspeId(ruletempspeId);
		TempCalcRuleSpe record = (TempCalcRuleSpe) getSqlMapClientTemplate()
				.queryForObject(
						"TEMP_CALC_RULE_SPE.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public int updateByExampleSelective(TempCalcRuleSpe record,
			TempCalcRuleSpeExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"TEMP_CALC_RULE_SPE.ibatorgenerated_updateByExampleSelective",
				parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public int updateByExample(TempCalcRuleSpe record,
			TempCalcRuleSpeExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"TEMP_CALC_RULE_SPE.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public int updateByPrimaryKeySelective(TempCalcRuleSpe record) {
		int rows = getSqlMapClientTemplate()
				.update("TEMP_CALC_RULE_SPE.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	public int updateByPrimaryKey(TempCalcRuleSpe record) {
		int rows = getSqlMapClientTemplate()
				.update("TEMP_CALC_RULE_SPE.ibatorgenerated_updateByPrimaryKey",
						record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.TEMP_CALC_RULE_SPE
	 * @ibatorgenerated  Tue Apr 02 17:25:14 CST 2013
	 */
	private static class UpdateByExampleParms extends TempCalcRuleSpeExample {
		private Object record;

		public UpdateByExampleParms(Object record,
				TempCalcRuleSpeExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}