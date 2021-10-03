<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>

<form action="CsFaqList.jsp" method="get" align="center">
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

	<table id="faq_table">
		<tr>
			<td>구분</td>
			<td>제목</td>
		</tr>

		<c:forEach var="cfb" items="${lists_faq }" varStatus="status">
			<tr>
				<td>${cfb.division }</td>
				<td><a
					href="faqDetailView.cs?num=${cfb.num }">${cfb.subject }</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br>
				<input type="button" onclick="location.href='write.cs'" value="글쓰기" style="float: right;">
				
	<p align="center">${pageInfo.pagingHtml}</p>