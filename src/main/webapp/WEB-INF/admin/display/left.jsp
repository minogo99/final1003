<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
ul {
	list-style: none;
}

a {
	color: inherit;
	text-decoration: none;
}
#nav {
	width: 200px;
	height: 600px;
	position: fixed;
	top: 0;
	left: 0;
	z-index: 1;
	background: #fff;
	text-align: center;
}

#nav ul li {
	line-height: 50px;
	font-weight: bold;
	font-size: 20px;
}

.logoli {
	padding: 20px 0;
}
</style>
<nav id="nav">
	<ul>
		<li class="logoli"><a href="/" class="logo"><img
				src="http://gahyun.wooga.kr/main/img/testImg/logoimg.png" alt=""></a></li>
		<li><a href="#">HOME</a></li>
		<li><a href="memberList.member">회원관리</a></li>
		<li><a href="#">SERVICE</a></li>
		<li><a href="#">CONTACT</a></li>
	</ul>
</nav>