<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
.my {
	width: 70%;
	margin: auto
}

table {
	height: 20%;
}

table {
	font-style: white;
}
</style>
<%@ include file="../common/common.jsp"%>
<%@include file="../display/top.jsp"%>
<table class="table table-hover">
	<thead>
	<tbody>
		<tr align="center">
			<td>${loginInfo.name }님</td>
			<td>구매한 컨텐츠</td>
		</tr>
	</tbody>
	</thead>
</table>
<div align="center" class="my">
	<div align="left">
		<h5>시청 내역</h5>
		<c:if test="${empty lists }">
			<div align="center">시청내역이 없습니다.</div>
		</c:if>
		<br>
		<hr>
		<br>
	</div>
	<div align="left">
		<h5>찜한 컨텐츠</h5>
		<table align="center">
					<tr>
			<c:if test="${empty cblists}">
					<td>찜한 컨텐츠가 없습니다.</td>
			</c:if>
				<c:forEach var="jjim" items="${cblists}">
					<td><img src="resources/images/poster/movie/${jjim.image}.jpg"
						width="200" height="200"></td>
				</c:forEach>
			</tr>
		</table>
	</div>

</div>
<%@include file="../display/bottom.jsp"%>