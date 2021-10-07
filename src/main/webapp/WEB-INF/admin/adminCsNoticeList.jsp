<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>

<style>
table {
	margin: auto;
	text-align: center;
}
</style>
	<table class="table">
	<thead class="table-light">
		<tr>
			<th scope="col">구분</th>
			<th scope="col" width="300">제목</th>
			<th scope="col">등록일</th>
			<th scope="col">수정</th>
			<th scope="col">삭제</th>
		</tr>
		</thead>
		<tbody>
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
						<td>
						<a>수정</a>
						</td>
						<td>
						<a  href="noticeDelete.cs?num=${cnb.num }">삭제</a>
						</td>

			</tr>
		</c:forEach>
		</tbody>
	</table>
	
		<div align="right">
			<input type="button" class="btn btn-primary" value="글쓰기"
				onclick="location.href='write.board'">
		</div>
				
	<form action="noticeList.admin" method="get">
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