<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="./../common/common.jsp"%>
<style>
table{
font-size: 20px;
}
th, td{
padding: 15px;
}
</style>
	<h2 style="color: green; font-weight: bold;" align="center">회원 상세 정보</h2>
	<input type="hidden" name="pageNumber" value="${pageNumber}">

	<table align="center">
		<tr>
			<th>번호</th>
			<td>${member.num}</td>
		</tr>
		<tr>
			<th>아이디</th>
			<td>${member.id}</td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td>${member.password}</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>${member.name}</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>${member.tel1}-${member.tel2}-${member.tel3}</td>
		</tr>
		<tr>
			<th>가입일시</th>
			<td>
			<fmt:parseDate value="${member.regdate }" var="noticePostDate" pattern="yyyy-MM-dd HH:mm" /> 
			<fmt:formatDate value="${noticePostDate}" pattern="yyyy-MM-dd HH:mm" var="regdate" /> 
			${regdate }
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="button" class="btn btn-primary" value="회원목록" onclick="location.href='memberList.admin?pageNumber=${pageNumber}'">
			</td>
		</tr>
	</table>


