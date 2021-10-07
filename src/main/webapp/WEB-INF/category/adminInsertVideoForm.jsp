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
}
</style>
<div class="row" id="container">
	<div class="col-lg-2">
		<%@include file="../admin/display/left.jsp" %>
	</div>
		<div>
			<div>
				<h2>영상 게시물 추가창</h2>
			</div>
			<div>
				<div>제목</div>
				<div><input type="text" name="title"></div>
			</div>
			<div>
				<div>카테고리</div>
				<div>
					<select name="category"  >
						<option value="movie">영화
						<option value="drama">드라마
						<option value="enter">예능
						<option value="ani">만화
					</select>
				</div>
			</div>
			<div>
				<div>시청연령</div>
				<div>
					<input type="radio" name="grade" value="18">18
					<input type="radio" name="grade" value="15">15
					<input type="radio" name="grade" value="12">12
					<input type="radio" name="grade" value="all">all
				</div>
			</div>
			<div>
				<div>영상 이미지</div>
				<div><input type="file" name="title"></div>
			</div>
		</div>
	</div>