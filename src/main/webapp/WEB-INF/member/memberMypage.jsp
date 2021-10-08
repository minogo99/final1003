<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
	.my{
		padding-left: 110px;
		padding-right: 110px;
	}



</style>
<%@ include file="../common/common.jsp"%>
<%@include file="../display/top.jsp"%>
<table class="table table-hover">
	<thead>
	<tbody>
		<tr align="center" >
			<td></td>
			<td></td>
			<td>${loginInfo.name }님</td>
			<td>구매한 콘텐츠</td>
			<td></td>
			<td></td>
		</tr>
	</tbody>
	</thead>
</table>
<div align="center" class="my">
<div align="left">
	<h5>시청 내역</h5>
	<div align="center">
		시청내역이 없어요
	</div>
</div>
<div align="left">
	<h5>찜한 컨텐츠</h5>
		<div align="center" >
		찜한 영화가 없어요
		</div>
</div>

</div>
<%@include file="../display/bottom.jsp"%>