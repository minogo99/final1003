<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="resources/bootstrap/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
a{ 
text-decoration:none;
color: white;
}
#member{
background-color: black;
text-align: right;
}
#top{
position:fixed;
width:100%;
z-index: 2;
}
#middlePage{
padding-top: 150px;
overflow:auto;
}
</style>
<div id="top">
<div id="member">
<%if(session.getAttribute("loginInfo") == null){ %>
<a href="login.member">로그인</a>
 / <a href="sign.member">회원가입</a>
<%}else{ %>
<a href="logout.member">로그아웃</a>
<%} %>
 / <a href="pay.voucher">이용권</a></div>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="main.wa"><img src="resources/images/logo2.png" width="80" height="80" /></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor02" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarColor02">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <a class="nav-link active" href="main.wa">홈
            <span class="visually-hidden">(current)</span>
          </a>
        </li>
          <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="true">카테고리</a>
          <div class="dropdown-menu">
            <a class="dropdown-item" href="movie.category">영화</a>
            <a class="dropdown-item" href="drama.category">드라마</a>
            <a class="dropdown-item" href="animation.category">애니메이션</a>
            <a class="dropdown-item" href="entertain.category">예능</a>
          </div>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="live.wa">Live</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.member">My</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="list.board">자유게시판</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-sm-2" type="text" placeholder="검색하기">
        <button class="btn btn-secondary my-2 my-sm-0" type="submit">검색</button>
      </form>
    </div>
  </div>
</nav>
</div>
<div id="middlePage">