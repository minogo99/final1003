<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>
<table>
	<tr>
		<td>구분</td>
		<td>제목</td>
	</tr>
	<tr>
	<td>${cfb.division }</td>
	<td>${cfb.subject }</td>
	</tr>
	<tr>
		<td height="300" colspan="2" style="text-align: left;">${cfb.content }</td>
	</tr>
</table>
<br>
<input type="button" value="목록" onclick="location.href='faqList.cs'" style="float: right;">