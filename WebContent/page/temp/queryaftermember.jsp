<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="page/css/table-style.css" type="text/css"></link>
<title>医后报销申请查询</title>
</head>
<body>
<br/>
<br/>
<p align="center">
<s:form action="queryaftermember" method="post" theme="simple">
家庭编号：<s:textfield name="tempDTO.familyno"></s:textfield>&nbsp;&nbsp;&nbsp;&nbsp;<br/>
<br/>
身份证号：<s:textfield name="tempDTO.paperid"></s:textfield>&nbsp;&nbsp;&nbsp;&nbsp;<br/>
<br/>
<s:submit value="查询"></s:submit><br/>
<br/>
</s:form></p>
</body>
</html>