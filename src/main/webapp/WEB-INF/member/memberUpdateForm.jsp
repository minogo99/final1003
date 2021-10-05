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
<script>
const checkSubmitDone = false;
function checkSubmit(form){
	if(checkSubmitDone){
		return;
	}
	form.password.value = form.password.value.trim();
	
	if(form.password.value.length == 0){
		alert('비밀번호를 입력하세요.');
		form.password.focus();
		
		return;
		
	}
	form.repassword.value = form.repassword.value.trim();
	
	if(form.repassword.value.length == 0){
		alert('비밀번호 확인을 입력하세요.');
		form.repassword.focus();
		
		return;
		
	}
	
	
	if(form.repassword.value != form.password.value){
		alert('비밀번호가 일치하지 않습니다.');
		form.repassword.focus();
		
		return;
		
	}
	form.submit();
	checkSubmitDone = ture; 
}
</script>
<h3 style="color:green; font-weight : bold;" align="center">회원 수정 화면</h3>

<form:form commandName="member" method="post" action="update.member" align="center"
onsubmit="checkSubmit(this); return false;" >
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
		<tr>
			<td>비밀번호 확인</td>
			<td><input type="text" name="repassword" id="repassword"
				value="${member.password}">
				 <form:errors cssClass="err" path="password" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="수정하기">
			<input type="button" onclick="history.go(-1);" value="취소"></td>
		</tr>
</table>
</form:form>