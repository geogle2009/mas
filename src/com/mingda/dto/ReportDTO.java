package com.mingda.dto;

import java.math.BigDecimal;

public class ReportDTO {
	// -------- ����------------------------
	private BigDecimal ROWNUM;// ���
	private BigDecimal PNUM;// ����
	private BigDecimal TOTAL;// �ܷ���
	private BigDecimal OUTMEDICARE;// Ŀ¼�����
	private BigDecimal MEDICARE;// ҽ��
	private BigDecimal ASSIST;// ҽ�ƾ���
	private BigDecimal SELF;// ���˷���
	private String SUBSECTION;// ����
	// ---------����------------------------------
	private String PARENTORG; // �ϼ�������
	private BigDecimal ZHUYUANP; // סԺ��������
	private BigDecimal ZHUYUANM; // סԺ�������
	private BigDecimal MENZHENP; // �����������
	private BigDecimal MENZHENM; // ����������
	private BigDecimal YAODIANP; // ҩ���������
	private BigDecimal YAODIANM; // ҩ��������
	private BigDecimal LINSHIP; // ��ʱ��������
	private BigDecimal LINSHIM; // ��ʱ�������
	private String REGION; // ����
	private String REGIONNAME; // ��������
	private String ORGNAME; // �ϼ�����������
	// private BigDecimal PNUM; // �ͱ��˿�
	// ------------------����----------------------------
	// private String ORGNAME // ��������
	private String PARENTORGNAME; // �ϼ�����������
	private String ORGID; // ����ID
	private String PARENTORGID; // �ϼ�����ID
	private BigDecimal ZYSWRC; // סԺ�����˴�
	private BigDecimal ZYSWCBRC; // סԺ���޲α��˴�
	private BigDecimal ZYSWJE; // סԺ���޽��
	private BigDecimal ZYYBRC; // סԺһ���˴�
	private BigDecimal ZYYBCBRC; // סԺһ��α��˴�
	private BigDecimal ZYYBJE; // סԺһ����
	private BigDecimal MZSWRC; // ���������˴�
	private BigDecimal MZSWCBRC; // �������޲α��˴�
	private BigDecimal MZSWJE; // �������޽��
	private BigDecimal MZYBRC; // ����һ���˴�
	private BigDecimal MZYBCBRC; // ����һ��α��˴�
	private BigDecimal MZYBJE; // ����һ����
	private BigDecimal YDSWRC; // ҩ�������˴�
	private BigDecimal YDSWCBRC; // ҩ�����޲α��˴�
	private BigDecimal YDSWJE; // ҩ�����޽��
	private BigDecimal YDYBRC; // ҩ��һ���˴�
	private BigDecimal YDYBCBRC; // ҩ��һ��α��˴�
	private BigDecimal YDYBJE; // ҩ��һ����

	// ----------------------����--------------------------------
	// private BigDecimal ROWNUM; //���
	private BigDecimal HOSPITAL_ID; // ҽԺID
	private String NAME; // ҽԺ����
	private String DEPT_LEVEL; // ҽԺ����
	// private BigDecimal PNUM; //�˴�
	// private BigDecimal TOTAL; //�ܷ���
	// private BigDecimal OUTMEDICARE;//Ŀ¼�����
	// private BigDecimal MEDICARE;//ҽ��
	// private BigDecimal ASSIST;//ҽ�ƾ���
	// private BigDecimal SELF;//���˷���
	private String FULLNAME;// ����ȫ��
	// --------------------------------------------
	// private String PARENTORGNAME;
	// private String ORGNAME;
	private BigDecimal PNUM3;
	private BigDecimal PNUM2;
	private BigDecimal PNUM1;
	private BigDecimal PNUM0;
	private BigDecimal TOTAL3;
	private BigDecimal TOTAL2;
	private BigDecimal TOTAL1;
	private BigDecimal TOTAL0;
	private BigDecimal OUTMEDICARE3;
	private BigDecimal OUTMEDICARE2;
	private BigDecimal OUTMEDICARE1;
	private BigDecimal OUTMEDICARE0;
	private BigDecimal MEDICARE3;
	private BigDecimal MEDICARE2;
	private BigDecimal MEDICARE1;
	private BigDecimal MEDICARE0;
	private BigDecimal ASSIST3;
	private BigDecimal ASSIST2;
	private BigDecimal ASSIST1;
	private BigDecimal ASSIST0;
	private BigDecimal SELF3;
	private BigDecimal SELF2;
	private BigDecimal SELF1;
	private BigDecimal SELF0;

	// -----------------ҽ�ƻ��������----------------------------

	private String LEV; // ҽ�ƻ�������
	private String FLAG0; // �Ƿ�ǩԼ
	private String FLAG1; // �Ƿ��о�������
	private String FLAG2; // �Ƿ��ܼ�ʱ���㡢ҽ��
	private String FLAG3; // �Ƿ��ܼ�ʱ���㡢��ũ��
	private String FLAG4; // �Ƿ���԰�װ����ϵͳ

	// --------------------����----------------------------------
	// private BigDecimal ROWNUM; //���
	// private String ORGNAME; //��������
	// private String FULLNAME; //ȫ��
	// private String NAME; //����
	private String FAMILY_ADDRESS; // ��ͥסַ
	private String ID_CARD; // ���֤��
	private String PERSON_TYPE; // �ͱ�����
	private String DIAGNOSE_NAME; // ����
	private BigDecimal PAY_TOTAL; // �ܷ���
	private BigDecimal PAY_OUTMEDICARE; // Ŀ�������
	private BigDecimal PAY_MEDICARE; // ҽ��
	private BigDecimal PAY_ASSIST;// ����
	private BigDecimal PAY_SELF; // �ԷѲ���

	// ----------------------����--------------------------------
	private BigDecimal TOP; // �ﵽ �ⶥ����
	private BigDecimal LEVEL4; // ʡ������
	private BigDecimal LEVEL3; // �м��˴�
	private BigDecimal LEVEL2; // �ؼ�
	private BigDecimal LEVEL1; // ����

	public void setROWNUM(BigDecimal rOWNUM) {
		ROWNUM = rOWNUM;
	}

	public BigDecimal getROWNUM() {
		return ROWNUM;
	}

	public void setPNUM(BigDecimal pNUM) {
		PNUM = pNUM;
	}

	public BigDecimal getPNUM() {
		return PNUM;
	}

	public void setTOTAL(BigDecimal tOTAL) {
		TOTAL = tOTAL;
	}

	public BigDecimal getTOTAL() {
		return TOTAL;
	}

	public void setOUTMEDICARE(BigDecimal oUTMEDICARE) {
		OUTMEDICARE = oUTMEDICARE;
	}

	public BigDecimal getOUTMEDICARE() {
		return OUTMEDICARE;
	}

	public void setMEDICARE(BigDecimal mEDICARE) {
		MEDICARE = mEDICARE;
	}

	public BigDecimal getMEDICARE() {
		return MEDICARE;
	}

	public void setASSIST(BigDecimal aSSIST) {
		ASSIST = aSSIST;
	}

	public BigDecimal getASSIST() {
		return ASSIST;
	}

	public void setSELF(BigDecimal sELF) {
		SELF = sELF;
	}

	public BigDecimal getSELF() {
		return SELF;
	}

	public void setSUBSECTION(String sUBSECTION) {
		SUBSECTION = sUBSECTION;
	}

	public String getSUBSECTION() {
		return SUBSECTION;
	}

	public void setPARENTORG(String pARENTORG) {
		PARENTORG = pARENTORG;
	}

	public String getPARENTORG() {
		return PARENTORG;
	}

	public void setZHUYUANP(BigDecimal zHUYUANP) {
		ZHUYUANP = zHUYUANP;
	}

	public BigDecimal getZHUYUANP() {
		return ZHUYUANP;
	}

	public void setZHUYUANM(BigDecimal zHUYUANM) {
		ZHUYUANM = zHUYUANM;
	}

	public BigDecimal getZHUYUANM() {
		return ZHUYUANM;
	}

	public void setMENZHENP(BigDecimal mENZHENP) {
		MENZHENP = mENZHENP;
	}

	public BigDecimal getMENZHENP() {
		return MENZHENP;
	}

	public void setMENZHENM(BigDecimal mENZHENM) {
		MENZHENM = mENZHENM;
	}

	public BigDecimal getMENZHENM() {
		return MENZHENM;
	}

	public void setYAODIANP(BigDecimal yAODIANP) {
		YAODIANP = yAODIANP;
	}

	public BigDecimal getYAODIANP() {
		return YAODIANP;
	}

	public void setYAODIANM(BigDecimal yAODIANM) {
		YAODIANM = yAODIANM;
	}

	public BigDecimal getYAODIANM() {
		return YAODIANM;
	}

	public void setREGION(String rEGION) {
		REGION = rEGION;
	}

	public String getREGION() {
		return REGION;
	}

	public void setREGIONNAME(String rEGIONNAME) {
		REGIONNAME = rEGIONNAME;
	}

	public String getREGIONNAME() {
		return REGIONNAME;
	}

	public void setORGNAME(String oRGNAME) {
		ORGNAME = oRGNAME;
	}

	public String getORGNAME() {
		return ORGNAME;
	}

	public void setPARENTORGNAME(String pARENTORGNAME) {
		PARENTORGNAME = pARENTORGNAME;
	}

	public String getPARENTORGNAME() {
		return PARENTORGNAME;
	}

	public void setORGID(String oRGID) {
		ORGID = oRGID;
	}

	public String getORGID() {
		return ORGID;
	}

	public void setPARENTORGID(String pARENTORGID) {
		PARENTORGID = pARENTORGID;
	}

	public String getPARENTORGID() {
		return PARENTORGID;
	}

	public void setZYSWRC(BigDecimal zYSWRC) {
		ZYSWRC = zYSWRC;
	}

	public BigDecimal getZYSWRC() {
		return ZYSWRC;
	}

	public void setZYSWCBRC(BigDecimal zYSWCBRC) {
		ZYSWCBRC = zYSWCBRC;
	}

	public BigDecimal getZYSWCBRC() {
		return ZYSWCBRC;
	}

	public void setZYSWJE(BigDecimal zYSWJE) {
		ZYSWJE = zYSWJE;
	}

	public BigDecimal getZYSWJE() {
		return ZYSWJE;
	}

	public void setZYYBRC(BigDecimal zYYBRC) {
		ZYYBRC = zYYBRC;
	}

	public BigDecimal getZYYBRC() {
		return ZYYBRC;
	}

	public void setZYYBCBRC(BigDecimal zYYBCBRC) {
		ZYYBCBRC = zYYBCBRC;
	}

	public BigDecimal getZYYBCBRC() {
		return ZYYBCBRC;
	}

	public void setZYYBJE(BigDecimal zYYBJE) {
		ZYYBJE = zYYBJE;
	}

	public BigDecimal getZYYBJE() {
		return ZYYBJE;
	}

	public void setMZSWRC(BigDecimal mZSWRC) {
		MZSWRC = mZSWRC;
	}

	public BigDecimal getMZSWRC() {
		return MZSWRC;
	}

	public void setMZSWCBRC(BigDecimal mZSWCBRC) {
		MZSWCBRC = mZSWCBRC;
	}

	public BigDecimal getMZSWCBRC() {
		return MZSWCBRC;
	}

	public void setMZSWJE(BigDecimal mZSWJE) {
		MZSWJE = mZSWJE;
	}

	public BigDecimal getMZSWJE() {
		return MZSWJE;
	}

	public void setMZYBRC(BigDecimal mZYBRC) {
		MZYBRC = mZYBRC;
	}

	public BigDecimal getMZYBRC() {
		return MZYBRC;
	}

	public void setMZYBCBRC(BigDecimal mZYBCBRC) {
		MZYBCBRC = mZYBCBRC;
	}

	public BigDecimal getMZYBCBRC() {
		return MZYBCBRC;
	}

	public void setMZYBJE(BigDecimal mZYBJE) {
		MZYBJE = mZYBJE;
	}

	public BigDecimal getMZYBJE() {
		return MZYBJE;
	}

	public void setYDSWRC(BigDecimal yDSWRC) {
		YDSWRC = yDSWRC;
	}

	public BigDecimal getYDSWRC() {
		return YDSWRC;
	}

	public void setYDSWCBRC(BigDecimal yDSWCBRC) {
		YDSWCBRC = yDSWCBRC;
	}

	public BigDecimal getYDSWCBRC() {
		return YDSWCBRC;
	}

	public void setYDSWJE(BigDecimal yDSWJE) {
		YDSWJE = yDSWJE;
	}

	public BigDecimal getYDSWJE() {
		return YDSWJE;
	}

	public void setYDYBRC(BigDecimal yDYBRC) {
		YDYBRC = yDYBRC;
	}

	public BigDecimal getYDYBRC() {
		return YDYBRC;
	}

	public void setYDYBCBRC(BigDecimal yDYBCBRC) {
		YDYBCBRC = yDYBCBRC;
	}

	public BigDecimal getYDYBCBRC() {
		return YDYBCBRC;
	}

	public void setYDYBJE(BigDecimal yDYBJE) {
		YDYBJE = yDYBJE;
	}

	public BigDecimal getYDYBJE() {
		return YDYBJE;
	}

	public void setHOSPITAL_ID(BigDecimal hOSPITAL_ID) {
		HOSPITAL_ID = hOSPITAL_ID;
	}

	public BigDecimal getHOSPITAL_ID() {
		return HOSPITAL_ID;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getNAME() {
		return NAME;
	}

	public void setDEPT_LEVEL(String dEPT_LEVEL) {
		DEPT_LEVEL = dEPT_LEVEL;
	}

	public String getDEPT_LEVEL() {
		return DEPT_LEVEL;
	}

	public void setFULLNAME(String fULLNAME) {
		FULLNAME = fULLNAME;
	}

	public String getFULLNAME() {
		return FULLNAME;
	}

	public void setFAMILY_ADDRESS(String fAMILY_ADDRESS) {
		FAMILY_ADDRESS = fAMILY_ADDRESS;
	}

	public String getFAMILY_ADDRESS() {
		return FAMILY_ADDRESS;
	}

	public void setID_CARD(String iD_CARD) {
		ID_CARD = iD_CARD;
	}

	public String getID_CARD() {
		return ID_CARD;
	}

	public void setPERSON_TYPE(String pERSON_TYPE) {
		PERSON_TYPE = pERSON_TYPE;
	}

	public String getPERSON_TYPE() {
		return PERSON_TYPE;
	}

	public void setDIAGNOSE_NAME(String dIAGNOSE_NAME) {
		DIAGNOSE_NAME = dIAGNOSE_NAME;
	}

	public String getDIAGNOSE_NAME() {
		return DIAGNOSE_NAME;
	}

	public void setPAY_TOTAL(BigDecimal pAY_TOTAL) {
		PAY_TOTAL = pAY_TOTAL;
	}

	public BigDecimal getPAY_TOTAL() {
		return PAY_TOTAL;
	}

	public void setPAY_OUTMEDICARE(BigDecimal pAY_OUTMEDICARE) {
		PAY_OUTMEDICARE = pAY_OUTMEDICARE;
	}

	public BigDecimal getPAY_OUTMEDICARE() {
		return PAY_OUTMEDICARE;
	}

	public void setPAY_MEDICARE(BigDecimal pAY_MEDICARE) {
		PAY_MEDICARE = pAY_MEDICARE;
	}

	public BigDecimal getPAY_MEDICARE() {
		return PAY_MEDICARE;
	}

	public void setPAY_ASSIST(BigDecimal pAY_ASSIST) {
		PAY_ASSIST = pAY_ASSIST;
	}

	public BigDecimal getPAY_ASSIST() {
		return PAY_ASSIST;
	}

	public void setPAY_SELF(BigDecimal pAY_SELF) {
		PAY_SELF = pAY_SELF;
	}

	public BigDecimal getPAY_SELF() {
		return PAY_SELF;
	}

	public void setTOP(BigDecimal tOP) {
		TOP = tOP;
	}

	public BigDecimal getTOP() {
		return TOP;
	}

	public void setLEVEL3(BigDecimal lEVEL3) {
		LEVEL3 = lEVEL3;
	}

	public BigDecimal getLEVEL3() {
		return LEVEL3;
	}

	public void setLEVEL2(BigDecimal lEVEL2) {
		LEVEL2 = lEVEL2;
	}

	public BigDecimal getLEVEL2() {
		return LEVEL2;
	}

	public void setLEVEL1(BigDecimal lEVEL1) {
		LEVEL1 = lEVEL1;
	}

	public BigDecimal getLEVEL1() {
		return LEVEL1;
	}

	public void setPNUM3(BigDecimal pNUM3) {
		PNUM3 = pNUM3;
	}

	public BigDecimal getPNUM3() {
		return PNUM3;
	}

	public void setPNUM2(BigDecimal pNUM2) {
		PNUM2 = pNUM2;
	}

	public BigDecimal getPNUM2() {
		return PNUM2;
	}

	public void setPNUM1(BigDecimal pNUM1) {
		PNUM1 = pNUM1;
	}

	public BigDecimal getPNUM1() {
		return PNUM1;
	}

	public void setPNUM0(BigDecimal pNUM0) {
		PNUM0 = pNUM0;
	}

	public BigDecimal getPNUM0() {
		return PNUM0;
	}

	public void setTOTAL3(BigDecimal tOTAL3) {
		TOTAL3 = tOTAL3;
	}

	public BigDecimal getTOTAL3() {
		return TOTAL3;
	}

	public void setTOTAL2(BigDecimal tOTAL2) {
		TOTAL2 = tOTAL2;
	}

	public BigDecimal getTOTAL2() {
		return TOTAL2;
	}

	public void setTOTAL1(BigDecimal tOTAL1) {
		TOTAL1 = tOTAL1;
	}

	public BigDecimal getTOTAL1() {
		return TOTAL1;
	}

	public void setTOTAL0(BigDecimal tOTAL0) {
		TOTAL0 = tOTAL0;
	}

	public BigDecimal getTOTAL0() {
		return TOTAL0;
	}

	public void setOUTMEDICARE3(BigDecimal oUTMEDICARE3) {
		OUTMEDICARE3 = oUTMEDICARE3;
	}

	public BigDecimal getOUTMEDICARE3() {
		return OUTMEDICARE3;
	}

	public void setOUTMEDICARE2(BigDecimal oUTMEDICARE2) {
		OUTMEDICARE2 = oUTMEDICARE2;
	}

	public BigDecimal getOUTMEDICARE2() {
		return OUTMEDICARE2;
	}

	public void setOUTMEDICARE1(BigDecimal oUTMEDICARE1) {
		OUTMEDICARE1 = oUTMEDICARE1;
	}

	public BigDecimal getOUTMEDICARE1() {
		return OUTMEDICARE1;
	}

	public void setOUTMEDICARE0(BigDecimal oUTMEDICARE0) {
		OUTMEDICARE0 = oUTMEDICARE0;
	}

	public BigDecimal getOUTMEDICARE0() {
		return OUTMEDICARE0;
	}

	public void setMEDICARE3(BigDecimal mEDICARE3) {
		MEDICARE3 = mEDICARE3;
	}

	public BigDecimal getMEDICARE3() {
		return MEDICARE3;
	}

	public void setMEDICARE2(BigDecimal mEDICARE2) {
		MEDICARE2 = mEDICARE2;
	}

	public BigDecimal getMEDICARE2() {
		return MEDICARE2;
	}

	public void setMEDICARE1(BigDecimal mEDICARE1) {
		MEDICARE1 = mEDICARE1;
	}

	public BigDecimal getMEDICARE1() {
		return MEDICARE1;
	}

	public void setMEDICARE0(BigDecimal mEDICARE0) {
		MEDICARE0 = mEDICARE0;
	}

	public BigDecimal getMEDICARE0() {
		return MEDICARE0;
	}

	public void setASSIST3(BigDecimal aSSIST3) {
		ASSIST3 = aSSIST3;
	}

	public BigDecimal getASSIST3() {
		return ASSIST3;
	}

	public void setASSIST2(BigDecimal aSSIST2) {
		ASSIST2 = aSSIST2;
	}

	public BigDecimal getASSIST2() {
		return ASSIST2;
	}

	public void setASSIST1(BigDecimal aSSIST1) {
		ASSIST1 = aSSIST1;
	}

	public BigDecimal getASSIST1() {
		return ASSIST1;
	}

	public void setASSIST0(BigDecimal aSSIST0) {
		ASSIST0 = aSSIST0;
	}

	public BigDecimal getASSIST0() {
		return ASSIST0;
	}

	public void setSELF3(BigDecimal sELF3) {
		SELF3 = sELF3;
	}

	public BigDecimal getSELF3() {
		return SELF3;
	}

	public void setSELF2(BigDecimal sELF2) {
		SELF2 = sELF2;
	}

	public BigDecimal getSELF2() {
		return SELF2;
	}

	public void setSELF1(BigDecimal sELF1) {
		SELF1 = sELF1;
	}

	public BigDecimal getSELF1() {
		return SELF1;
	}

	public void setSELF0(BigDecimal sELF0) {
		SELF0 = sELF0;
	}

	public BigDecimal getSELF0() {
		return SELF0;
	}

	public void setLEVEL4(BigDecimal lEVEL4) {
		LEVEL4 = lEVEL4;
	}

	public BigDecimal getLEVEL4() {
		return LEVEL4;
	}

	public BigDecimal getLINSHIP() {
		return LINSHIP;
	}

	public void setLINSHIP(BigDecimal lINSHIP) {
		LINSHIP = lINSHIP;
	}

	public BigDecimal getLINSHIM() {
		return LINSHIM;
	}

	public void setLINSHIM(BigDecimal lINSHIM) {
		LINSHIM = lINSHIM;
	}

	public String getLEV() {
		return LEV;
	}

	public void setLEV(String lEV) {
		LEV = lEV;
	}

	public String getFLAG0() {
		return FLAG0;
	}

	public void setFLAG0(String fLAG0) {
		FLAG0 = fLAG0;
	}

	public String getFLAG1() {
		return FLAG1;
	}

	public void setFLAG1(String fLAG1) {
		FLAG1 = fLAG1;
	}

	public String getFLAG2() {
		return FLAG2;
	}

	public void setFLAG2(String fLAG2) {
		FLAG2 = fLAG2;
	}

	public String getFLAG3() {
		return FLAG3;
	}

	public void setFLAG3(String fLAG3) {
		FLAG3 = fLAG3;
	}

	public String getFLAG4() {
		return FLAG4;
	}

	public void setFLAG4(String fLAG4) {
		FLAG4 = fLAG4;
	}

}
