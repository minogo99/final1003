<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../admin/display/top.jsp" %>
<%@include file="./../common/common.jsp"%>
videolist.jsp<br><br>

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
				<form action="adminInsertVideo.category" method="post" enctype="multipart/form-data">
					<fieldset>
			<div class="form-group">
			<label for="id" class="form-label mt-4">제목</label>
				<input type="text" class="form-control" name="id" placeholder="제목 입력" >
			</div>
		<div class="form-group">
				<label for="category" class="form-label mt-4">카테고리</label>
				<input type="radio" name="category" value="movie">영화
				<input type="radio" name="category" value="drama">드라마
				<input type="radio" name="category" value="enter">예능
				<input type="radio" name="category" value="ani">만화
			</div>
			<div class="form-group">
				<label for="name" class="form-label mt-4">시청 연령 제한</label>
				<select name="grade">
					<option value="18">18
					<option value="15">15
					<option value="12">12
					<option value="all">all
				</select>
			</div>
			<div>
				<input type="file" name="file">
			</div>
		</fieldset>
		<br><br>
			<div align="center">
			<input type="button" class="btn btn-primary" onclick="history.go(-1);" value="취소">
			</div>
				</form>
			</div>
		</div>
	</div>
</div>