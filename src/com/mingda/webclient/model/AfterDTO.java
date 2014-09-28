package com.mingda.webclient.model;

import java.math.BigDecimal;
import java.util.Date;
/**
 *     /// ҽ���������
        /// </summary>
        /// <param name="OrgCode">���ڻ������</param>
        /// <param name="Hospital_ID">ҽԺID</param>
        /// <param name="MemberType">1�����У�2��ũ��</param>
        /// <param name="MemberID">��ԱID</param>
        /// <param name="MedicareType">1:ҽ����2����ũ�ϣ�0��δ�α��κ�</param>
        /// <param name="BizType">1�����2��סԺ</param>
        /// <param name="SpecBiz">0����ͨ������1���ش󼲲�����</param>
        /// <param name="Begin_Time">��ʼ��Ժʱ��</param>
        /// <param name="End_Time">��Ժʱ��</param>
        /// <param name="Diagnose_Type_ID">�������ID</param>
        /// <param name="Icd_ID">����ID</param>
        /// <param name="Pay_Total">�ܷ���</param>
        /// <param name="Pay_Medicare">ͳ��</param>
        /// <param name="Pay_OutMedicare">Ŀ¼�����</param>
����ֵ
                    new XElement("GetAssistMoneyAfter",
                        new XElement("ReturnFlag", "1"),
                        new XElement("ResultFlag", "1"),
                        new XElement("Message", "�ɹ�"),
                        new XElement("AssistMoney", CPay.Pay_Assist.ToString("f2")),
                        new XElement("AssistSum", CurrentSumAssist.ToString("f2")),
                        new XElement("AssistSumIn", CurrentSumAssistIn.ToString("f2")),
                        new XElement("AssistSumOut", CurrentSumAssistOut.ToString("f2")),
                        new XElement("AssistCIA", CPay.Pay_CIAssist.ToString("f2")),
                        new XElement("CalcMsg", CPay.Calc_Str)

AssistMoney�����ξ�����
AssistSum�������ۼ�
AssistSumIn������סԺ�ۼ�
AssistSumOut�����������ۼ�
AssistCIA�����δ󲡱���
CalcMsg����������
public string GetAssistMoneyAfter(string OrgCode, long Hospital_ID, string MemberType, string MemberID,
                    int BizType, string Begin_Time,  string End_Time,
                    int Diagnose_Type_ID, int Icd_ID,
                    Decimal Pay_Total,
                    Decimal Pay_Medicare,
                    Decimal Pay_OutMedicare)
        {

 * @author Administrator
 *
 */
public class AfterDTO {
	private String OrgCode;
	private long Hospital_ID;
	private String MemberType;
	private String MemberID;
	private String MedicareType;
	private int BizType;
	private int SpecBiz;
	private String Begin_Time;
	private String End_Time;
	private int Diagnose_Type_ID;
	private int Icd_ID;
	private BigDecimal Pay_Total;
	private BigDecimal Pay_Medicare;
	private BigDecimal Pay_OutMedicare;
	
	private String ReturnFlag;
	private String ResultFlag;
	private String Message;
	private BigDecimal AssistMoney;
	private BigDecimal AssistSum;
	private BigDecimal AssistSumIn;
	private BigDecimal AssistSumOut;
	private BigDecimal AssistCIA;
	private String CalcMsg;
	
	public String getOrgCode() {
		return OrgCode;
	}
	public void setOrgCode(String orgCode) {
		OrgCode = orgCode;
	}
	public Long getHospital_ID() {
		return Hospital_ID;
	}
	public void setHospital_ID(Long hospital_ID) {
		Hospital_ID = hospital_ID;
	}
	public String getMemberType() {
		return MemberType;
	}
	public void setMemberType(String memberType) {
		MemberType = memberType;
	}
	public String getMemberID() {
		return MemberID;
	}
	public void setMemberID(String memberID) {
		MemberID = memberID;
	}
	public String getMedicareType() {
		return MedicareType;
	}
	public void setMedicareType(String medicareType) {
		MedicareType = medicareType;
	}
	public Integer getBizType() {
		return BizType;
	}
	public void setBizType(Integer bizType) {
		BizType = bizType;
	}
	public Integer getSpecBiz() {
		return SpecBiz;
	}
	public void setSpecBiz(Integer specBiz) {
		SpecBiz = specBiz;
	}
	public String getBegin_Time() {
		return Begin_Time;
	}
	public void setBegin_Time(String begin_Time) {
		Begin_Time = begin_Time;
	}
	public String getEnd_Time() {
		return End_Time;
	}
	public void setEnd_Time(String end_Time) {
		End_Time = end_Time;
	}
	public Integer getDiagnose_Type_ID() {
		return Diagnose_Type_ID;
	}
	public void setDiagnose_Type_ID(Integer diagnose_Type_ID) {
		Diagnose_Type_ID = diagnose_Type_ID;
	}
	public Integer getIcd_ID() {
		return Icd_ID;
	}
	public void setIcd_ID(Integer icd_ID) {
		Icd_ID = icd_ID;
	}
	public BigDecimal getPay_Total() {
		return Pay_Total;
	}
	public void setPay_Total(BigDecimal pay_Total) {
		Pay_Total = pay_Total;
	}
	public BigDecimal getPay_Medicare() {
		return Pay_Medicare;
	}
	public void setPay_Medicare(BigDecimal pay_Medicare) {
		Pay_Medicare = pay_Medicare;
	}
	public BigDecimal getPay_OutMedicare() {
		return Pay_OutMedicare;
	}
	public void setPay_OutMedicare(BigDecimal pay_OutMedicare) {
		Pay_OutMedicare = pay_OutMedicare;
	}
	public String getReturnFlag() {
		return ReturnFlag;
	}
	public void setReturnFlag(String returnFlag) {
		ReturnFlag = returnFlag;
	}
	public String getResultFlag() {
		return ResultFlag;
	}
	public void setResultFlag(String resultFlag) {
		ResultFlag = resultFlag;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public BigDecimal getAssistMoney() {
		return AssistMoney;
	}
	public void setAssistMoney(BigDecimal assistMoney) {
		AssistMoney = assistMoney;
	}
	public BigDecimal getAssistSum() {
		return AssistSum;
	}
	public void setAssistSum(BigDecimal assistSum) {
		AssistSum = assistSum;
	}
	public BigDecimal getAssistSumIn() {
		return AssistSumIn;
	}
	public void setAssistSumIn(BigDecimal assistSumIn) {
		AssistSumIn = assistSumIn;
	}
	public BigDecimal getAssistSumOut() {
		return AssistSumOut;
	}
	public void setAssistSumOut(BigDecimal assistSumOut) {
		AssistSumOut = assistSumOut;
	}
	public BigDecimal getAssistCIA() {
		return AssistCIA;
	}
	public void setAssistCIA(BigDecimal assistCIA) {
		AssistCIA = assistCIA;
	}
	public String getCalcMsg() {
		return CalcMsg;
	}
	public void setCalcMsg(String calcMsg) {
		CalcMsg = calcMsg;
	}


}
