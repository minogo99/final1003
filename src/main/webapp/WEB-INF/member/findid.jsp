<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../display/top.jsp" %>

<style>
#findIdPage{
}
#findId {
	width: 400px;
	height: 400px;
	margin: 30px auto;
}
</style>
<div id="findIdPage">
<div id="findId">
<form action="findid.member" method="post">
	<h2 align="center">본인인증</h2>
	<p>
	<label>이름</label>
	<input type="text" class="form-control" name="name" placeholder="이름 입력">
	</p>
	<br>
	<div align="center">
	<input type="submit" class="btn btn-primary" value="아이디 찾기">
	</div>
</form>
</div>
</div>
<%@ include file = "../display/bottom.jsp"%>