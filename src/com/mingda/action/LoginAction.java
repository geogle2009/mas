package com.mingda.action;

import org.apache.log4j.Logger;

import com.mingda.dto.UserDTO;
import com.mingda.service.AuthorityService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final Logger log = Logger.getLogger(LoginAction.class);
	private UserDTO userDTO;
	private AuthorityService authorityService;

	public String login() {
		log.error("��¼��>>>>" + userDTO.getAccout());
		userDTO = authorityService.findUser(userDTO);
		if (null != userDTO) {
			ActionContext.getContext().getSession().put("user", userDTO);
			return SUCCESS;
		} else {
			this.addActionError("�û�������");
			return ERROR;
		}

	}

	public void validateLogin() {
		this.clearErrorsAndMessages();
		if (null != userDTO){
			if (null == userDTO.getAccout() || "".equals(userDTO.getAccout())) {
				this.addActionError("�û�������Ϊ��");
			}
		if (null == userDTO.getPwd() || "".equals(userDTO.getPwd())) {
			this.addActionError("���벻��Ϊ��");
		}}else{
			this.addActionError("����д��¼�������룡");
		}
	}

	public String loginOut() {
		return SUCCESS;
	}

	public AuthorityService getAuthorityService() {
		return authorityService;
	}

	public void setAuthorityService(AuthorityService authorityService) {
		this.authorityService = authorityService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
}
