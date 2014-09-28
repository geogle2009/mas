package com.mingda.service;

import java.util.HashMap;
import java.util.List;

import com.mingda.dto.AddrBookDTO;
import com.mingda.dto.BillDTO;
import com.mingda.dto.BizCheckDTO;
import com.mingda.dto.BizDTO;
import com.mingda.dto.GsDTO;
import com.mingda.dto.MediaDTO;
import com.mingda.dto.PayDTO;

public interface BaseBizService {
	/**
	 * ��ѯ���˵�
	 * 
	 * @param url
	 * @param i
	 * @param jwhere
	 * @return
	 */
	public List<BizDTO> findBizCheckAccounts(String jwhere, int i, String url);

	/**
	 * ������Ϣ
	 * 
	 * @param sql
	 * @return
	 */
	public String findInfo(String sql);

	public String getToolsmenu();

	/**
	 * 
	 * @param sql
	 * @param intValue
	 * @param string
	 * @return
	 */
	public List<BizCheckDTO> findMedicalMembers(String sql, int intValue,
			String string);

	/**
	 * 
	 * @param bizCheckDTO
	 */
	public void saveBizCheck(BizCheckDTO bizCheckDTO);

	/**
	 * 
	 * @param bizCheckDTO
	 * @return
	 */
	public BizCheckDTO findBizCheck(BizCheckDTO bizCheckDTO);

	/**
	 * 
	 * @param billDTO
	 * @return
	 */
	public List<BillDTO> findcheckaccounts(BillDTO billDTO);

	/**
	 * 
	 * @param bizDTO
	 * @return
	 */
	public List<PayDTO> findBizPayInfo(BizDTO bizDTO);

	/**
	 * 
	 * @param bizDTO
	 * @return
	 */
	public BizDTO findBiz(BizDTO bizDTO);

	/**
	 * 
	 * @param organizationId
	 * @return
	 */
	public List<GsDTO> findGsList(String organizationId);

	/**
	 * סԺ������ʽ
	 * 
	 * @param organizationId
	 * @return
	 */
	public List<BizDTO> findBizs(String sql);

	/**
	 * ͨ��ͨѶ��Ŀ��ѯͨѶ¼�б�
	 * 
	 * @param addrBookDTO
	 * @return
	 */
	public List<AddrBookDTO> findAddrBookList(String sql, int intValue,
			String string, String organizationId);

	/**
	 * ͨ����ԱID��ѯͨѶ¼
	 * 
	 * @param empId
	 * @return
	 */
	public AddrBookDTO findAddrBookById(Integer empId);

	/**
	 * �������
	 * 
	 * @param addrBookDTO
	 */

	public void saveAddrBook(AddrBookDTO addrBookDTO);

	/**
	 * 
	 * @param empId
	 */
	public void delAddrBook(Integer empId);
	
	/**
	 * ��ѯסԺ��������
	 * @param organizationId
	 * @param intValue
	 * @param string
	 * @return
	 */
	public List<BizCheckDTO> findInHospital(String organizationId,
			int intValue, String string);
	/**\
	 * ��ȡҵ��ͼƬ
	 * @param bizId
	 * @param picpath
	 * @return
	 */
	public List<MediaDTO> findBizPics(Integer bizId, String picpath);

	public List<BillDTO> findcheckaccountsc(BillDTO billDTO);

	public byte[] findBizBlob(String bizcheck, String cPic);

	public void saveCheckPic(String bizcheck, byte[] pic);

	public HashMap<String, String> queryCenterPoint(String organizationId);

	public List<BillDTO> queryHisPoint(String organizationId);
}
