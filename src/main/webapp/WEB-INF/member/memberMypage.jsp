<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
	.my{
		width:70%;	
		margin: auto
	}
	table{
	height:20%;
	}

</style>
<%@ include file="../common/common.jsp"%>
<%@include file="../display/top.jsp"%>
<table class="table table-hover" >
	<thead>
	<tbody>
	<tr align="center" >
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
		<div align="center">
		시청내역이 없습니다.
		</div>
	</c:if>
	<br><hr><br>
</div>
<div align="left">
	<h5>찜한 컨텐츠</h5>
	<c:if test="${empty lists }">
		<div align="center">
		찜한 컨텐츠가 없습니다.
		</div>
	</c:if>
</div>

</div>
<%@include file="../display/bottom.jsp"%>