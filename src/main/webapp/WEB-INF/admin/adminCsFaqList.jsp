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
			<th scope="col">제목</th>
			<th scope="col">수정</th>
			<th scope="col">삭제</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="cfb" items="${lists_faq }" varStatus="status">
			<tr>
				<td>${cfb.division }</td>
				<td><a href="faqDetailView.cs?num=${cfb.num }">${cfb.subject }</a>
				</td>
				<td>수정</td>
				<td>삭제</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<br>

<form action="faqList.cs" method="get">
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
				<input type="text" class="form-control" name="keyword"
					value="${pageInfo.keyword}">
			</div>
		</c:if>
		<div class="col-sm-1">
			<input type="submit" class="btn btn-primary" value="검색">
		</div>
	</div>
</form>

${pageInfo.pagingHtml}
