package com.mingda.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExportxlsExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	public ExportxlsExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	protected ExportxlsExample(ExportxlsExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.EXPORTXLS
	 * @ibatorgenerated  Fri Aug 26 18:26:10 CST 2011
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

		public Criteria andEidIsNull() {
			addCriterion("EID is null");
			return this;
		}

		public Criteria andEidIsNotNull() {
			addCriterion("EID is not null");
			return this;
		}

		public Criteria andEidEqualTo(Long value) {
			addCriterion("EID =", value, "eid");
			return this;
		}

		public Criteria andEidNotEqualTo(Long value) {
			addCriterion("EID <>", value, "eid");
			return this;
		}

		public Criteria andEidGreaterThan(Long value) {
			addCriterion("EID >", value, "eid");
			return this;
		}

		public Criteria andEidGreaterThanOrEqualTo(Long value) {
			addCriterion("EID >=", value, "eid");
			return this;
		}

		public Criteria andEidLessThan(Long value) {
			addCriterion("EID <", value, "eid");
			return this;
		}

		public Criteria andEidLessThanOrEqualTo(Long value) {
			addCriterion("EID <=", value, "eid");
			return this;
		}

		public Criteria andEidIn(List<Long> values) {
			addCriterion("EID in", values, "eid");
			return this;
		}

		public Criteria andEidNotIn(List<Long> values) {
			addCriterion("EID not in", values, "eid");
			return this;
		}

		public Criteria andEidBetween(Long value1, Long value2) {
			addCriterion("EID between", value1, value2, "eid");
			return this;
		}

		public Criteria andEidNotBetween(Long value1, Long value2) {
			addCriterion("EID not between", value1, value2, "eid");
			return this;
		}

		public Criteria andEtypeIsNull() {
			addCriterion("ETYPE is null");
			return this;
		}

		public Criteria andEtypeIsNotNull() {
			addCriterion("ETYPE is not null");
			return this;
		}

		public Criteria andEtypeEqualTo(String value) {
			addCriterion("ETYPE =", value, "etype");
			return this;
		}

		public Criteria andEtypeNotEqualTo(String value) {
			addCriterion("ETYPE <>", value, "etype");
			return this;
		}

		public Criteria andEtypeGreaterThan(String value) {
			addCriterion("ETYPE >", value, "etype");
			return this;
		}

		public Criteria andEtypeGreaterThanOrEqualTo(String value) {
			addCriterion("ETYPE >=", value, "etype");
			return this;
		}

		public Criteria andEtypeLessThan(String value) {
			addCriterion("ETYPE <", value, "etype");
			return this;
		}

		public Criteria andEtypeLessThanOrEqualTo(String value) {
			addCriterion("ETYPE <=", value, "etype");
			return this;
		}

		public Criteria andEtypeLike(String value) {
			addCriterion("ETYPE like", value, "etype");
			return this;
		}

		public Criteria andEtypeNotLike(String value) {
			addCriterion("ETYPE not like", value, "etype");
			return this;
		}

		public Criteria andEtypeIn(List<String> values) {
			addCriterion("ETYPE in", values, "etype");
			return this;
		}

		public Criteria andEtypeNotIn(List<String> values) {
			addCriterion("ETYPE not in", values, "etype");
			return this;
		}

		public Criteria andEtypeBetween(String value1, String value2) {
			addCriterion("ETYPE between", value1, value2, "etype");
			return this;
		}

		public Criteria andEtypeNotBetween(String value1, String value2) {
			addCriterion("ETYPE not between", value1, value2, "etype");
			return this;
		}

		public Criteria andFilenameIsNull() {
			addCriterion("FILENAME is null");
			return this;
		}

		public Criteria andFilenameIsNotNull() {
			addCriterion("FILENAME is not null");
			return this;
		}

		public Criteria andFilenameEqualTo(String value) {
			addCriterion("FILENAME =", value, "filename");
			return this;
		}

		public Criteria andFilenameNotEqualTo(String value) {
			addCriterion("FILENAME <>", value, "filename");
			return this;
		}

		public Criteria andFilenameGreaterThan(String value) {
			addCriterion("FILENAME >", value, "filename");
			return this;
		}

		public Criteria andFilenameGreaterThanOrEqualTo(String value) {
			addCriterion("FILENAME >=", value, "filename");
			return this;
		}

		public Criteria andFilenameLessThan(String value) {
			addCriterion("FILENAME <", value, "filename");
			return this;
		}

		public Criteria andFilenameLessThanOrEqualTo(String value) {
			addCriterion("FILENAME <=", value, "filename");
			return this;
		}

		public Criteria andFilenameLike(String value) {
			addCriterion("FILENAME like", value, "filename");
			return this;
		}

		public Criteria andFilenameNotLike(String value) {
			addCriterion("FILENAME not like", value, "filename");
			return this;
		}

		public Criteria andFilenameIn(List<String> values) {
			addCriterion("FILENAME in", values, "filename");
			return this;
		}

		public Criteria andFilenameNotIn(List<String> values) {
			addCriterion("FILENAME not in", values, "filename");
			return this;
		}

		public Criteria andFilenameBetween(String value1, String value2) {
			addCriterion("FILENAME between", value1, value2, "filename");
			return this;
		}

		public Criteria andFilenameNotBetween(String value1, String value2) {
			addCriterion("FILENAME not between", value1, value2, "filename");
			return this;
		}

		public Criteria andRealpathIsNull() {
			addCriterion("REALPATH is null");
			return this;
		}

		public Criteria andRealpathIsNotNull() {
			addCriterion("REALPATH is not null");
			return this;
		}

		public Criteria andRealpathEqualTo(String value) {
			addCriterion("REALPATH =", value, "realpath");
			return this;
		}

		public Criteria andRealpathNotEqualTo(String value) {
			addCriterion("REALPATH <>", value, "realpath");
			return this;
		}

		public Criteria andRealpathGreaterThan(String value) {
			addCriterion("REALPATH >", value, "realpath");
			return this;
		}

		public Criteria andRealpathGreaterThanOrEqualTo(String value) {
			addCriterion("REALPATH >=", value, "realpath");
			return this;
		}

		public Criteria andRealpathLessThan(String value) {
			addCriterion("REALPATH <", value, "realpath");
			return this;
		}

		public Criteria andRealpathLessThanOrEqualTo(String value) {
			addCriterion("REALPATH <=", value, "realpath");
			return this;
		}

		public Criteria andRealpathLike(String value) {
			addCriterion("REALPATH like", value, "realpath");
			return this;
		}

		public Criteria andRealpathNotLike(String value) {
			addCriterion("REALPATH not like", value, "realpath");
			return this;
		}

		public Criteria andRealpathIn(List<String> values) {
			addCriterion("REALPATH in", values, "realpath");
			return this;
		}

		public Criteria andRealpathNotIn(List<String> values) {
			addCriterion("REALPATH not in", values, "realpath");
			return this;
		}

		public Criteria andRealpathBetween(String value1, String value2) {
			addCriterion("REALPATH between", value1, value2, "realpath");
			return this;
		}

		public Criteria andRealpathNotBetween(String value1, String value2) {
			addCriterion("REALPATH not between", value1, value2, "realpath");
			return this;
		}

		public Criteria andUploadtimeIsNull() {
			addCriterion("UPLOADTIME is null");
			return this;
		}

		public Criteria andUploadtimeIsNotNull() {
			addCriterion("UPLOADTIME is not null");
			return this;
		}

		public Criteria andUploadtimeEqualTo(Date value) {
			addCriterion("UPLOADTIME =", value, "uploadtime");
			return this;
		}

		public Criteria andUploadtimeNotEqualTo(Date value) {
			addCriterion("UPLOADTIME <>", value, "uploadtime");
			return this;
		}

		public Criteria andUploadtimeGreaterThan(Date value) {
			addCriterion("UPLOADTIME >", value, "uploadtime");
			return this;
		}

		public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("UPLOADTIME >=", value, "uploadtime");
			return this;
		}

		public Criteria andUploadtimeLessThan(Date value) {
			addCriterion("UPLOADTIME <", value, "uploadtime");
			return this;
		}

		public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
			addCriterion("UPLOADTIME <=", value, "uploadtime");
			return this;
		}

		public Criteria andUploadtimeIn(List<Date> values) {
			addCriterion("UPLOADTIME in", values, "uploadtime");
			return this;
		}

		public Criteria andUploadtimeNotIn(List<Date> values) {
			addCriterion("UPLOADTIME not in", values, "uploadtime");
			return this;
		}

		public Criteria andUploadtimeBetween(Date value1, Date value2) {
			addCriterion("UPLOADTIME between", value1, value2, "uploadtime");
			return this;
		}

		public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
			addCriterion("UPLOADTIME not between", value1, value2, "uploadtime");
			return this;
		}

		public Criteria andOpertimeIsNull() {
			addCriterion("OPERTIME is null");
			return this;
		}

		public Criteria andOpertimeIsNotNull() {
			addCriterion("OPERTIME is not null");
			return this;
		}

		public Criteria andOpertimeEqualTo(Date value) {
			addCriterion("OPERTIME =", value, "opertime");
			return this;
		}

		public Criteria andOpertimeNotEqualTo(Date value) {
			addCriterion("OPERTIME <>", value, "opertime");
			return this;
		}

		public Criteria andOpertimeGreaterThan(Date value) {
			addCriterion("OPERTIME >", value, "opertime");
			return this;
		}

		public Criteria andOpertimeGreaterThanOrEqualTo(Date value) {
			addCriterion("OPERTIME >=", value, "opertime");
			return this;
		}

		public Criteria andOpertimeLessThan(Date value) {
			addCriterion("OPERTIME <", value, "opertime");
			return this;
		}

		public Criteria andOpertimeLessThanOrEqualTo(Date value) {
			addCriterion("OPERTIME <=", value, "opertime");
			return this;
		}

		public Criteria andOpertimeIn(List<Date> values) {
			addCriterion("OPERTIME in", values, "opertime");
			return this;
		}

		public Criteria andOpertimeNotIn(List<Date> values) {
			addCriterion("OPERTIME not in", values, "opertime");
			return this;
		}

		public Criteria andOpertimeBetween(Date value1, Date value2) {
			addCriterion("OPERTIME between", value1, value2, "opertime");
			return this;
		}

		public Criteria andOpertimeNotBetween(Date value1, Date value2) {
			addCriterion("OPERTIME not between", value1, value2, "opertime");
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

		public Criteria andEmpIdIsNull() {
			addCriterion("EMP_ID is null");
			return this;
		}

		public Criteria andEmpIdIsNotNull() {
			addCriterion("EMP_ID is not null");
			return this;
		}

		public Criteria andEmpIdEqualTo(String value) {
			addCriterion("EMP_ID =", value, "empId");
			return this;
		}

		public Criteria andEmpIdNotEqualTo(String value) {
			addCriterion("EMP_ID <>", value, "empId");
			return this;
		}

		public Criteria andEmpIdGreaterThan(String value) {
			addCriterion("EMP_ID >", value, "empId");
			return this;
		}

		public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
			addCriterion("EMP_ID >=", value, "empId");
			return this;
		}

		public Criteria andEmpIdLessThan(String value) {
			addCriterion("EMP_ID <", value, "empId");
			return this;
		}

		public Criteria andEmpIdLessThanOrEqualTo(String value) {
			addCriterion("EMP_ID <=", value, "empId");
			return this;
		}

		public Criteria andEmpIdLike(String value) {
			addCriterion("EMP_ID like", value, "empId");
			return this;
		}

		public Criteria andEmpIdNotLike(String value) {
			addCriterion("EMP_ID not like", value, "empId");
			return this;
		}

		public Criteria andEmpIdIn(List<String> values) {
			addCriterion("EMP_ID in", values, "empId");
			return this;
		}

		public Criteria andEmpIdNotIn(List<String> values) {
			addCriterion("EMP_ID not in", values, "empId");
			return this;
		}

		public Criteria andEmpIdBetween(String value1, String value2) {
			addCriterion("EMP_ID between", value1, value2, "empId");
			return this;
		}

		public Criteria andEmpIdNotBetween(String value1, String value2) {
			addCriterion("EMP_ID not between", value1, value2, "empId");
			return this;
		}

		public Criteria andStatutsIsNull() {
			addCriterion("STATUTS is null");
			return this;
		}

		public Criteria andStatutsIsNotNull() {
			addCriterion("STATUTS is not null");
			return this;
		}

		public Criteria andStatutsEqualTo(String value) {
			addCriterion("STATUTS =", value, "statuts");
			return this;
		}

		public Criteria andStatutsNotEqualTo(String value) {
			addCriterion("STATUTS <>", value, "statuts");
			return this;
		}

		public Criteria andStatutsGreaterThan(String value) {
			addCriterion("STATUTS >", value, "statuts");
			return this;
		}

		public Criteria andStatutsGreaterThanOrEqualTo(String value) {
			addCriterion("STATUTS >=", value, "statuts");
			return this;
		}

		public Criteria andStatutsLessThan(String value) {
			addCriterion("STATUTS <", value, "statuts");
			return this;
		}

		public Criteria andStatutsLessThanOrEqualTo(String value) {
			addCriterion("STATUTS <=", value, "statuts");
			return this;
		}

		public Criteria andStatutsLike(String value) {
			addCriterion("STATUTS like", value, "statuts");
			return this;
		}

		public Criteria andStatutsNotLike(String value) {
			addCriterion("STATUTS not like", value, "statuts");
			return this;
		}

		public Criteria andStatutsIn(List<String> values) {
			addCriterion("STATUTS in", values, "statuts");
			return this;
		}

		public Criteria andStatutsNotIn(List<String> values) {
			addCriterion("STATUTS not in", values, "statuts");
			return this;
		}

		public Criteria andStatutsBetween(String value1, String value2) {
			addCriterion("STATUTS between", value1, value2, "statuts");
			return this;
		}

		public Criteria andStatutsNotBetween(String value1, String value2) {
			addCriterion("STATUTS not between", value1, value2, "statuts");
			return this;
		}
	}
}