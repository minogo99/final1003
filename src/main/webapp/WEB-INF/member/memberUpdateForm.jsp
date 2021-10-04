<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@include file="./../common/common.jsp" %>     

<style type="text/css">
		.err{
		font-size: 9pt;
		color: red;
		font-weight: bold;
		}
</style>
<h3 style="color:green; font-weight : bold;" align="center">회원 수정 화면</h3>

<form:form commandName="member" method="post" action="update.member" align="center" >
	<input type="hidden" name="pageNumber" value="${pageNumber}">
	<input type="hidden" name="num" value="${member.num}">

<table border="1" align="center">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" value="${member.id}"> 
			<form:errors cssClass="err" path="id" /></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value="${member.name}">
				<form:errors cssClass="err" path="name" /></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="password" value="${member.password}">
			 <form:errors cssClass="err" path="password" /></td>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="수정하기">
			<input type="button" onclick="history.go(-1);" value="취소"></td>
		</tr>
</table>
</form:form>