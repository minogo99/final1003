<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../display/top.jsp"%>
<style>
#loginPage{
}
#login {
	width: 400px;
	height: 400px;
	margin: 30px auto;
}
</style>

<div id="loginPage">
<div id="login">
	<h2 align=center>로그인</h2>
	<form name="loginform" action="login.member" method="post">
		<fieldset>
			<div class="form-group">
				<label for="id" class="form-label mt-4">아이디</label>
				<input type="text" class="form-control" name="id" placeholder="아이디 입력">
			</div>
			<div class="form-group">
				<label for="password" class="form-label mt-4">비밀번호</label>
				<input type="password" class="form-control" name="password"
					placeholder="비밀번호 입력">
			</div>
		</fieldset>
		<br><br>
			<div align="center">
			<input type="submit" class="btn btn-primary" value="로그인">
			</div>
	</form>
<br>
<div align="center">
<a href="findid.member">아이디찾기</a> | <a href="findpw.member">비밀번호 찾기</a> | <a href="sign.member">회원가입</a>
</div>
</div>
</div>
<%@include file="../display/bottom.jsp"%>

