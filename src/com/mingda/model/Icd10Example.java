package com.mingda.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Icd10Example {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	public Icd10Example() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	protected Icd10Example(Icd10Example example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table JL_YLJZ.ICD10
	 * @ibatorgenerated  Thu Sep 30 14:36:57 CST 2010
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

		public Criteria andIcdIdIsNull() {
			addCriterion("ICD_ID is null");
			return this;
		}

		public Criteria andIcdIdIsNotNull() {
			addCriterion("ICD_ID is not null");
			return this;
		}

		public Criteria andIcdIdEqualTo(Integer value) {
			addCriterion("ICD_ID =", value, "icdId");
			return this;
		}

		public Criteria andIcdIdNotEqualTo(Integer value) {
			addCriterion("ICD_ID <>", value, "icdId");
			return this;
		}

		public Criteria andIcdIdGreaterThan(Integer value) {
			addCriterion("ICD_ID >", value, "icdId");
			return this;
		}

		public Criteria andIcdIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("ICD_ID >=", value, "icdId");
			return this;
		}

		public Criteria andIcdIdLessThan(Integer value) {
			addCriterion("ICD_ID <", value, "icdId");
			return this;
		}

		public Criteria andIcdIdLessThanOrEqualTo(Integer value) {
			addCriterion("ICD_ID <=", value, "icdId");
			return this;
		}

		public Criteria andIcdIdIn(List<Integer> values) {
			addCriterion("ICD_ID in", values, "icdId");
			return this;
		}

		public Criteria andIcdIdNotIn(List<Integer> values) {
			addCriterion("ICD_ID not in", values, "icdId");
			return this;
		}

		public Criteria andIcdIdBetween(Integer value1, Integer value2) {
			addCriterion("ICD_ID between", value1, value2, "icdId");
			return this;
		}

		public Criteria andIcdIdNotBetween(Integer value1, Integer value2) {
			addCriterion("ICD_ID not between", value1, value2, "icdId");
			return this;
		}

		public Criteria andIcdcodeIsNull() {
			addCriterion("ICDCODE is null");
			return this;
		}

		public Criteria andIcdcodeIsNotNull() {
			addCriterion("ICDCODE is not null");
			return this;
		}

		public Criteria andIcdcodeEqualTo(String value) {
			addCriterion("ICDCODE =", value, "icdcode");
			return this;
		}

		public Criteria andIcdcodeNotEqualTo(String value) {
			addCriterion("ICDCODE <>", value, "icdcode");
			return this;
		}

		public Criteria andIcdcodeGreaterThan(String value) {
			addCriterion("ICDCODE >", value, "icdcode");
			return this;
		}

		public Criteria andIcdcodeGreaterThanOrEqualTo(String value) {
			addCriterion("ICDCODE >=", value, "icdcode");
			return this;
		}

		public Criteria andIcdcodeLessThan(String value) {
			addCriterion("ICDCODE <", value, "icdcode");
			return this;
		}

		public Criteria andIcdcodeLessThanOrEqualTo(String value) {
			addCriterion("ICDCODE <=", value, "icdcode");
			return this;
		}

		public Criteria andIcdcodeLike(String value) {
			addCriterion("ICDCODE like", value, "icdcode");
			return this;
		}

		public Criteria andIcdcodeNotLike(String value) {
			addCriterion("ICDCODE not like", value, "icdcode");
			return this;
		}

		public Criteria andIcdcodeIn(List<String> values) {
			addCriterion("ICDCODE in", values, "icdcode");
			return this;
		}

		public Criteria andIcdcodeNotIn(List<String> values) {
			addCriterion("ICDCODE not in", values, "icdcode");
			return this;
		}

		public Criteria andIcdcodeBetween(String value1, String value2) {
			addCriterion("ICDCODE between", value1, value2, "icdcode");
			return this;
		}

		public Criteria andIcdcodeNotBetween(String value1, String value2) {
			addCriterion("ICDCODE not between", value1, value2, "icdcode");
			return this;
		}

		public Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("NAME >=", value, "name");
			return this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("NAME <=", value, "name");
			return this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return this;
		}

		public Criteria andPycodeIsNull() {
			addCriterion("PYCODE is null");
			return this;
		}

		public Criteria andPycodeIsNotNull() {
			addCriterion("PYCODE is not null");
			return this;
		}

		public Criteria andPycodeEqualTo(String value) {
			addCriterion("PYCODE =", value, "pycode");
			return this;
		}

		public Criteria andPycodeNotEqualTo(String value) {
			addCriterion("PYCODE <>", value, "pycode");
			return this;
		}

		public Criteria andPycodeGreaterThan(String value) {
			addCriterion("PYCODE >", value, "pycode");
			return this;
		}

		public Criteria andPycodeGreaterThanOrEqualTo(String value) {
			addCriterion("PYCODE >=", value, "pycode");
			return this;
		}

		public Criteria andPycodeLessThan(String value) {
			addCriterion("PYCODE <", value, "pycode");
			return this;
		}

		public Criteria andPycodeLessThanOrEqualTo(String value) {
			addCriterion("PYCODE <=", value, "pycode");
			return this;
		}

		public Criteria andPycodeLike(String value) {
			addCriterion("PYCODE like", value, "pycode");
			return this;
		}

		public Criteria andPycodeNotLike(String value) {
			addCriterion("PYCODE not like", value, "pycode");
			return this;
		}

		public Criteria andPycodeIn(List<String> values) {
			addCriterion("PYCODE in", values, "pycode");
			return this;
		}

		public Criteria andPycodeNotIn(List<String> values) {
			addCriterion("PYCODE not in", values, "pycode");
			return this;
		}

		public Criteria andPycodeBetween(String value1, String value2) {
			addCriterion("PYCODE between", value1, value2, "pycode");
			return this;
		}

		public Criteria andPycodeNotBetween(String value1, String value2) {
			addCriterion("PYCODE not between", value1, value2, "pycode");
			return this;
		}

		public Criteria andSeqIsNull() {
			addCriterion("SEQ is null");
			return this;
		}

		public Criteria andSeqIsNotNull() {
			addCriterion("SEQ is not null");
			return this;
		}

		public Criteria andSeqEqualTo(Integer value) {
			addCriterion("SEQ =", value, "seq");
			return this;
		}

		public Criteria andSeqNotEqualTo(Integer value) {
			addCriterion("SEQ <>", value, "seq");
			return this;
		}

		public Criteria andSeqGreaterThan(Integer value) {
			addCriterion("SEQ >", value, "seq");
			return this;
		}

		public Criteria andSeqGreaterThanOrEqualTo(Integer value) {
			addCriterion("SEQ >=", value, "seq");
			return this;
		}

		public Criteria andSeqLessThan(Integer value) {
			addCriterion("SEQ <", value, "seq");
			return this;
		}

		public Criteria andSeqLessThanOrEqualTo(Integer value) {
			addCriterion("SEQ <=", value, "seq");
			return this;
		}

		public Criteria andSeqIn(List<Integer> values) {
			addCriterion("SEQ in", values, "seq");
			return this;
		}

		public Criteria andSeqNotIn(List<Integer> values) {
			addCriterion("SEQ not in", values, "seq");
			return this;
		}

		public Criteria andSeqBetween(Integer value1, Integer value2) {
			addCriterion("SEQ between", value1, value2, "seq");
			return this;
		}

		public Criteria andSeqNotBetween(Integer value1, Integer value2) {
			addCriterion("SEQ not between", value1, value2, "seq");
			return this;
		}

		public Criteria andSalvFlagIsNull() {
			addCriterion("SALV_FLAG is null");
			return this;
		}

		public Criteria andSalvFlagIsNotNull() {
			addCriterion("SALV_FLAG is not null");
			return this;
		}

		public Criteria andSalvFlagEqualTo(String value) {
			addCriterion("SALV_FLAG =", value, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagNotEqualTo(String value) {
			addCriterion("SALV_FLAG <>", value, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagGreaterThan(String value) {
			addCriterion("SALV_FLAG >", value, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagGreaterThanOrEqualTo(String value) {
			addCriterion("SALV_FLAG >=", value, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagLessThan(String value) {
			addCriterion("SALV_FLAG <", value, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagLessThanOrEqualTo(String value) {
			addCriterion("SALV_FLAG <=", value, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagLike(String value) {
			addCriterion("SALV_FLAG like", value, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagNotLike(String value) {
			addCriterion("SALV_FLAG not like", value, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagIn(List<String> values) {
			addCriterion("SALV_FLAG in", values, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagNotIn(List<String> values) {
			addCriterion("SALV_FLAG not in", values, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagBetween(String value1, String value2) {
			addCriterion("SALV_FLAG between", value1, value2, "salvFlag");
			return this;
		}

		public Criteria andSalvFlagNotBetween(String value1, String value2) {
			addCriterion("SALV_FLAG not between", value1, value2, "salvFlag");
			return this;
		}
	}
}