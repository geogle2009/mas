<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String jpath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ "/yljz/medicalafter/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sj:head jqueryui="true" />
<base href="<%=basePath%>" target="_self">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Pragma" content="no-cache">
<link rel="stylesheet" href="page/css/table-style.css" type="text/css"></link>
<title><s:property value="tempDTO.membername"></s:property>医后报销审批表</title>
</head>
<body>
<table width="710px" class="formTitle">
	<tr>
		<td style="padding-left: 2px"><img
			alt="<s:property value="tempDTO.membername"></s:property>医后报销审批表"
			border="0" src="page/images/aws-dev.gif" /><font
			class="formTitleFont"><s:property value="tempDTO.membername"></s:property>医后报销审批表</font>
			<font color="red">[当前状态：<s:property value="tempDTO.personstate"/>]&nbsp;[身份类别：<s:property value="tempDTO.assistTypeTxt"/>]</font>
		</td>
	</tr>
</table>
<table align="center" border="0" cellpadding="0" cellspacing="0"
	width="650px" class="formtable">
	<tr>
		<td class="formtd1" width="16%">家庭编号：</td>
		<td class="formtd2" width="16%"><s:property
			value="tempDTO.familyno"></s:property></td>
		<td class="formtd1" width="16%">姓名：</td>
		<td class="formtd2" width="16%"><s:property
			value="tempDTO.membername"></s:property></td>
		<td class="formtd1" width="16%">身份证号：</td>
		<td class="formtd2"><s:property value="tempDTO.paperid"></s:property></td>
	</tr>
	<tr>
		<td class="formtd1" width="16%">性别：</td>
		<td class="formtd2" width="16%"><s:property value="tempDTO.sex"></s:property></td>
		<td class="formtd1" width="16%">家庭地址：</td>
		<td class="formtd2" width="16%" colspan="3"><s:property
			value="tempDTO.address"></s:property></td>
	</tr>
	<tr>
		<td class="formtd1" width="16%">保险类型：</td>
		<td class="formtd2" colspan="5">
			<s:if test="tempDTO.medicareType==1">城镇医保</s:if>
			<s:if test="tempDTO.medicareType==2">新农合</s:if>
			<s:if test="tempDTO.medicareType==0">未参保/参合</s:if>
			<s:if test="tempDTO.medicareType==null">未知</s:if>
		</td>
	</tr>
	<tr>
		<td class="formtd1" width="16%">医院名称：</td>
		<td class="formtd2" colspan="5">
			<table align="left" height="20px" border="0" cellpadding="0" cellspacing="0" width="100%">
				<tr>
					<td class="formtd2" width="50%"><s:property value="tempDTO.hospitalname" /></td>
					<td class="formtd1" width="16%">医院类别:</td>
					<td class="formtd2" >
						<s:if test="tempDTO.hospitaltype==1">辖区内定点医院</s:if>
						<s:if test="tempDTO.hospitaltype==2">其它</s:if>
					</td>
				</tr>
			</table>	
		</td>
	</tr>
	<tr>
		<td class="formtd1" width="16%">开始时间：</td>
		<td class="formtd2"><s:date name="tempDTO.begintime"
			format="yyyy-MM-dd" /></td>
		<td class="formtd1" width="16%">结束时间：</td>
		<td class="formtd2" colspan="3"><s:date name="tempDTO.endtime"
			format="yyyy-MM-dd" /></td>
	</tr>
	<tr>
		<td class="formtd1" width="16%">救助类型：</td>
		<td class="formtd2" width="16%"><s:if test="tempDTO.assistype==1">门诊特殊大病
				</s:if> <s:if test="tempDTO.assistype==2">住院
				</s:if> <s:if test="tempDTO.assistype==3">临时救助
				</s:if></td>
		<td class="formtd1" width="16%">疾病救助类别：</td>
		<td class="formtd2" colspan="3">
			<s:if test="tempDTO.specBiz==0">普通救助</s:if>
			<s:if test="tempDTO.specBiz==1">重大疾病救助</s:if>	
		</td>
	</tr>
	<s:if test="tempDTO.org=='220506'">
	</s:if>
	<s:else>
	<tr>
		<td class="formtd1" width="16%">类别：</td>
		<td class="formtd2" colspan="5">
			<s:if test="tempDTO.diagnoseTypeId==48">外伤</s:if>
			<s:if test="tempDTO.diagnoseTypeId==49">未经医保/新农合确认的转诊</s:if>
			<s:if test="tempDTO.diagnoseTypeId==0">其它</s:if>
		</td>
	</tr>
	</s:else>
	<tr>
		<td class="formtd1" width="16%">患病名称：</td>
		<td class="formtd2" colspan="5">
			<s:property value="tempDTO.inhospitalsicken" />
		</td>
	</tr>
	<tr>
		<td class="formtd1" width="16%">总费用：</td>
		<td class="formtd2" width="16%"><s:property
			value="tempDTO.payTotal" /></td>
		<td class="formtd1" width="16%">统筹支付：</td>
		<td class="formtd2" width="16%"><s:property
			value="tempDTO.payMedicare" /></td>
		<td class="formtd1" width="16%">目录外费用：</td>
		<td class="formtd2"><s:property value="tempDTO.payOutmedicare" /></td>
	</tr>
	<tr>
		<td class="formtd1" colspan="3">本年累计住院救助金额:</td>
		<td class="formtd2" colspan="3"><s:property value="tempDTO.paySumAssistIn" /></td>
	</tr>
	<tr>
		<td class="formtd1" colspan="3">本年累计特殊门诊大病救助金额:</td>
		<td class="formtd2" colspan="3"><s:property value="tempDTO.paySumAssistOut" /></td>
	</tr>
	<tr>
		<td class="formtd1" colspan="3">本年累计纳入统筹救助范围(大病保险在此范围内):</td>
		<td class="formtd2" colspan="3"><s:property value="tempDTO.sumMedicareScope" /></td>
	</tr>
	<tr>
		<td class="formtd1" colspan="3">本次大病保险支付金额:</td>
		<td class="formtd2" colspan="3"><s:property value="tempDTO.payCIAssist" /></td>
	</tr>
	<tr>
		<td class="formtd1" width="16%">救助金额：</td>
		<td class="formtd2" width="16%"><s:property
			value="tempDTO.payAssist" /></td>
		<td class="formtd1" width="16%">&nbsp;</td>
		<td class="formtd2" width="16%">&nbsp;</td>
		<td class="formtd1" width="16%">审批结果：</td>
		<td class="formtd2">
			<s:if test="tempDTO.bizStatus==1">同意</s:if>
			<s:elseif test="tempDTO.bizStatus==-1">审批中</s:elseif>
			<s:elseif test="tempDTO.bizStatus==0">不同意</s:elseif></td>
	</tr>
	<tr>
		<td class="formtd1" width="16%">计算描述：</td>
		<td class="formtd2" colspan="5"><s:property value="tempDTO.calcMsg" /> &nbsp;</td>
	</tr>
	<tr>
		<td colspan="6"><s:iterator value="mafiles">
			<div align="left" style="height: 20px; display: block" id="dfile1">
			<a target="_blank" href="<%=jpath%><s:property value="realpath"/>">
			<s:property value="filename" /></a></div>
		</s:iterator></td>
	</tr>
</table>
<div align="center">
<button type="button" onclick="window.close()">关闭</button>
</div>
</body>
</html>