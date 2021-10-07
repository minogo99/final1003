<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="display/top.jsp" %>
<style>
#container{
height: 600px;
}
#adminHome{
text-align: center;
height: 100%;
border: 1px solid black;
}
</style>
<div class="row" id="container">
<div class="col-lg-2">
<%@include file="display/left.jsp" %>
</div>
<div id="adminHome" class="col-lg-10">
관리자 홈
</div>
</div>