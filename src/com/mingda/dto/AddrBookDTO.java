package com.mingda.dto;

public class AddrBookDTO {
	private Integer empId;
	private String organizationId;//������
	private String name;//����
	private String duty;//ְ��
	private String workPhone;//�칫�绰
	private String mobilePhone;//�ֻ�
	private String sts;//����֪ͨ����״̬��0�����ã�1�����ã�
	private String orgname; //��������
	private String privilege;//Ȩ��
	private String stsval ; //����ֵ֪ͨ
	private String dutyval; //ְ��ֵ

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getSts() {
		return sts;
	}

	public void setSts(String sts) {
		this.sts = sts;
	}
	
	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	
	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String pivilege) {
		this.privilege = pivilege;
	}

	public void setStsval(String stsval) {
		this.stsval = stsval;
	}

	public String getStsval() {
		return stsval;
	}

	public void setDutyval(String dutyval) {
		this.dutyval = dutyval;
	}

	public String getDutyval() {
		return dutyval;
	}
	
}
