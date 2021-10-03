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
    </style>
  </head>

  <body>
    <!-- Swiper -->
    <div class="swiper mySwiper">
      <div class="swiper-wrapper">
        <div class="swiper-slide"><img src="resources/images/main1.jpg"></div>
        <div class="swiper-slide"><img src="resources/images/main2.jpg"></div>
        <div class="swiper-slide"><img src="resources/images/main3.jpg"></div>
        <div class="swiper-slide"><img src="resources/images/main4.jpg"></div>
        <div class="swiper-slide"><img src="resources/images/main5.jpg"></div>
        <div class="swiper-slide"><img src="resources/images/main6.jpg"></div>
        <div class="swiper-slide"><img src="resources/images/main7.jpg"></div>
        <div class="swiper-slide"><img src="resources/images/minari.jpg"></div>
        <div class="swiper-slide"><img src="resources/images/voice.jpg"></div>
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