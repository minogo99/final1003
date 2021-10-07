<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>
<%@include file="display/top.jsp" %>
<style>
#container{
height: 800px;
}
#adminMain{
text-align: center;
height: 100%;
border: 1px solid black;
padding: 100px;
}
</style>
<div class="row" id="container">
<div class="col-lg-2">
<%@include file="display/left.jsp" %>
</div>
<div id="adminMain" class="col-lg-10">
<c:if test="${pageType == 'boardList' }">
<%@include file="adminBoardList.jsp" %>
</c:if>
<c:if test="${pageType == 'noticeList' }">
<%@include file="adminCsNoticeList.jsp" %>
</c:if>
<c:if test="${pageType == 'faqList' }">
<%@include file="adminCsFaqList.jsp" %>
</c:if>
<c:if test="${pageType == 'main' }">
메인 페이지
</c:if>
</div>
</div>