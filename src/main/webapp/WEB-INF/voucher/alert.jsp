<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="./../common/common.jsp" %>
    <%@ page session="true" %>
    <script>
    alert("${msg}");
    if("${alertType}" == "coupon"){
    	location.href="coin.voucher";
    }else{
        location.href="login.member";
    }
	</script>
