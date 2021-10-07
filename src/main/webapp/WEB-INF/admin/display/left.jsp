<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="nav flex-column">
  <a class="nav-link active" aria-current="page" href="#">Active</a>
  <a class="nav-link" href="memberList.admin">회원관리</a>
  <a class="nav-link" href="#">구매관리</a>
  <a class="nav-link" href="videoList.category">게시물관리</a>
  <div class="dropdown">
  <a class="nav-link dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">게시판관리</a>

  <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
    <li><a class="dropdown-item" href="boardList.admin">자유게시판</a></li>
    <li><a class="dropdown-item" href="noticeList.admin">공지사항</a></li>
    <li><a class="dropdown-item" href="faqList.admin">FAQ</a></li>
  </ul>
</div>
</nav>

