<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
payment_forward.jsp<br><br>

<jsp:forward page="template.jsp">
	<jsp:param value="payment.jsp" name="contentPage"/>
</jsp:forward>