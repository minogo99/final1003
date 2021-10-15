<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>

<style>
table {
	margin: auto;
	text-align: center;
}
</style>
<h2 style="color: #0080FF; font-weight: bold;">쿠폰 리스트</h2>
<br>
<table class="table">
	<thead class="table-light">
		<tr>
			<th scope="col">No</th>
			<th scope="col">쿠폰이름</th>
			<th scope="col">쿠폰번호</th>
			<th scope="col">할인율</th>
			<th scope="col">등록회원</th>
			<th scope="col">사용여부</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="cb" items="${lists }" varStatus="status">
			<tr>
				<td>${cb.cp_num}</td>
				<td>${cb.cp_name}</td>
				<td>${cb.cp_number}</td>
				<td>
				<fmt:formatNumber value="${cb.cp_discount}" type="percent"/>
				</td>
				<td>${cb.cp_id}</td>
				<td>${cb.cp_check}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<div align="right">
	<input type="button" class="btn btn-primary" value="쿠폰생성"
		onclick="location.href='couponGeneration.admin'">
</div>

<form action="couponList.admin" method="get">
	<div class="row justify-content-center">
		<div class="col-sm-2">
			<select name="whatColumn" class="form-select">
				<option value="all">전체 검색</option>
				<option value="cp_name"
					<c:if test="${pageInfo.whatColumn == 'cp_name'}">
		selected
		</c:if>>쿠폰이름</option>
				<option value="cp_number"
					<c:if test="${pageInfo.whatColumn == 'cp_number'}">
		selected
		</c:if>>쿠폰번호</option>
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
