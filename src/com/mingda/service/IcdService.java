package com.mingda.service;

import java.util.List;
import com.mingda.dto.IcdDTO;

public interface IcdService {

	/**
	 * ���Ҳ���
	 * 
	 * @param
	 * @return
	 */
	public List<IcdDTO> queryicdmember(String sql, int intValue, String string);

	public String getToolsmenu();

	/**
	 * �޸Ĳ���
	 * 
	 * @param
	 * @return
	 */
	public IcdDTO editicdinfo(Integer icdId);

	public int editicd(IcdDTO icdDTO);

	/**
	 * ��������
	 * 
	 * @param
	 * @return
	 */
	public int addicd(IcdDTO icdDTO);

	/**
	 * ��ѯ���
	 * 
	 * @return
	 */
	public int findIcdSeq();
}
