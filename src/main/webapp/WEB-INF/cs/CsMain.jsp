<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>
<%@include file="../display/top.jsp"%>
<script src="resources/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#faq').click(function(){
		location.href="faqList.cs";
	});
	$('#notice').click(function(){
		location.href="noticeList.cs";
	});
});
</script>
<style>
	#cs_title{
	 background-color: #252525;
	 padding: 10px;
	}
		#cs{
  margin:50px auto;
  width : 1200px;
	}
	#cs_content{
	margin:50px auto;
	}
  table {
  	width : 1200px;
    border-collapse: collapse;
    text-align: center;
  }
  th, td {
    border-bottom: 1px solid #F4FFFF;
    padding: 10px;
  }
	</style>
	<div id="cs_title"><h3 align="center">고객센터</h3></div>
	<div id="cs">
    <div id="cs_tab">
<ul class="nav nav-tabs">
  <li class="nav-item">
  <c:if test="${flag == 1 }">
  <a class="nav-link active" data-bs-toggle="tab" href="#notice_div" id="notice"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">공지사항</font></font></a>
  </c:if>
  <c:if test="${flag == 2 }">
    <a class="nav-link" data-bs-toggle="tab" href="#notice_div" id="notice"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">공지사항</font></font></a>
  </c:if>
  </li>
  <li class="nav-item">
    <c:if test="${flag == 2 }">
    <a class="nav-link active" data-bs-toggle="tab" href="#faq_div" id="faq"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">자주 묻는 질문 FAQ</font></font></a>
  	</c:if>
  	<c:if test="${flag == 1 }">
  	<a class="nav-link" data-bs-toggle="tab" href="#faq_div" id="faq"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">자주 묻는 질문 FAQ</font></font></a>
   </c:if>
  </li>
  <li class="nav-item">
    <a class="nav-link" data-bs-toggle="tab" href="#user_qna_div"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">1:1 문의</font></font></a>
  </li>
    <li class="nav-item">
    <a class="nav-link" data-bs-toggle="tab" href="#agreement_div"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">이용약관</font></font></a>
  </li>
</ul>
</div>
<div id="cs_content">
<div id="myTabContent" class="tab-content">
	<c:if test="${flag == 1 }">
  <div class="tab-pane fade active show" id="notice_div">
  <c:if test="${noticePage == 'list' }">
  <%@include file="CsNoticeList.jsp" %>
  </c:if>
  <c:if test="${noticePage == 'detailView' }">
  <%@include file="CsNoticeDetailView.jsp" %>
  </c:if>
  </div>
  </c:if>
      <c:if test="${flag == 2 }">
  <div class="tab-pane fade active show" id="faq_div">
  <c:if test="${faqPage == 'list' }">
<%@include file="CsFaqList.jsp" %>
</c:if>
  <c:if test="${faqPage == 'detailView' }">
<%@include file="CsFaqDetailView.jsp" %>
</c:if>
  </div>
  </c:if>
  <div class="tab-pane fade" id="user_qna_div">
    <p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">1:1문의</font></font></p>
  </div>
  <div class="tab-pane fade" id="agreement_div">
	<%@include file="CsAgreement.jsp" %>
  </div>
</div>
	</div>
	</div>

	<%@include file="../display/bottom.jsp"%>