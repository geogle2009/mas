package com.mingda.service;

import java.util.List;

import com.mingda.dto.OrganizationDTO;
import com.mingda.dto.PayDTO;
import com.mingda.dto.RateDTO;
import com.mingda.dto.ReportDTO;
import com.mingda.dto.RoleDTO;

public interface ReportService {
   // ��ѯ�������
	public List<ReportDTO> findfeiyongcszhuyuan(String sql);
	
	public List<ReportDTO> findjiben(String sql);
	
	public List<ReportDTO> findduixiang(String sql);
	
	public List<ReportDTO> findjigou(String sql);
	
	public List<ReportDTO> findzongti(String sql);
	
	public List<ReportDTO> findbingzhong(String sql);
	
	public List<String> findQuarters();   //��ѯ���ݿ������м���
	
	public List<String> findMonth();    //��ѯ���ݿ��������·�
	
	public List<String> findDiagnose();    //��ѯ����
	
	public List<OrganizationDTO> findRegion(String level); //��ѯ����
	
	public List<OrganizationDTO> findRegion(String level,String orgID); //��ѯ�������µ���

 
	public List<ReportDTO> findjibenpnum(String sql1, List<ReportDTO> data);

	public List<ReportDTO> findyiliaojigou(String sql); //��ѯҽ�ƻ�����Ϣ
	
	public List<PayDTO> findPayviews(String sql);
	
	public List<RateDTO> findRate(String sql);

	List<PayDTO> findPayPersons(String sql, int i, String string);

	public String getToolsmenu();

	public List<PayDTO> findAllpaysByPer(String sql);
	
	public List<PayDTO> findPayInviews(String sql);
}
