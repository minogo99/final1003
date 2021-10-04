<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="./../common/common.jsp"%>
<style type="text/css">
.err {
	font-size: 9pt;
	color: red;
	font-weight: bold;
}
</style>




<h3 style="color: green; font-weight: bold;" align="center">회원 추가 </h3>
<form:form name="f" commandName="member" method="post" action="insert.member" >
	<table border="1" align="center">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" value="${member.id}">
			 <form:errors cssClass="err" path="id" />
			 <button type="button">중복체크</button>
			 </td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value="${member.name}">
				<form:errors cssClass="err" path="name" /></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="password"
				value="${member.password}"> <form:errors cssClass="err"
					path="password" /></td>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="추가하기">
			<input type="button" onclick="history.go(-1);" value="취소"></td>
		</tr>
	</table>
</form:form>