<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../common/common.jsp"%>


	<table id="notice_table">
		<tr>
			<td>구분</td>
			<td width="300">제목</td>
			<td>등록일</td>
		</tr>

		<c:forEach var="cnb" items="${lists }" varStatus="status">
			<tr>
				<td>${cnb.division }</td>
				<td width="300"><a
					href="noticeDetailView.cs?num=${cnb.num }">${cnb.subject }</a>
				</td>
				<td><fmt:parseDate value="${cnb.reg_date }" var="noticePostDate"
						pattern="yyyy-MM-dd" /> <fmt:formatDate
						value="${noticePostDate}" pattern="yyyy-MM-dd"
						var="reg_date" /> ${reg_date }</td>
			</tr>
		</c:forEach>
	</table>
	<br>
				<input type="button" onclick="location.href='write.cs'" value="글쓰기" style="float: right;">
				
	<p align="center">${pageInfo.pagingHtml}</p>
	
	<form action="noticeList.cs" method="get" align="center">
		<select name="whatColumn">
			<option value="all">전체 검색</option>
			<option value="subject"
				<c:if test="${pageInfo.whatColumn == 'subject'}">
		selected
		</c:if>>작성자</option>
			<option value="content"
				<c:if test="${pageInfo.whatColumn == 'content'}">
		selected
		</c:if>>제목</option>
		</select> <input type="text" name="keyword" value="${pageInfo.keyword}">
		<input type="submit" value="검색">
	</form>
	