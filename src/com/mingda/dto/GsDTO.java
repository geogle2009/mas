package com.mingda.dto;
/**
 * 
 * ��ʽ����
 *
 */
public class GsDTO {
 
	private String familyno;  //��ͥID
	private String membername;       //����
	private String paperid;         //���֤
	private String ssn;       //�籣ID
	private String sicken;    //��������
	private String address;       //��ͥ��ַ

	public String getFamilyno() {
		return familyno;
	}

	public void setFamilyno(String familyno) {
		this.familyno = familyno;
	}


	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getMembername() {
		return membername;
	}


	public String getPaperid() {
		return paperid;
	}

	public void setPaperid(String paperid) {
		this.paperid = paperid;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSicken() {
		return sicken;
	}

	public void setSicken(String sicken) {
		this.sicken = sicken;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
