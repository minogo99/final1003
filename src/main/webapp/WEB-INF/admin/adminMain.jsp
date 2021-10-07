<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>
<%@include file="display/top.jsp" %>
<style>
#adminMain{
text-align: center;
height: 100%;
padding: 100px;
}
</style>
<div class="container-fluid">
<div class="row">
<div class="col-sm-2">
<%@include file="display/left.jsp" %>
</div>
<div class="col-sm-10" id="adminMain">
<c:if test="${pageType == 'memberList' }">
<%@include file="adminMemberList.jsp" %>
</c:if>
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
</div>
</div>