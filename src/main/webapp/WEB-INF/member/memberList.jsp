<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../admin/display/top.jsp" %>
<%@include file="./../common/common.jsp"%>

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
<div id="memberList" class="col-lg-10">
<h2 style="color: green; font-weight: bold;">회원 리스트</h2>
<form action="memberList.member" method="get">
	<select name="whatColumn">
		<option value="">전체 검색</option>
		<option value="id">아이디</option>
		<option value="name">이름</option>
	</select> <input type="text" name="keyword"> <input type="submit"
		value="검색">
</form>
<table border="1" align="center" width="600">
	<tr>
		<td colspan="8">
			<input type="button" value="추가하기"	onClick="goInsert()">
			<input type="button" value="영상 추가"	onClick="videoInsert()">
		</td>
	</tr>
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>비번</th>
		<th>이름</th>
		<th>전화번호</th>
		<th>가입일자</th>
		<th>수정</th>
		<th>삭제</th>

	</tr>
	<c:if test="${empty lists }">
		<tr>
			<td colspan="8">데이터가 존재하지 않습니다</td>
		</tr>
	</c:if>
	<c:forEach var="member" items="${lists }">

		<tr>
			<td>${member.num }</td>
			<td><a href="detail.member?num=${member.num }&pageNumber=${pageInfo.pageNumber}">${member.id }</a></td>
			<td>${member.password }</td>			
			<td>${member.name }</td>
			<td>${member.tel1 }${member.tel2 }${member.tel3 }</td>
			<td>${member.regdate }</td>
			<td><input type="button" value="수정"
				onClick="goUpdate(${member.num },${pageInfo.pageNumber})"></td>
			<td><input type="button" value="삭제"
				onClick="goDelete(${member.num },${pageInfo.pageNumber})"></td>

		</tr>
	</c:forEach>
</table>
${pageInfo.pagingHtml }
</div>
</div>