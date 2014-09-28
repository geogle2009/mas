package com.mingda.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondBatchExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public SecondBatchExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	protected SecondBatchExample(SecondBatchExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.SECOND_BATCH
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public static class Criteria {
		protected List<String> criteriaWithoutValue;
		protected List<Map<String, Object>> criteriaWithSingleValue;
		protected List<Map<String, Object>> criteriaWithListValue;
		protected List<Map<String, Object>> criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList<String>();
			criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
			criteriaWithListValue = new ArrayList<Map<String, Object>>();
			criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List<String> getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List<Map<String, Object>> getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List<Map<String, Object>> getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List<Map<String, Object>> getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition,
				List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List<Object> list = new ArrayList<Object>();
			list.add(value1);
			list.add(value2);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andBatchIdIsNull() {
			addCriterion("BATCH_ID is null");
			return this;
		}

		public Criteria andBatchIdIsNotNull() {
			addCriterion("BATCH_ID is not null");
			return this;
		}

		public Criteria andBatchIdEqualTo(BigDecimal value) {
			addCriterion("BATCH_ID =", value, "batchId");
			return this;
		}

		public Criteria andBatchIdNotEqualTo(BigDecimal value) {
			addCriterion("BATCH_ID <>", value, "batchId");
			return this;
		}

		public Criteria andBatchIdGreaterThan(BigDecimal value) {
			addCriterion("BATCH_ID >", value, "batchId");
			return this;
		}

		public Criteria andBatchIdGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("BATCH_ID >=", value, "batchId");
			return this;
		}

		public Criteria andBatchIdLessThan(BigDecimal value) {
			addCriterion("BATCH_ID <", value, "batchId");
			return this;
		}

		public Criteria andBatchIdLessThanOrEqualTo(BigDecimal value) {
			addCriterion("BATCH_ID <=", value, "batchId");
			return this;
		}

		public Criteria andBatchIdIn(List<BigDecimal> values) {
			addCriterion("BATCH_ID in", values, "batchId");
			return this;
		}

		public Criteria andBatchIdNotIn(List<BigDecimal> values) {
			addCriterion("BATCH_ID not in", values, "batchId");
			return this;
		}

		public Criteria andBatchIdBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("BATCH_ID between", value1, value2, "batchId");
			return this;
		}

		public Criteria andBatchIdNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("BATCH_ID not between", value1, value2, "batchId");
			return this;
		}

		public Criteria andOrganizationIdIsNull() {
			addCriterion("ORGANIZATION_ID is null");
			return this;
		}

		public Criteria andOrganizationIdIsNotNull() {
			addCriterion("ORGANIZATION_ID is not null");
			return this;
		}

		public Criteria andOrganizationIdEqualTo(String value) {
			addCriterion("ORGANIZATION_ID =", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdNotEqualTo(String value) {
			addCriterion("ORGANIZATION_ID <>", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdGreaterThan(String value) {
			addCriterion("ORGANIZATION_ID >", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
			addCriterion("ORGANIZATION_ID >=", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdLessThan(String value) {
			addCriterion("ORGANIZATION_ID <", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
			addCriterion("ORGANIZATION_ID <=", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdLike(String value) {
			addCriterion("ORGANIZATION_ID like", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdNotLike(String value) {
			addCriterion("ORGANIZATION_ID not like", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdIn(List<String> values) {
			addCriterion("ORGANIZATION_ID in", values, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdNotIn(List<String> values) {
			addCriterion("ORGANIZATION_ID not in", values, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdBetween(String value1, String value2) {
			addCriterion("ORGANIZATION_ID between", value1, value2,
					"organizationId");
			return this;
		}

		public Criteria andOrganizationIdNotBetween(String value1, String value2) {
			addCriterion("ORGANIZATION_ID not between", value1, value2,
					"organizationId");
			return this;
		}

		public Criteria andOperTimeIsNull() {
			addCriterion("OPER_TIME is null");
			return this;
		}

		public Criteria andOperTimeIsNotNull() {
			addCriterion("OPER_TIME is not null");
			return this;
		}

		public Criteria andOperTimeEqualTo(Date value) {
			addCriterion("OPER_TIME =", value, "operTime");
			return this;
		}

		public Criteria andOperTimeNotEqualTo(Date value) {
			addCriterion("OPER_TIME <>", value, "operTime");
			return this;
		}

		public Criteria andOperTimeGreaterThan(Date value) {
			addCriterion("OPER_TIME >", value, "operTime");
			return this;
		}

		public Criteria andOperTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("OPER_TIME >=", value, "operTime");
			return this;
		}

		public Criteria andOperTimeLessThan(Date value) {
			addCriterion("OPER_TIME <", value, "operTime");
			return this;
		}

		public Criteria andOperTimeLessThanOrEqualTo(Date value) {
			addCriterion("OPER_TIME <=", value, "operTime");
			return this;
		}

		public Criteria andOperTimeIn(List<Date> values) {
			addCriterion("OPER_TIME in", values, "operTime");
			return this;
		}

		public Criteria andOperTimeNotIn(List<Date> values) {
			addCriterion("OPER_TIME not in", values, "operTime");
			return this;
		}

		public Criteria andOperTimeBetween(Date value1, Date value2) {
			addCriterion("OPER_TIME between", value1, value2, "operTime");
			return this;
		}

		public Criteria andOperTimeNotBetween(Date value1, Date value2) {
			addCriterion("OPER_TIME not between", value1, value2, "operTime");
			return this;
		}
	}
}