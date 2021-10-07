<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ" crossorigin="anonymous"></script>
<nav class="nav flex-column">
	<%@include file="clock.html" %>
  <a class="nav-link active" aria-current="page" href="#">Active</a>
  <a class="nav-link" href="memberList.member">회원관리</a>
  <a class="nav-link" href="#">구매관리</a>
  <a class="nav-link" href="videoList.category">게시물관리</a>
  <a class="nav-link" href="#">게시판관리</a>
</nav>