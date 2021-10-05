<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="resources/bootstrap/js/bootstrap.bundle.min.js"></script>
<%@ include file="./../common/common.jsp" %>
<style>
	div{
		background-color: blue;
		color: white;
	}
</style>
<div>알림창</div>

<table align="center">


	<c:if test="${empty lists}">
		<tr align="center">
			<td colspan="8"><img src="resources/images/다운로드.png"> <br>
			알림이 없습니다.</td>
		</tr>
	</c:if>
		<c:forEach var="m" items="${lists}">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>국가</td>
			<td>장르</td>
			<td>등급</td>
			<td>배우</td>
		</tr>
		<tr>
			<td>${m.num }</td>
			<td>${m.title}</td>
			<td>${m.nation }</td>
			<td>${m.genre }</td>
			<td>${m.grade}</td>
			<td>${m.actor}</td>
		</tr>
	</c:forEach>


</table>