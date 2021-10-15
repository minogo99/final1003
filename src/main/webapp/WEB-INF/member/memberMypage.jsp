<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
#my {
	width: 70%;
	margin: auto;
}
table{
	height: 20%;
	font-style: white;
}
</style>
<%@ include file="../common/common.jsp"%>
<%@include file="../display/top.jsp"%>
<div id="my">
	<table class="table table-hover">
		<tr>
			<td>${loginInfo.name }님</td>
			<td>구매한 컨텐츠</td>
		</tr>
	</table>
	<div align="left">
		<h5>시청 내역</h5>
		<div>
			<table>
				<tr>
				<c:if test="${empty wblists }">
						<td align="center">
							시청내역이 없습니다.
						</td>
				</c:if>
					<c:forEach var="watch" items="${wblists}">
						<td><a href="detail${fn:toUpperCase(fn:substring(watch.category, 0, 1))}${fn:toLowerCase(fn:substring(watch.category, 1,fn:length(watch.category)))}.category?num=${watch.movie_num}"><img src="resources/images/poster/${watch.image}"
							width="200" height="200"></a></td>
					</c:forEach>
				</tr>
				<tr>
					<td>
					<br>
					<a href="deletewatch.member?num=${loginInfo.num }"><button class="btn btn-primary">시청기록 지우기</button></a>
								</td>
				</tr>
			</table>
		</div>
		<hr>
	</div>
	<div align="left">
		<h5>찜한 컨텐츠</h5>
		<table>
			<tr>
				<c:if test="${empty cblists}">
					<td>찜한 컨텐츠가 없습니다.</td>
				</c:if>
				<c:forEach var="jjim" items="${cblists}">
					<td><a href="detail${fn:toUpperCase(fn:substring(jjim.category, 0, 1))}${fn:toLowerCase(fn:substring(jjim.category, 1,fn:length(jjim.category)))}.category?num=${jjim.movie_num}"><img src="resources/images/poster/${jjim.image}"
						width="200" height="200"></a></td>
				</c:forEach>
			</tr>
		</table>
	</div>
</div>
<%@include file="../display/bottom.jsp"%>