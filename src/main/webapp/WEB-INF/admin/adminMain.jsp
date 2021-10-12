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
<c:if test="${pageType == 'memberDetailView' }">
<%@include file="adminMemberDetailView.jsp" %>
</c:if>
<c:if test="${pageType == 'memberInsertForm' }">
<%@include file="adminMemberInsertForm.jsp" %>
</c:if>
<c:if test="${pageType == 'memberUpdateForm' }">
<%@include file="adminMemberUpdateForm.jsp" %>
</c:if>
<c:if test="${pageType == 'noticeList' }">
<%@include file="adminCsNoticeList.jsp" %>
</c:if>
<c:if test="${pageType == 'faqList' }">
<%@include file="adminCsFaqList.jsp" %>
</c:if>
<c:if test="${pageType == 'noticeWriteForm' }">
<%@include file="adminNoticeWriteForm.jsp" %>
</c:if>
<c:if test="${pageType == 'faqWriteForm' }">
<%@include file="adminFaqWriteForm.jsp" %>
</c:if>
<c:if test="${pageType == 'noticeUpdateForm' }">
<%@include file="adminNoticeUpdateForm.jsp" %>
</c:if>
<c:if test="${pageType == 'faqUpdateForm' }">
<%@include file="adminFaqUpdateForm.jsp" %>
</c:if>
<c:if test="${pageType == 'main' }">
메인 화면
</c:if>
</div>
</div>
</div>
</div>