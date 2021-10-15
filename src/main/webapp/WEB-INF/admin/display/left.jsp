<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<ul class="nav flex-column">
  <li class="nav-item">
  	<%@include file="clock.html" %>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="memberList.admin">회원관리</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="paymentList.voucher">구매관리</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="videoList.category">게시물관리</a>
  </li>
     <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
           게시판관리
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="noticeList.admin">공지사항</a></li>
            <li><a class="dropdown-item" href="faqList.admin">자주묻는질문</a></li>
          </ul>
        </li>
</ul>
