<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
detailAni.jsp<br>

<style type="text/css">
	.poster{
   		
	   	width:150px;
	   	height: 300px;
	  	border:1px solid #c4c4c4;
   	

   }
   
   .poster_img{
   		position:relative;
   		width:150px;
		height: 300px;
   }
   .infor {
   		
   		background: #fff;
   		padding:17px; 
   		border: 1px solid #c4c4c4; 
   		width:392px; 
   }
   
   .infor > h3{
   		color: #333; font-size:30px; font-weight: 700;margin-bottom: 20px;
   }
 
   .infor > h3 > span{
   		width: 29px;height: 29px;display: inline-block; margin-top: 9px; 
   		
   }
  .poster_img{
   	width: 150px;
   	height: 300px;
   }
   .icon_img{
   	width: 50px;
   	height: 50px;
   }
#tContent{
   	display:none;
   }
</style>
<script type="text/javascript">
	function openCloseToc() {
	    if(document.getElementById('tContent').style.display === 'block') {
	      document.getElementById('tContent').style.display = 'none';
	      document.getElementById('toggle').textContent = '더보기';
	    } else {
	      document.getElementById('tContent').style.display = 'block';
	      document.getElementById('toggle').textContent = '숨기기';
	    }
	  }
</script>
<%@ include file="../common/common.jsp" %>
<%@include file="../display/top.jsp" %>
<div align="center">
	<div>
		<h2>상세보기 페이지 입니다</h2>
	</div>
	<div class="poster">
		<figure>
			<img src="resources/images/poster/drama/${cb.image}.jpg" class="poster_img"/>
		</figure>
	</div>
	<div class="infor">
		<div class="infor_title">
				${cb.title }
				<button name="view" onclick="">시청하기</button>
		</div>
		<div align="right">
			<a href="login.member"><button class="btn btn-primary">로그인</button></a>
		</div>
		<div align="left">
			<c:if test="${jjim == null}">
			<a href="insertjjim.member?num=${loginInfo.num}&movie_title=${cb.title}&user_id=${loginInfo.id}"><button class="btn btn-primary">찜하기</button></a>
			</c:if>
			<c:if test="${jjim != null && jjim.movie_title == cb.title }">
			<a href="deletejjim.member?movie_title=${cb.title}"><button class="btn btn-primary">찜하기 취소</button></a>
			</c:if>
			<c:if test="${jjim != null && jjim.movie_title != cb.title }">
			<a href="insertjjim.member?num=${loginInfo.num}&movie_title=${cb.title}&user_id=${loginInfo.id}"><button class="btn btn-primary">찜하기</button></a>
			</c:if>
		</div>
		<div>${cb.genre } ${cb.runningT }분 ${cb.grade }세 </div>
		<div>
			<span id="toggle" onclick="openCloseToc()">더보기</span>
			<div id="tContent">
				<div class="infor_sub" >
					장르 : ${cb.genre }
					<br><br>
					줄거리 : ${cb.content } 
					
				</div>
			</div>
		</div>
	</div>
</div>
<hr>

<div>
	<div class="usaGenre">
		비슷한 드라마 
	</div>
	<c:forEach var="glist" items="${lists }" >
				<div style="display: inline-block;">
					<div class="else" >
						<figure>
							<img src="resources/images/poster/drama/${glist.image}.jpg" class="poster_img"/>
						</figure>
						<h3><span class="icon all ir_pm">
						<c:if test="${glist.grade eq 18 }">
						<img src="resources/images/icon/18.svg" class="icon_img">
						</c:if>
						<c:if test="${glist.grade eq 15 }">
						<img src="resources/images/icon/15.svg" class="icon_img">
						</c:if>
						<c:if test="${glist.grade eq 12 }">
						<img src="resources/images/foster/12.svg" class="icon_img">
						</c:if>
						<c:if test="${glist.grade eq all }">
						<img src="resources/images/foster/all.svg" class="icon_img">
						</c:if>
						</span> <strong>${glist.title }</strong></h3>
					</div>
				</div>
				</c:forEach>
</div>

<%@include file="../display/bottom.jsp" %>