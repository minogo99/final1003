<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	      document.getElementById('toggle').textContent = '보이기';
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
			<img src="resources/images/poster/main/${dmb.video}.jpg" class="poster_img"/>
		</figure>
	</div>
	<div class="infor">
		<div class="infor_title">
				${dmb.title }
				<button name="view" onclick="">시청하기</button>
		</div>
		<div align="right">
			<a href="login.member"><button class="btn btn-primary">로그인</button></a>
		</div>
		<div>${dmb.genre } ${dmb.runningT }분 ${dmb.grade}세</div>
		<div>
			<span id="toggle" onclick="openCloseToc()">더보기</span>
			<div id="tContent">
				<div class="infor_sub" >
					장르 : ${dmb.genre }
					<br><br>
					출연배우 : ${dmb.actor }
					<br><br>
					줄거리 : ${dmb.content }
				</div>
			</div>
		</div>
	</div>
</div>
<hr>

<div>
	<div class="usaGenre">
		비슷한 영화
	</div>
	<c:forEach var="glist" items="${dlists }" >
				<div style="display: inline-block;">
					<div class="else" >
						<figure>
							<c:forEach var="clist" items="${clists }">
								<c:if test="${glist.vnum eq clist.num}">
									<img src="resources/images/poster/main/${clist.image}.jpg" class="poster_img"/>
								</c:if>
							</c:forEach>
						</figure>
						<h3><span class="icon all ir_pm">
						<c:if test="${glist.grade eq 18 }">
						<img src="resources/images/icon/18.svg" class="icon_img">
						</c:if>
						<c:if test="${glist.grade eq 15 }">
						<img src="resources/images/icon/15.svg" class="icon_img">
						</c:if>
						<c:if test="${glist.grade eq 12 }">
						<img src="resources/images/icon/12.svg" class="icon_img">
						</c:if>
						<c:if test="${glist.grade eq all }">
						<img src="resources/images/icon/all.svg" class="icon_img">
						</c:if>
						</span> <strong>${glist.title }</strong></h3>
					</div>
				</div>
				</c:forEach>
</div>

<%@ include file="./../display/bottom.jsp" %>