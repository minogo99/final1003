<%@page import="category.model.CategoryBean"%>
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
 <script>
  $("#Img").change(function(){
   if(this.files && this.files[0]) {
    var reader = new FileReader;
    reader.onload = function(data) {
     $(".select_img img").attr("src", data.target.result).width(500);        
    }
    reader.readAsDataURL(this.files[0]);
   }
  });
 </script>

<div class="row" id="container">
	<div class="col-lg-2">
		<%@include file="../admin/display/left.jsp" %>
	</div>
	<div id="videoUpdate" class="col-lg-10" align="center">
		
		<div >
			<h2 style="color:#0080FF; font-weight: bold;">영상 게시물 수정창</h2>	
			<div>
				<form action="updateVideo.category" method="post" enctype="multipart/form-data">
				<input type="hidden" name="pageNumber" value="${pageNumber}" >
					<input type="hidden" name="num" value="${cb.num}">
					<fieldset>
			<div class="form-group">
			<label for="title" class="form-label mt-4">제목</label>
				<input type="text" name="title" value="${cb.title}">
			</div>
		<div class="form-group">
				<label for="category" class="form-label mt-4">카테고리</label>
				
				<input type="radio" name="category" value="movie"<c:if test="${cb.category == 'movie' }">
					checked</c:if>>영화		
				<input type="radio" name="category" value="drama"<c:if test="${cb.category == 'drama' }">
					checked</c:if>>드라마
				<input type="radio" name="category" value="enter"<c:if test="${cb.category == 'enter' }">
					checked</c:if>>예능
				<input type="radio" name="category" value="ani"<c:if test="${cb.category == 'ani' }">
					checked</c:if>>만화
			</div>
			<div class="form-group">
				<label for="name" class="form-label mt-4">시청 연령 제한</label>
				<select name="grade">
					<option value="all"
					<c:if test="${cb.grade == 'all' }">
					selected
					</c:if>>all</option>
					<option value="18"
					<c:if test="${cb.grade == '18' }">
					selected
					</c:if>>18</option>
					<option value="15"
					<c:if test="${cb.grade == '15' }">
					selected
					</c:if>>15</option>
					<option value="12"
					<c:if test="${cb.grade == '12' }">
					selected
					</c:if>>12</option>
				</select>
			</div>
			<div class="inputArea">
 <label for="Img">이미지</label>
 <input type="file" id="image" name="file" />
 <div class="select_img">
  <img src="resources/images/poster/${cb.image}" width="150px" height="150px">
  <input type="hidden" name="image" value="${cb.image}" />
  
 </div>
 

</div>
		</fieldset>
		<br><br>
			<div align="center">
			<input type="submit" class="btn btn-primary" value="다음">
			<input type="button" class="btn btn-primary" onclick="history.go(-1);" value="취소">
			</div>
				</form>
			</div>
		</div>
	</div>
</div>