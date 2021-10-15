<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../display/top.jsp" %>
<link
      rel="stylesheet"
      href="https://unpkg.com/swiper/swiper-bundle.min.css"
    />

    <!-- Demo styles -->
    <style>
      html,
      body {
        position: relative;
        height: 80%;
      }

      body {
        background: black;
        font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
        font-size: 14px;
        color: #000;
        margin: 0;
        padding: 0;
      }

      .swiper {
        width: 70%;
        height: 100%;
      }

      .swiper-slide {
        text-align: center;
        background: black;

        /* Center slide text vertically */
        display: -webkit-box;
        display: -ms-flexbox;
        display: -webkit-flex;
        display: flex;
        -webkit-box-pack: center;
        -ms-flex-pack: center;
        -webkit-justify-content: center;
        justify-content: center;
        -webkit-box-align: center;
        -ms-flex-align: center;
        -webkit-align-items: center;
        align-items: center;
      }

      .swiper-slide img {
        display: block;
        width: 100%;
        height: 100%;
        object-fit: cover;
      }
      
       //------- 서종희-------------------------------------------------------
    .movie_chart{
   		
   }
   
   .chart_cont1{
	  
   }
   
   .chart_cont1 > div {
	   
   }
   
   .poster{
   		
	   	width:292px;
	   	height: 592px;
	  	border:1px solid #c4c4c4;
   	

   }
   
   .poster_img{
   		position:relative;
   		width:292px;
		height: 592px;
   }
   
   .infor {
   		
   		background: #fff;
   		padding:17px; 
   		border: 1px solid #c4c4c4; 
   		width:292px; 
   }
   
   .infor > h3{
   		color: #333; font-size:30px; font-weight: 700;margin-bottom: 20px;
   }
 
   .infor > h3 > span{
   		width: 29px;height: 29px;display: inline-block; margin-top: 9px; 
   		
   }
      
    </style>
  </head>
<%@include file="./../common/common.jsp" %>
  <body>
    <!-- Swiper -->
    <div class="swiper mySwiper">
      <div class="swiper-wrapper">
        <c:forEach var="vlist" items="${lists }" >
       	 	<div class="swiper-slide"><a href="detailDrama.category?num=${vlist.num }">
       	 	<img src="resources/images/poster/${vlist.image }"></a></div>
        </c:forEach>
      </div>
      <div class="swiper-button-next"></div>
      <div class="swiper-button-prev"></div>
      <div class="swiper-pagination"></div>
    </div>

    <!-- Swiper JS -->
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

    <!-- Initialize Swiper -->
    <script>
      var swiper = new Swiper(".mySwiper", {
        slidesPerView: 3,
        spaceBetween: 30,
        slidesPerGroup: 3,
        loop: true,
        loopFillGroupWithBlank: true,
        pagination: {
          el: ".swiper-pagination",
          clickable: true,
        },
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev",
        },
      });
    </script>
  </body>
  
		
  
<%@include file="../display/bottom.jsp" %>