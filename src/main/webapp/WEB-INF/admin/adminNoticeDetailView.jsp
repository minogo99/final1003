<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>
<style>
table {
	width: 100%;
	border: 1px solid #444444;
		border-width: 2px;
}

th, td {
	border: 1px solid #444444;
		border-width: 2px;
}

th {
	text-align: center;
	width: 60px;
}
</style>

<table>
	<tr>
		<th>구분</th>
		<td>${cnb.division }</td>
	</tr>
	<tr>
		<th>제목</th>
		<td>${cnb.subject }</td>
	</tr>
	<tr>
		<th>등록일</th>
		<td><fmt:parseDate value="${cnb.reg_date }" var="noticePostDate"
				pattern="yyyy-MM-dd" /> <fmt:formatDate value="${noticePostDate}"
				pattern="yyyy-MM-dd" var="reg_date" /> ${reg_date }</td>
	</tr>
	<tr>
		<th>내용</th>
		<td height="400">${cnb.content }</td>
	</tr>
</table>
<br>
<input type="button" class="btn btn-primary" value="목록"
		onclick="location.href='noticeList.admin'" style="float: right;">