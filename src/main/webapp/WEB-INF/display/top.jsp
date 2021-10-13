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

.dropbtn {
  background-color: black;
  color: white;
  font-size: 16px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: black;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: white;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content p {
	color:white;
	padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: black;}

</style>

<script type="text/javascript">
function openPop(){
    var popup = window.open("alert.wa", "알림창", "width=700px,height=800px,scrollbars=yes");
}
</script>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="top">
<div id="member">
<%if(session.getAttribute("loginInfo") == null){ %>
<a href="login.member">로그인</a>
 / <a href="sign.member">회원가입</a>
<%}else{ %>
<%@ include file="../common/common.jsp" %>
<div class="dropdown" align="center">
  <button class="dropbtn">${loginInfo.name}님</button>
  <div class="dropdown-content">
    <p align="center">${loginInfo.name}</p>
    <c:if test="${loginInfo.name eq '관리자'}" >
    	<a href="adminMain.admin">관리자 페이지</a>
    </c:if> 
      <c:if test="${loginInfo.name ne '관리자'}" >
    <a href="mypage.member?num=${loginInfo.num}&movie_title=${db.title}">마이페이지</a>
     
    <a href="userupdate.member?num=${loginInfo.num}">회원 정보 수정</a>
    <a href="#">시청기록</a>
    </c:if>
    <a href="#none" target="_blank" onclick="openPop()">알림함</a>
    <a href="logout.member">로그아웃</a>
  </div>
</div>

<%} %>
 / <a href="pay.voucher">이용권</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</div>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="main.wa"><img src="resources/images/logo3.jpg" width="80" height="80" /></a>
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
        <c:if test="${loginInfo.name ne null and loginInfo.name ne '관리자' }" >
          <a class="nav-link" href="mypage.member?num=${loginInfo.num}">My</a>
       </c:if>
        <c:if test="${loginInfo.name eq null}" >
          <a class="nav-link" href="login.member">My</a>
       </c:if>
       <c:if test="${loginInfo.name eq '관리자'}" >
    	<a class="nav-link" href="adminMain.admin">My</a>
    	</c:if> 
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