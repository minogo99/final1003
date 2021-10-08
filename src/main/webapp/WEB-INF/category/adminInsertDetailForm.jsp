<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script type="text/javascript">
	function goInsert(){
		location.href="insert.member" ;
	}
	
	function videoInsert(){
		location.href="insert.video" ;
	}
	
	function goUpdate(num,pn){
		location.href="update.member?num="+num+"&pageNumber="+pn;
	}
	function goDelete(num,pn){
		 var result = confirm("삭제하시겠습니까 ?");
	        
	        if(result)
	        {
	        	location.href="delete.member?num="+num+"&pageNumber="+pn;
	        alert("삭제되었습니다")
	        }
	        else
	        {
	        	alert("삭제 취소")
	        }
		
	}
</script>
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
	<div id="videoList" class="col-lg-10" align="center">
		
		<div>
			<h2 style="color: green; font-weight: bold;">영상 게시물 추가창</h2>	
			<div>
				<form action="adminLastInsertVideo.category" method="post" enctype="multipart/form-data">
					<fieldset>
			<div class="form-group">
			<label for="id" class="form-label mt-4">제목</label>
				<input type="hidden" name="vnum" value="${cb.num }">
				<input type="" class="form-control" name="id" placeholder="제목 입력" value="${cb.title }" readonly>
			</div>
		<div class="form-group">
				<label for="category" class="form-label mt-4">줄거리</label>
				<textarea rows="10" cols="50" name="content"></textarea>
			</div>
			<div class="form-group">
				<label for="runningT" class="form-label mt-4">러닝타임</label>
				<input type="text" name="runningT">
			</div>
			<div class="form-group">
				<label for="genre" class="form-label mt-4">장르</label>
				<input type="text" name="genre">
			</div>
			<div class="form-group">
				<label for="nation" class="form-label mt-4">국가</label>
				<input type="text" name="nation">
			</div>
			<div class="form-group">
				<label for="actor" class="form-label mt-4">출연진</label>
				<input type="text" name="actor">
			</div>
			<div class="form-group">
				<label for="grade" class="form-label mt-4">시청 연령 제한</label>
				<input type="text" name="grade" readonly>
			</div>
			<div class="form-group">
				<label for="day" class="form-label mt-4">방영일</label>
				<input type="text" name="day">
			</div>
			<div class="form-group">
				<label for="series" class="form-label mt-4">제작 화수</label>
				<input type="text" name="series">
			</div>
		</fieldset>
		<br><br>
			<div align="center">
			<input type="submit" class="btn btn-primary" value="저장">
			<input type="button" class="btn btn-primary" onclick="history.go(-1);" value="취소">
			</div>
				</form>
			</div>
		</div>
	</div>
</div>