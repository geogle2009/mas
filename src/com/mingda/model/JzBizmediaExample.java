package com.mingda.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JzBizmediaExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public JzBizmediaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    protected JzBizmediaExample(JzBizmediaExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
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
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
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

        public Criteria andBizmediaIdIsNull() {
            addCriterion("BIZMEDIA_ID is null");
            return this;
        }

        public Criteria andBizmediaIdIsNotNull() {
            addCriterion("BIZMEDIA_ID is not null");
            return this;
        }

        public Criteria andBizmediaIdEqualTo(Integer value) {
            addCriterion("BIZMEDIA_ID =", value, "bizmediaId");
            return this;
        }

        public Criteria andBizmediaIdNotEqualTo(Integer value) {
            addCriterion("BIZMEDIA_ID <>", value, "bizmediaId");
            return this;
        }

        public Criteria andBizmediaIdGreaterThan(Integer value) {
            addCriterion("BIZMEDIA_ID >", value, "bizmediaId");
            return this;
        }

        public Criteria andBizmediaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BIZMEDIA_ID >=", value, "bizmediaId");
            return this;
        }

        public Criteria andBizmediaIdLessThan(Integer value) {
            addCriterion("BIZMEDIA_ID <", value, "bizmediaId");
            return this;
        }

        public Criteria andBizmediaIdLessThanOrEqualTo(Integer value) {
            addCriterion("BIZMEDIA_ID <=", value, "bizmediaId");
            return this;
        }

        public Criteria andBizmediaIdIn(List<Integer> values) {
            addCriterion("BIZMEDIA_ID in", values, "bizmediaId");
            return this;
        }

        public Criteria andBizmediaIdNotIn(List<Integer> values) {
            addCriterion("BIZMEDIA_ID not in", values, "bizmediaId");
            return this;
        }

        public Criteria andBizmediaIdBetween(Integer value1, Integer value2) {
            addCriterion("BIZMEDIA_ID between", value1, value2, "bizmediaId");
            return this;
        }

        public Criteria andBizmediaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BIZMEDIA_ID not between", value1, value2, "bizmediaId");
            return this;
        }

        public Criteria andBizIdIsNull() {
            addCriterion("BIZ_ID is null");
            return this;
        }

        public Criteria andBizIdIsNotNull() {
            addCriterion("BIZ_ID is not null");
            return this;
        }

        public Criteria andBizIdEqualTo(Integer value) {
            addCriterion("BIZ_ID =", value, "bizId");
            return this;
        }

        public Criteria andBizIdNotEqualTo(Integer value) {
            addCriterion("BIZ_ID <>", value, "bizId");
            return this;
        }

        public Criteria andBizIdGreaterThan(Integer value) {
            addCriterion("BIZ_ID >", value, "bizId");
            return this;
        }

        public Criteria andBizIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BIZ_ID >=", value, "bizId");
            return this;
        }

        public Criteria andBizIdLessThan(Integer value) {
            addCriterion("BIZ_ID <", value, "bizId");
            return this;
        }

        public Criteria andBizIdLessThanOrEqualTo(Integer value) {
            addCriterion("BIZ_ID <=", value, "bizId");
            return this;
        }

        public Criteria andBizIdIn(List<Integer> values) {
            addCriterion("BIZ_ID in", values, "bizId");
            return this;
        }

        public Criteria andBizIdNotIn(List<Integer> values) {
            addCriterion("BIZ_ID not in", values, "bizId");
            return this;
        }

        public Criteria andBizIdBetween(Integer value1, Integer value2) {
            addCriterion("BIZ_ID between", value1, value2, "bizId");
            return this;
        }

        public Criteria andBizIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BIZ_ID not between", value1, value2, "bizId");
            return this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("FILETYPE is null");
            return this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("FILETYPE is not null");
            return this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("FILETYPE =", value, "filetype");
            return this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("FILETYPE <>", value, "filetype");
            return this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("FILETYPE >", value, "filetype");
            return this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILETYPE >=", value, "filetype");
            return this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("FILETYPE <", value, "filetype");
            return this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("FILETYPE <=", value, "filetype");
            return this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("FILETYPE like", value, "filetype");
            return this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("FILETYPE not like", value, "filetype");
            return this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("FILETYPE in", values, "filetype");
            return this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("FILETYPE not in", values, "filetype");
            return this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("FILETYPE between", value1, value2, "filetype");
            return this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("FILETYPE not between", value1, value2, "filetype");
            return this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("FILEPATH is null");
            return this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("FILEPATH is not null");
            return this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("FILEPATH =", value, "filepath");
            return this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("FILEPATH <>", value, "filepath");
            return this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("FILEPATH >", value, "filepath");
            return this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("FILEPATH >=", value, "filepath");
            return this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("FILEPATH <", value, "filepath");
            return this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("FILEPATH <=", value, "filepath");
            return this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("FILEPATH like", value, "filepath");
            return this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("FILEPATH not like", value, "filepath");
            return this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("FILEPATH in", values, "filepath");
            return this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("FILEPATH not in", values, "filepath");
            return this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("FILEPATH between", value1, value2, "filepath");
            return this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("FILEPATH not between", value1, value2, "filepath");
            return this;
        }
    }
}