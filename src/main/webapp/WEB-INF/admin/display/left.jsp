<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
*{margin:0; padding:0;}
ul{list-style: none;}
a{color: inherit; text-decoration: none;}
/* #wrap{width:100%; height: 100%; display:flex; flex-direction:row;flex-wrap: wrap; justify-items:flex-start;  align-items : stretch} */
img{max-width:100%;}
.first-box{width:100vw; height: 100vh; flex-grow: 0; flex-shrink: 0; display: flex;z-index:2; }
.first-box .left{flex-basis: 50vw; background : #ebece6; position:relative;}
.first-box .left ul{position:absolute; top:50%; width:100%; transform: translateY(-50%);}
.first-box .left li{line-height:50px; font-size:20px; text-align:center; font-weight:bold;}
.first-box .right{flex-basis: 50vw; background : #444; display:flex; flex-direction:column;  justify-content:center; align-items : center;}
.first-box .right p{color:#fff;text-align:center;}
.first-box .right p.p1{font-size:40px;}
.first-box .right p.p2{font-size:45px;}


#nav{width:20vw; height:100vh; position:fixed; top:0; left:0;z-index:-1; background:#fff; text-align:center;}
#nav ul li{line-height: 50px; font-weight:bold; font-size: 20px; }
.logoli{padding: 20px 0;}
.content{width: 80vw; float:right;}
</style>
<nav id="nav">
            <ul>
              <li class="logoli">
            <a href="/" class="logo"><img src="http://gahyun.wooga.kr/main/img/testImg/logoimg.png" alt=""></a></li>
                <li><a href="#">HOME</a></li>
                <li><a href="#">ABOUT</a></li>
                <li><a href="#">SERVICE</a></li>
                <li><a href="#">CONTACT</a></li>
            </ul>

    </nav>
    <div class="content">
      <img src="http://gahyun.wooga.kr/main/img/testImg/testImg1.jpg" alt="">
      <img src="http://gahyun.wooga.kr/main/img/testImg/tesImg2.jpg" alt="">
      <img src="http://gahyun.wooga.kr/main/img/testImg/testImg1.jpg" alt="">
      <img src="http://gahyun.wooga.kr/main/img/testImg/tesImg2.jpg" alt="">
    </div>
  </div>
  