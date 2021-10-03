<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>


<table id="noticeDetailView_table">
	<tr>
		<td>구분</td>
		<td>제목</td>
		<td>등록일</td>
	</tr>
	<tr>
	<td>${cnb.division }</td>
	<td>${cnb.subject }</td>
		<td><fmt:parseDate
				value="${cnb.reg_date }" var="noticePostDate" pattern="yyyy-MM-dd" />
			<fmt:formatDate value="${noticePostDate}" pattern="yyyy-MM-dd"
				var="reg_date" /> ${reg_date }
		</td>
	</tr>
	<tr>
		<td height="300" colspan="3" style="text-align: left;">${cnb.content }</td>
	</tr>
</table>
<br>
<input type="button" value="목록" onclick="location.href='noticeList.cs'"
	style="float: right;">