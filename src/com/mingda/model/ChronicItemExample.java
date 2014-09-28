package com.mingda.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChronicItemExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    public ChronicItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    protected ChronicItemExample(ChronicItemExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
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

        public Criteria andChroniccheckIdIsNull() {
            addCriterion("CHRONICCHECK_ID is null");
            return this;
        }

        public Criteria andChroniccheckIdIsNotNull() {
            addCriterion("CHRONICCHECK_ID is not null");
            return this;
        }

        public Criteria andChroniccheckIdEqualTo(Integer value) {
            addCriterion("CHRONICCHECK_ID =", value, "chroniccheckId");
            return this;
        }

        public Criteria andChroniccheckIdNotEqualTo(Integer value) {
            addCriterion("CHRONICCHECK_ID <>", value, "chroniccheckId");
            return this;
        }

        public Criteria andChroniccheckIdGreaterThan(Integer value) {
            addCriterion("CHRONICCHECK_ID >", value, "chroniccheckId");
            return this;
        }

        public Criteria andChroniccheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHRONICCHECK_ID >=", value, "chroniccheckId");
            return this;
        }

        public Criteria andChroniccheckIdLessThan(Integer value) {
            addCriterion("CHRONICCHECK_ID <", value, "chroniccheckId");
            return this;
        }

        public Criteria andChroniccheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHRONICCHECK_ID <=", value, "chroniccheckId");
            return this;
        }

        public Criteria andChroniccheckIdIn(List<Integer> values) {
            addCriterion("CHRONICCHECK_ID in", values, "chroniccheckId");
            return this;
        }

        public Criteria andChroniccheckIdNotIn(List<Integer> values) {
            addCriterion("CHRONICCHECK_ID not in", values, "chroniccheckId");
            return this;
        }

        public Criteria andChroniccheckIdBetween(Integer value1, Integer value2) {
            addCriterion("CHRONICCHECK_ID between", value1, value2, "chroniccheckId");
            return this;
        }

        public Criteria andChroniccheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHRONICCHECK_ID not between", value1, value2, "chroniccheckId");
            return this;
        }
    }
}