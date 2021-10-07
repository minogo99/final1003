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
				
	<form action="noticeList.cs" method="get">
			<div class="row justify-content-center">
		<div class="col-sm-2">
		<select name="whatColumn" class="form-select">
			<option value="all">전체 검색</option>
			<option value="division"
				<c:if test="${pageInfo.whatColumn == 'division'}">
		selected
		</c:if>>구분</option>
			<option value="subject"
				<c:if test="${pageInfo.whatColumn == 'subject'}">
		selected
		</c:if>>제목</option>
		</select>
		</div>
		<c:if test="${pageInfo.keyword == 'null'}">
			<div class="col-sm-2">
			<input type="text" class="form-control" name="keyword" value="">
			</div>
		</c:if>
		<c:if test="${pageInfo.keyword != 'null'}">
		<div class="col-sm-2">
			<input type="text" class="form-control" name="keyword" value="${pageInfo.keyword}">
		</div>
		</c:if>
		<div class="col-sm-1">
		<input type="submit" class="btn btn-primary" value="검색">
		</div>
		</div>
	</form>
	
		${pageInfo.pagingHtml}