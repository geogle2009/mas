package com.mingda.service;

import com.mingda.dto.UserDTO;

public interface AuthorityService {
	/**
	 * ��ѯ��¼��Ա��Ϣ
	 * 
	 * @return
	 */
	public UserDTO findUser(UserDTO userDTO);

	// �޸�����
	public void saveUserpwd(UserDTO userDTO);

	/**
	 * ͨ���˷����ж����ޱ������Ȩ��
	 * @param uRL
	 * @param organizationId
	 * @return
	 */
	public boolean checkReportRight(String uRL, String organizationId);
}
