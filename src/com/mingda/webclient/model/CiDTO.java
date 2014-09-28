package com.mingda.webclient.model;

import java.math.BigDecimal;
/**
 *      /// <summary>
        /// �������֤������㵱��󲡱���
        /// </summary>
        /// <param name="PaperID">���֤����</param>
        /// <param name="MedicareType">�α��κ����ͣ�1��ҽ����2����ũ�ϡ�0��δ�α��κ�</param>
        /// <param name="CalcType">�������ͣ�1���������á�2���޸ķ���</param>
        /// <param name="Pay_Total">�޸�ǰ�ܷ���</param>
        /// <param name="Pay_Medicare">�޸�ǰͳ��֧��</param>
        /// <param name="Pay_OutMedicare">�޸�ǰĿ¼�����</param>
        /// <param name="Pay_Total">�����ܷ���</param>
        /// <param name="Pay_Medicare">����ͳ��֧��</param>
        /// <param name="Pay_OutMedicare">����Ŀ¼�����</param>
        /// <returns></returns>
        public string GetCIAssistByPaperID(string PaperID, string MedicareType, int CalcType,
                    Decimal Old_Pay_Total,
                    Decimal Old_Pay_Medicare,
                    Decimal Old_Pay_OutMedicare,
                    Decimal Pay_Total,
                    Decimal Pay_Medicare,
                    Decimal Pay_OutMedicare)

����ֵ��
<GetCIAssistByPaperID>
  <ReturnFlag>1</ReturnFlag>
  <ResultFlag>1</ResultFlag>
  <PaySumAssistIn>0</PaySumAssistIn>
  <PaySumAssistOut>0</PaySumAssistOut>
  <SumMedicareScope>1464531.17</SumMedicareScope>
  <PayCIAssist>1148425.466</PayCIAssist>
  <Pay_Sum_AssistScope_In>316105.704</Pay_Sum_AssistScope_In>
  <Pay_PreSum_AssistScope_In>0</Pay_PreSum_AssistScope_In>
</GetCIAssistByPaperID>

˵����ReturnFlag = 1����ȷ���أ�ʧ��=-1��ResultFlag����
      PaySumAssistIn�������ۼ�סԺ�������
      PaySumAssistOut�������ۼ���������󲡾������
      SumMedicareScope�������ۼ�����ͳ�������Χ���󲡱����ڴ˷�Χ�ڣ�
      PayCIAssist�����δ󲡱���֧�����
	  Pay_Sum_AssistScope_In: ��ǰ�ۼ����������Χ 
	  Pay_PreSum_AssistScope_In: ǰһ���ۼ����������Χ 
����ֵ��
��CalcType=1ʱ����Old_Pay_Total=0��Old_Pay_Medicare=0��Old_Pay_OutMedicare=0
��CalcType=1ʱ��Old_Pay_Total��Old_Pay_Medicare��Old_Pay_OutMedicareΪ�ñ�ҵ��ǰֵ��Pay_Total��Pay_Medicare��Pay_OutMedicareΪ�޸ĺ��ֵ��
 * @author Administrator
 *
 */
public class CiDTO {
	private BigDecimal pay_Total;
	private BigDecimal pay_Medicare;
	private BigDecimal pay_OutMedicare;
	private String paperID;
	private String medicareType;
	private int calcType;
	private BigDecimal old_Pay_Total;
	private BigDecimal old_Pay_Medicare;
	private BigDecimal old_Pay_OutMedicare;

	private BigDecimal paySumAssistIn;
	private BigDecimal PaySumAssistOut;
	private BigDecimal sumMedicareScope;
	private BigDecimal payCIAssist;
	private  BigDecimal pay_Sum_AssistScope_In;
	private  BigDecimal pay_PreSum_AssistScope_In;
	private String returnFlag;
	private String resultFlag;
	public BigDecimal getPay_Total() {
		return pay_Total;
	}
	public void setPay_Total(BigDecimal pay_Total) {
		this.pay_Total = pay_Total;
	}
	public BigDecimal getPay_Medicare() {
		return pay_Medicare;
	}
	public void setPay_Medicare(BigDecimal pay_Medicare) {
		this.pay_Medicare = pay_Medicare;
	}
	public BigDecimal getPay_OutMedicare() {
		return pay_OutMedicare;
	}
	public void setPay_OutMedicare(BigDecimal pay_OutMedicare) {
		this.pay_OutMedicare = pay_OutMedicare;
	}
	public String getPaperID() {
		return paperID;
	}
	public void setPaperID(String paperID) {
		this.paperID = paperID;
	}
	public String getMedicareType() {
		return medicareType;
	}
	public void setMedicareType(String medicareType) {
		this.medicareType = medicareType;
	}
	public int getCalcType() {
		return calcType;
	}
	public void setCalcType(int calcType) {
		this.calcType = calcType;
	}
	public BigDecimal getOld_Pay_Total() {
		return old_Pay_Total;
	}
	public void setOld_Pay_Total(BigDecimal old_Pay_Total) {
		this.old_Pay_Total = old_Pay_Total;
	}
	public BigDecimal getOld_Pay_Medicare() {
		return old_Pay_Medicare;
	}
	public void setOld_Pay_Medicare(BigDecimal old_Pay_Medicare) {
		this.old_Pay_Medicare = old_Pay_Medicare;
	}
	public BigDecimal getOld_Pay_OutMedicare() {
		return old_Pay_OutMedicare;
	}
	public void setOld_Pay_OutMedicare(BigDecimal old_Pay_OutMedicare) {
		this.old_Pay_OutMedicare = old_Pay_OutMedicare;
	}
	public BigDecimal getPaySumAssistIn() {
		return paySumAssistIn;
	}
	public void setPaySumAssistIn(BigDecimal paySumAssistIn) {
		this.paySumAssistIn = paySumAssistIn;
	}
	public BigDecimal getPaySumAssistOut() {
		return PaySumAssistOut;
	}
	public void setPaySumAssistOut(BigDecimal paySumAssistOut) {
		PaySumAssistOut = paySumAssistOut;
	}
	public BigDecimal getSumMedicareScope() {
		return sumMedicareScope;
	}
	public void setSumMedicareScope(BigDecimal sumMedicareScope) {
		this.sumMedicareScope = sumMedicareScope;
	}
	public BigDecimal getPayCIAssist() {
		return payCIAssist;
	}
	public void setPayCIAssist(BigDecimal payCIAssist) {
		this.payCIAssist = payCIAssist;
	}
	public BigDecimal getPay_Sum_AssistScope_In() {
		return pay_Sum_AssistScope_In;
	}
	public void setPay_Sum_AssistScope_In(BigDecimal pay_Sum_AssistScope_In) {
		this.pay_Sum_AssistScope_In = pay_Sum_AssistScope_In;
	}
	public BigDecimal getPay_PreSum_AssistScope_In() {
		return pay_PreSum_AssistScope_In;
	}
	public void setPay_PreSum_AssistScope_In(BigDecimal pay_PreSum_AssistScope_In) {
		this.pay_PreSum_AssistScope_In = pay_PreSum_AssistScope_In;
	}
	public String getReturnFlag() {
		return returnFlag;
	}
	public void setReturnFlag(String returnFlag) {
		this.returnFlag = returnFlag;
	}
	public String getResultFlag() {
		return resultFlag;
	}
	public void setResultFlag(String resultFlag) {
		this.resultFlag = resultFlag;
	}

	

}
