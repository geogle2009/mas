/**
 * IServiceYljz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IServiceYljz extends java.rmi.Remote {
    public java.lang.String setHospitalVer(java.lang.Long hospital_ID, java.lang.String verNum) throws java.rmi.RemoteException;
    public java.lang.String changeHospitalAlert(java.lang.Long hospital_ID) throws java.rmi.RemoteException;
    public java.lang.String userLogin(java.lang.String account, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String getNewAccount() throws java.rmi.RemoteException;
    public java.lang.String userAdd(java.lang.Long hospital_ID, java.lang.String account, java.lang.String password, java.lang.String name, java.lang.String admin_Flag) throws java.rmi.RemoteException;
    public java.lang.String userDelete(java.lang.Long user_ID) throws java.rmi.RemoteException;
    public java.lang.String userUpdate(java.lang.Long user_ID, java.lang.String account, java.lang.String password, java.lang.String name, java.lang.String admin_Flag, java.lang.Integer sts) throws java.rmi.RemoteException;
    public java.lang.String getUserListByDept(java.lang.Long hospital_ID, java.lang.Integer userStatus) throws java.rmi.RemoteException;
    public java.lang.String assignUser(java.lang.Long user_ID, java.lang.String password, java.lang.String name, java.lang.String admin_Flag, java.lang.Integer sts) throws java.rmi.RemoteException;
    public java.lang.String getUserRightList(java.lang.Long hospital_ID) throws java.rmi.RemoteException;
    public java.lang.String setUserRight(java.lang.Long user_ID, java.lang.Integer right_ID, java.lang.Integer setType) throws java.rmi.RemoteException;
    public java.lang.String setOutRegBiz(java.lang.Long bizID, java.lang.Long outBizID) throws java.rmi.RemoteException;
    public java.lang.String setBizMedia(java.lang.Long bizID, java.lang.String mediaFile, java.lang.Integer mediaType) throws java.rmi.RemoteException;
    public java.lang.String getBizMedia(java.lang.Long bizID, java.lang.Integer mediaType) throws java.rmi.RemoteException;
    public java.lang.String getServerTime() throws java.rmi.RemoteException;
    public java.lang.String getFamilyNoByName(java.lang.String memberName) throws java.rmi.RemoteException;
    public java.lang.String getOrgDataByCode(java.lang.String orgCode) throws java.rmi.RemoteException;
    public java.lang.String getCIAssistByPaperID(java.lang.String paperID, java.lang.String medicareType, java.lang.Integer calcType, java.math.BigDecimal old_Pay_Total, java.math.BigDecimal old_Pay_Medicare, java.math.BigDecimal old_Pay_OutMedicare, java.math.BigDecimal pay_Total, java.math.BigDecimal pay_Medicare, java.math.BigDecimal pay_OutMedicare) throws java.rmi.RemoteException;
    public java.lang.String getBillData(java.lang.Long biz_id) throws java.rmi.RemoteException;
    public java.lang.String getMedBillData(java.lang.Long biz_id) throws java.rmi.RemoteException;
    public java.lang.String setBJzBillNo(java.lang.Long biz_id, java.lang.String bill_no, java.lang.Long user_ID) throws java.rmi.RemoteException;
    public java.lang.String getBillNo(java.lang.Integer bizType) throws java.rmi.RemoteException;
    public java.lang.String getConfirmListByHospital(java.lang.Long hospital_ID, java.lang.Integer viewType, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String confirmByHospital(java.lang.Long biz_id, java.lang.Integer confirmFlag, java.lang.String confirmDesc, java.lang.Long user_ID) throws java.rmi.RemoteException;
    public java.lang.String queryBiz(java.lang.Long hospital_ID, java.lang.Integer biz_Type, java.lang.Integer medicare_Type, java.lang.String family_No, java.lang.String name, java.lang.String id_Card, java.lang.String begin_Time1, java.lang.String begin_Time2, java.lang.String end_Time1, java.lang.String end_Time2, java.lang.String oper_Time1, java.lang.String oper_Time2, java.lang.Long user_ID) throws java.rmi.RemoteException;
    public java.lang.String getAssistSumByUser(java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String getAssistSumByHospital(java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String getAssistSumByHospitalOrg(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time, java.lang.Integer personType) throws java.rmi.RemoteException;
    public java.lang.String getAssistSumByMed(java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String getAssistSumByMedOrg(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time, java.lang.Integer personType) throws java.rmi.RemoteException;
    public java.lang.String getAssistListByHospital(java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time, java.lang.Integer personType) throws java.rmi.RemoteException;
    public java.lang.String getAssistListByHospitalOrg(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time, java.lang.Integer personType) throws java.rmi.RemoteException;
    public java.lang.String getAssistListByMed(java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String getAssistListByMedOrg(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time, java.lang.Integer personType) throws java.rmi.RemoteException;
    public java.lang.String getOutAssistListH2H(java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time, java.lang.Long out_Hospital_ID) throws java.rmi.RemoteException;
    public java.lang.String getOutAssistListH2M(java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time, java.lang.String orgID) throws java.rmi.RemoteException;
    public java.lang.String getOutAssistSumH2H(java.lang.Long hospital_ID, java.lang.Long outHospitalID, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String getOutAssistSumH2M(java.lang.Long hospital_ID, java.lang.String outOrgID, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String getOutAssistSum(java.lang.Long hospital_ID, java.lang.Long outHospitalID, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String getOutAssistSumOrg(java.lang.Long hospital_ID, java.lang.String outOrgID, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String getAcceptAssistListH2H(java.lang.Long hospital_ID, java.lang.String begin_time, java.lang.String end_time, java.lang.Long accept_Hospital_ID) throws java.rmi.RemoteException;
    public java.lang.String getAcceptAssistSumH2H(java.lang.Long hospital_ID, java.lang.Long acceptHospitalID, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String getAcceptAssistSum(java.lang.Long hospital_ID, java.lang.Long acceptHospitalID, java.lang.String begin_time, java.lang.String end_time) throws java.rmi.RemoteException;
    public java.lang.String hospitalCert(byte[] licenseKey) throws java.rmi.RemoteException;
    public java.lang.String getHospitalPayInfo(java.lang.Long hospital_ID, java.lang.String pay_time) throws java.rmi.RemoteException;
    public java.lang.String getHospitalLicFee(java.lang.Long hospital_ID) throws java.rmi.RemoteException;
    public java.lang.String getInpatientsList(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String memberType, java.lang.String memberID, java.lang.Integer queryType) throws java.rmi.RemoteException;
    public java.lang.String getInpatientsListByHospital(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.Integer queryType) throws java.rmi.RemoteException;
    public java.lang.String deleteInReg(java.lang.Long biz_id) throws java.rmi.RemoteException;
    public java.lang.String getRegFile(java.lang.Long biz_id) throws java.rmi.RemoteException;
    public java.lang.String outReg(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String memberType, java.lang.String memberID, java.lang.Long biz_id, java.lang.String outReason, java.lang.Long userID) throws java.rmi.RemoteException;
    public java.lang.String getOutRegListByHospital(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.Integer queryType, java.lang.String oper_Time1, java.lang.String oper_Time2) throws java.rmi.RemoteException;
    public java.lang.String deleteOutReg(java.lang.Long biz_id) throws java.rmi.RemoteException;
    public java.lang.String getOutRegByMember(java.lang.String memberType, java.lang.String memberID) throws java.rmi.RemoteException;
    public java.lang.String getOutRegNumByMember(java.lang.String memberType, java.lang.String memberID) throws java.rmi.RemoteException;
    public java.lang.String getOutHospitalList() throws java.rmi.RemoteException;
    public java.lang.String getOutMzOrgList() throws java.rmi.RemoteException;
    public java.lang.String getAcceptHospitalList() throws java.rmi.RemoteException;
    public java.lang.String getExistBiz(java.lang.String memberType, java.lang.String memberID) throws java.rmi.RemoteException;
    public java.lang.String getCheckStatus(java.lang.Long biz_id) throws java.rmi.RemoteException;
    public java.lang.String getStatInfoByMember(java.lang.String memberType, java.lang.String memberID) throws java.rmi.RemoteException;
    public java.lang.String getAssistMoney(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String memberType, java.lang.String memberID, java.lang.Long biz_id, java.lang.Long out_biz_id, java.lang.Integer bizType, java.lang.String begin_Time, java.lang.String dept_Name, java.lang.String area_Name, java.lang.Long icdID, java.lang.String diagnose_Code, java.lang.String diagnose_Name, java.lang.String end_Time, java.lang.String fin_Time, java.math.BigDecimal pay_Total, java.math.BigDecimal pay_Account, java.math.BigDecimal pay_Medicare, java.math.BigDecimal pay_Other, java.math.BigDecimal pay_OutMedicare, java.math.BigDecimal pay_MinLine, java.math.BigDecimal pay_Cash, java.lang.Integer gatherFlag, java.lang.Long user_ID) throws java.rmi.RemoteException;
    public java.lang.String getAssistMoneyMed(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String memberType, java.lang.String memberID, java.lang.Long biz_id, java.math.BigDecimal pay_Total, java.math.BigDecimal pay_Assist, java.math.BigDecimal pay_Balance, java.lang.Integer gatherFlag, java.lang.Long user_ID) throws java.rmi.RemoteException;
    public java.lang.String getAssistMoneyAfter(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String memberType, java.lang.String memberID, java.lang.String medicareType, java.lang.Integer bizType, java.lang.Integer specBiz, java.lang.String begin_Time, java.lang.String end_Time, java.lang.Integer diagnose_Type_ID, java.lang.Integer icd_ID, java.math.BigDecimal pay_Total, java.math.BigDecimal pay_Medicare, java.math.BigDecimal pay_OutMedicare) throws java.rmi.RemoteException;
    public java.lang.String getDupAssist(java.math.BigDecimal pay_Total, java.lang.String beginTime) throws java.rmi.RemoteException;
    public java.lang.String getAssistList(java.lang.Long hospital_ID, java.lang.String memberType, java.lang.String memberID, java.lang.Integer bizType, java.lang.String beginTime, java.lang.String endTime) throws java.rmi.RemoteException;
    public java.lang.String getAssistChargeByHospital(java.lang.Long hospital_ID, java.lang.Integer bizType, java.lang.String beginTime, java.lang.String endTime) throws java.rmi.RemoteException;
    public java.lang.String refundFee(java.lang.Long biz_id, java.lang.Long user_ID) throws java.rmi.RemoteException;
    public java.lang.String refundMedFee(java.lang.Long biz_id, java.lang.String memberType, java.lang.String memberID, java.math.BigDecimal payAssist, java.lang.Long user_ID) throws java.rmi.RemoteException;
    public java.lang.String getChargeListByUser(java.lang.Integer bizType, java.lang.Integer chargeType, java.util.Calendar beginTime, java.util.Calendar endTime, java.lang.Long user_ID) throws java.rmi.RemoteException;
    public java.lang.String queryOutDisease(java.lang.String orgCode) throws java.rmi.RemoteException;
    public java.lang.String queryDiagnoseType(java.lang.String orgCode) throws java.rmi.RemoteException;
    public java.lang.String queryDiagnoseTypeByBizID(java.lang.Long biz_id) throws java.rmi.RemoteException;
    public java.lang.String setDiagnoseTypeByBizID(java.lang.Long biz_id, java.lang.Long diagnose_type_id) throws java.rmi.RemoteException;
    public java.lang.String getData(java.lang.Integer value) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WcfYljz.CompositeType getDataUsingDataContract(org.datacontract.schemas._2004._07.WcfYljz.CompositeType composite) throws java.rmi.RemoteException;
    public java.lang.String getClientIp() throws java.rmi.RemoteException;
    public java.lang.String getOnline(java.lang.Long hospital_ID, java.lang.String hospital_Name) throws java.rmi.RemoteException;
    public java.lang.String writeLog(java.lang.Long hospital_ID, java.lang.String hospital_Name, java.lang.Long user_ID, java.lang.String user_Name, java.lang.String opt, java.lang.String opt_Para) throws java.rmi.RemoteException;
    public java.lang.String getPersonInfo(java.lang.Integer certType, java.lang.String orgCode, java.lang.String certNo) throws java.rmi.RemoteException;
    public java.lang.String getPersonInfoRemote(java.lang.Integer certType, java.lang.String orgCode, java.lang.String certNo) throws java.rmi.RemoteException;
    public java.lang.String getPersonInfoByAssistID(java.lang.String assistID, java.lang.String memberID) throws java.rmi.RemoteException;
    public java.lang.String getPersonInfoByIn(java.lang.Long hospital_ID, java.lang.Integer certType, java.lang.String orgCode, java.lang.String certNo) throws java.rmi.RemoteException;
    public java.lang.String getPharmacyAssist(java.lang.String memberType, java.lang.String memberID) throws java.rmi.RemoteException;
    public java.lang.String getPharmacyICD(java.lang.String memberType, java.lang.String memberID, java.lang.String orgCode) throws java.rmi.RemoteException;
    public java.lang.String setMemberMedicareInfo(java.lang.String memberType, java.lang.String memberID, java.lang.String medicareType, java.lang.String SSN) throws java.rmi.RemoteException;
    public java.lang.String getOrgCodeByFamilyNo(java.lang.String familyNo) throws java.rmi.RemoteException;
    public java.lang.String getDeptOrgByFamilyNo(java.lang.String familyNo, java.lang.Long hospitalID) throws java.rmi.RemoteException;
    public java.lang.String getDeptListByOrg(java.lang.String orgNo, java.lang.Integer deptType) throws java.rmi.RemoteException;
    public java.lang.String getOrgListByDept(java.lang.Long deptID) throws java.rmi.RemoteException;
    public java.lang.String getBizID() throws java.rmi.RemoteException;
    public java.lang.String getHospitalDept(java.lang.Long hospital_ID) throws java.rmi.RemoteException;
    public java.lang.String addHospitalDept(java.lang.Long hospital_ID, java.lang.String dept_Name) throws java.rmi.RemoteException;
    public java.lang.String deleteHospitalDept(java.lang.Long hospital_ID, java.lang.String dept_Name) throws java.rmi.RemoteException;
    public java.lang.String modifyHospitalDept(java.lang.Long hospital_ID, java.lang.String old_DeptName, java.lang.String new_DeptName) throws java.rmi.RemoteException;
    public java.lang.String getHospitalArea(java.lang.Long hospital_ID) throws java.rmi.RemoteException;
    public java.lang.String addHospitalArea(java.lang.Long hospital_ID, java.lang.String area_Name) throws java.rmi.RemoteException;
    public java.lang.String deleteHospitalArea(java.lang.Long hospital_ID, java.lang.String area_Name) throws java.rmi.RemoteException;
    public java.lang.String modifyHospitalArea(java.lang.Long hospital_ID, java.lang.String old_AreaName, java.lang.String new_AreaName) throws java.rmi.RemoteException;
    public java.lang.String getExistInReg(java.lang.String memberType, java.lang.String memberID) throws java.rmi.RemoteException;
    public java.lang.String checkInReg(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String memberType, java.lang.String memberID, java.lang.Long biz_id, java.lang.String beginTime, java.lang.String deptName, java.lang.String areaname, java.lang.String diagnoseCode, java.lang.String diagnoseName, java.lang.Integer gatherFlag, java.lang.Long userID) throws java.rmi.RemoteException;
    public java.lang.String checkInRegEx(java.lang.String orgCode, java.lang.Long hospital_ID, java.lang.String memberType, java.lang.String memberID, java.lang.Long biz_id, java.lang.String beginTime, java.lang.String deptName, java.lang.String areaname, java.lang.Integer diagnoseType, java.lang.String diagnoseCode, java.lang.String diagnoseName, java.lang.Integer gatherFlag, java.lang.Long userID) throws java.rmi.RemoteException;
}