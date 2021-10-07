<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../admin/display/top.jsp"%>
<%@include file="../common/common.jsp"%>

<style>
#container {
	height: 100%;
}

#boardList {
	border: 1px solid black;
	padding: 100px;
}

table {
	margin: auto;
	text-align: center;
}
</style>
<div class="row" id="container">
	<div class="col-lg-2">
		<%@include file="../admin/display/left.jsp"%>
	</div>
	<div id="boardList" class="col-lg-10">
		<table class="table">
			<thead class="table-light">
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
					<tr>
						<th scope="row">${pageInfo.totalCount - (pageInfo.pageNumber-1) * pageInfo.pageSize - status.index}</th>
						<td width="600"><a
							href="detailView.board?num=${bb.num }&replyType=write">${bb.subject }</a>
							(${bb.replycount })</td>
						<td>${bb.writer }</td>
						<td>${bb.readcount}</td>
						<td><fmt:parseDate value="${bb.reg_date }"
								var="noticePostDate" pattern="yyyy-MM-dd" /> <fmt:formatDate
								value="${noticePostDate}" pattern="yyyy-MM-dd" var="reg_date" />
							${reg_date }</td>
						<td><a href="update.board?num=${bb.num }">수정</a></td>
						<td><a href="delete.board?num=${bb.num }">삭제</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div align="right">
			<input type="button" class="btn btn-primary" value="글쓰기"
				onclick="location.href='write.board'">
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
						<input type="text" class="form-control" name="keyword"
							value="${pageInfo.keyword}">
					</div>
				</c:if>
				<div class="col-sm-1">
					<input type="submit" class="btn btn-primary" value="검색">
				</div>
			</div>
		</form>
		${pageInfo.pagingHtml}
	</div>
</div>
