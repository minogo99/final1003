<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../admin/display/top.jsp" %>
<%@include file="./../common/common.jsp"%>


<style>
#container{
height: 600px;
}
#memberList{
text-align: center;
height: 100%;
border: 1px solid black;
padding: 100px;
}
table{
margin: auto;
text-align: center;
}
</style>
<div class="row" id="container">
	<div class="col-lg-2">
		<%@include file="../admin/display/left.jsp" %>
	</div>
<div id="videoList" class="col-lg-10" align="center">
	<h2 style="color:#0080FF; font-weight: bold;">상세보기</h2>
<table border="1" align="center" width="600" class="table">
	<thead class="table-light">
	<tbody>
	<tr>
		<th>영상 이미지</th>
		<td><img src="resources/images/poster/${cb.image }" width="130" height="130"> </td>
	</tr>
	<tr>
		<th>제목</th>
		<td>${cb.title } </td>
	</tr>
	<tr>
		<th>카테고리</th>
		<td>${cb.category }</td>
	</tr>
	<tr>
		<th>연령 제한</th>
		<td>${cb.grade } </td>
	</tr>
	<tr>
		<th>장르</th>
		<td>${db.genre } </td>
	</tr>
	<tr>
		<th>국가</th>
		<td>${db.nation } </td>
	</tr>
	<tr>
		<th>러닝타임</th>
		<td>${db.runningT } </td>
	</tr>
	<tr>
		<th>부작</th>
		<td>${db.series } </td>
	</tr>
	<tr>
		<th>내용</th>
		<td>${db.content } </td>
	</tr>
	</tbody>
	</thead>
</table>
${pageInfo.pagingHtml }
</div>
</div>

