<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>
<%@ include file="../display/top.jsp"%>

<style>
#board_title{
	 background-color: #252525;
	 padding: 10px;
	}
#board_div {
	width: 1200px;
	margin: auto;
}
#board_table {
	text-align: center;
}
</style>
	<div id="board_title"><h3 align="center">자유게시판</h3></div>
<div id="board_div">
	<table class="table table-hover" id="board_table">
		<thead>
			<tr>
				<th scope="col">No</th>
				<th scope="col" width="600">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">조회수</th>
				<th scope="col">등록일</th>
				<th scope="col">수정</th>
				<th scope="col">삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bb" items="${lists}" varStatus="status">
				<tr class="table-active">
					<th scope="row">${pageInfo.totalCount - (pageInfo.pageNumber-1) * pageInfo.pageSize - status.index}</th>
					<td width="600"><a href="detailView.board?num=${bb.num }&replyType=write">${bb.subject }</a> <font style="opacity: 0.5">[${bb.replycount }]</font></td>
					<td>${bb.writer }</td>
					<td>${bb.readcount}</td>
					<td><fmt:parseDate value="${bb.reg_date }" var="noticePostDate" pattern="yyyy-MM-dd" /> <fmt:formatDate value="${noticePostDate}" pattern="yyyy-MM-dd" var="reg_date" /> ${reg_date }</td>
					<c:if test="${bb.writer == loginInfo.id || 'admin' == loginInfo.id}">
					<td><a href="update.board?num=${bb.num }">수정</a></td>
					<td><a href="delete.board?num=${bb.num }">삭제</a></td>
					</c:if>
					<c:if test="${bb.writer != loginInfo.id }">
					<td></td>
					<td></td>
					</c:if>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div align="right">
	<input type="button" class="btn btn-primary" value="글쓰기" onclick="location.href='write.board'">
	</div>
	<br>

	<form action="list.board" method="get">
		<div class="row justify-content-center">
		<div class="col-sm-2">
		<select name="whatColumn" class="form-select">
			<option value="all">전체 검색</option>
			<option value="writer"
				<c:if test="${pageInfo.whatColumn == 'writer'}">
		selected
		</c:if>>작성자</option>
			<option value="subject"
				<c:if test="${pageInfo.whatColumn == 'subject'}">
		selected
		</c:if>>제목</option>
		</select>
		</div>
		<c:if test="${pageInfo.keyword == 'null'}">
			<div class="col-sm-2">
			<input type="text" class="form-control" name="keyword" value="">
			</div>
		</c:if>
		<c:if test="${pageInfo.keyword != 'null'}">
		<div class="col-sm-2">
			<input type="text" class="form-control" name="keyword" value="${pageInfo.keyword}">
		</div>
		</c:if>
		<div class="col-sm-1">
		<input type="submit" class="btn btn-primary" value="검색">
		</div>
		</div>
	</form>

	${pageInfo.pagingHtml}
	
</div>
<%@ include file="../display/bottom.jsp"%>