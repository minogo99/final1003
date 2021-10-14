<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../admin/display/top.jsp" %>
<%@include file="./../common/common.jsp"%>

<style>
#container{
height: 600px;
}
#memberList{
text-align: center;
height: 100%;
border: 1px solid black;
padding: 100px;
}
table{
margin: auto;
text-align: center;
width: 100%;
height: 100%;

}
tr{
	text-align: right;
	width: 30%;
}
td{
	text-align: center;
	width: 70%;
}
</style>
<div class="row" id="container">
	<div class="col-lg-2">
		<%@include file="../admin/display/left.jsp" %>
	</div>
	<div id="videoUpdate" class="col-lg-10" align="center">
		
		<div>
			<h2 style="color:#0080FF; font-weight: bold;">영상 게시물 수정창</h2>	
			<div>
				<form action="adminLastUpdateVideo.category" method="post" enctype="multipart/form-data">
					<fieldset>
			<div class="form-group">
				<input type="text" name="vnum" value="${cb.num }"  readonly>
			<label for="title" class="form-label mt-4">제목</label>
				<input type="text" class="form-control" name="title" value="${cb.title }" readonly>
				
			</div>
		<div class="form-group">
				<label for="content" class="form-label mt-4">줄거리</label>
				<textarea rows="10" cols="50" name="content" >${db.content }</textarea>
			</div>
			<div class="form-group">
				<label for="runningT" class="form-label mt-4">러닝타임</label>
				<input type="text" name="runningT" value="${db.runningT }">
			</div>
			<div class="form-group">
				<label for="genre" class="form-label mt-4">장르</label>
				<input type="text" name="genre" value="${db.genre }">
			</div>
			<div class="form-group">
				<label for="nation" class="form-label mt-4">국가</label>
				<input type="text" name="nation" value="${db.nation }">
			</div>
			<div class="form-group">
				<label for="actor" class="form-label mt-4">출연진</label>
				<input type="text" name="actor" value="${db.actor }">
			</div>
			<div class="form-group">
				<label for="grade" class="form-label mt-4">시청 연령 제한</label>
				<input type="text" name="grade" value="${cb.grade }" readonly>
			</div>
			<div class="form-group">
				<label for="day" class="form-label mt-4">방영일</label>
				<input type="text" name="day" value="${db.day }">
			</div>
			<div class="form-group">
				<label for="series" class="form-label mt-4">제작 화수</label>
				<input type="text" name="series" value="${db.series }">
			</div>
		</fieldset>
		<br><br>
			<div align="center">
			<input type="submit" class="btn btn-primary" value="수정하기">
			<input type="button" class="btn btn-primary" onclick="history.go(-1);" value="취소">
			</div>
				</form>
			</div>
		</div>
	</div>
</div>