<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../common/common.jsp"%>
<%@ include file="../display/top.jsp" %>
<style>
#findUserPage{
}
#findUser {
	width: 400px;
	height: 400px;
	margin: 30px auto;
}
</style>
<div id="findUserPage">
<div id="findUser">
<c:if test="${type == 'id' }">
찾는 비밀번호는 ${loginInfo.id } 입니다.
</c:if>
<c:if test="${type == 'password' }">
찾는 비밀번호는 ${loginInfo.password} 입니다.
</c:if>
<br>
	<input type="button" class="btn btn-primary" value="로그인" onclick="location.href='login.member'">
	</div>
	</div>
<%@ include file="../display/bottom.jsp" %>