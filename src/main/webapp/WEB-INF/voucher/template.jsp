<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style type="text/css">
#tap{
	background-color: gray;
}
</style>
<%
	String contentPage=request.getParameter("contentPage");
%>

<%@include file="../display/top.jsp" %>

<form>
	<br><br>
	<div id=tap>
	<h4>이용권</h4><br>
	<h6>LIVE,VOD는 물론 이제 영화까지 wavve 이용권으로 더 넓은 콘텐츠 세상으로의 항해,wavve와 함께하세요!</h6>
	</div>
	<br>
	<hr color=gray>
	
	<table >
		<tr valign="bottom">
			<td><a href="pay.voucher">wavve이용권</a></td>
			<td><a href="coin.voucher">쿠폰.코인</a></td>
			<td><a href="wavveOn.voucher">웨이브온 이용권</a></td>
		</tr>
		
		<tr>
			<td>
				<table style="text-align: center;">
					<jsp:include page="<%=contentPage %>"/>
				</table>
			</td>
		</tr>
	</table>
</form>

<%@include file="../display/bottom.jsp" %>