<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="./../common/common.jsp"%>

<script type="text/javascript">
	function goInsert(){
		location.href="insert.admin" ;
	}
	
	function videoInsert(){
		location.href="insert.video" ;
	}
	
	function goUpdate(num,pn){
		location.href="update.admin?num="+num+"&pageNumber="+pn;
	}
	function goDelete(num,pn){
		 var result = confirm("삭제하시겠습니까 ?");
	        
	        if(result)
	        {
	        	location.href="delete.admin?num="+num+"&pageNumber="+pn;
	        alert("삭제되었습니다")
	        }
	        else
	        {
	        	alert("삭제 취소")
	        }
		
	}
</script>
<style>
table {
	margin: auto;
	text-align: center;
}
</style>
<h2 style="color: green; font-weight: bold;">회원 리스트</h2>
<br>
<table class="table">
	<thead class="table-light">
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
	</thead>
	<tbody>
		<c:if test="${empty lists }">
			<tr>
				<td colspan="8">데이터가 존재하지 않습니다</td>
			</tr>
		</c:if>
		<c:forEach var="member" items="${lists }">

			<tr>
				<td>${member.num }</td>
				<td><a
					href="detail.member?num=${member.num }&pageNumber=${pageInfo.pageNumber}">${member.id }</a></td>
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
	</tbody>
</table>
<div align="right">
	<input type="button" class="btn btn-primary" value="글쓰기"
		onClick="goInsert()">
</div>
<form action="memberList.admin" method="get">
	<div class="row justify-content-center">
		<div class="col-sm-2">
			<select name="whatColumn" class="form-select">
				<option value="all">전체 검색</option>
				<option value="id"
					<c:if test="${pageInfo.whatColumn == 'id'}">
		selected
		</c:if>>아이디</option>
				<option value="name"
					<c:if test="${pageInfo.whatColumn == 'name'}">
		selected
		</c:if>>이름</option>
			</select>
		</div>
		<c:if test="${pageInfo.keyword == 'null'}">
			<div class="col-sm-2">
				<input type="text" class="form-control" name="keyword" value="">
			</div>
		</c:if>
		<c:if test="${pageInfo.keyword != 'null'}">
			<div class="col-sm-2">
				<input type="text" class="form-control" name="keyword"
					value="${pageInfo.keyword}">
			</div>
		</c:if>
		<div class="col-sm-1">
			<input type="submit" class="btn btn-primary" value="검색">
		</div>
	</div>
</form>
${pageInfo.pagingHtml }
