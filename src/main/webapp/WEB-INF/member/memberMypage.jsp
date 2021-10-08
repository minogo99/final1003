<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link
      rel="stylesheet"
      href="https://unpkg.com/swiper/swiper-bundle.min.css"
    />

<style>
	.my{
		
		width:70%;	
		margin: auto
	}
	table{
	height:20%;
	}
	
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
<%@ include file="../common/common.jsp"%>
<%@include file="../display/top.jsp"%>
<table class="table table-hover" >
	<thead>
	<tbody>
	<tr align="center" >
		<td>${loginInfo.name }님</td>		
		<td>구매한 컨텐츠</td>
	</tr>
	</tbody>
	</thead>
</table>
<div align="center" class="my">
<div align="left">
	<h5>시청 내역</h5>
	<div align="center">
		시청내역이 없어요
	</div>
	<br><hr><br>
</div>
<div align="left">
	<h5>찜한 컨텐츠</h5>
		<div align="center" >
		찜한 영화가 없어요
		</div>
</div>

</div>
<%@include file="../display/bottom.jsp"%>