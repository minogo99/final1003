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
<<<<<<< HEAD
  <div class="dropdown">
  <a class="nav-link dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">게시판관리</a>

  <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
    <li><a class="dropdown-item" href="list.board">자유게시판</a></li>
    <li><a class="dropdown-item" href="noticeList.cs">공지사항</a></li>
    <li><a class="dropdown-item" href="faqList.cs">FAQ</a></li>
  </ul>
</div>
</nav>
=======
  <a class="nav-link" href="#">게시판관리</a>
</nav>
>>>>>>> 16f66b68de217512622733ac610ff2720010542a
