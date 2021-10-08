<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp"%>
<style>
#writeForm {
	width: 600px;
}
</style>

<form method="post" action="noticeUpdate.admin">
<input type="hidden" name="num" value="${cnb.num }">
	<div class="container" id="writeForm">
		<div class="input-group">
			<span class="input-group-text">제목</span> <input type="text"
				class="form-control" name="subject" value="${cnb.subject }">
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-text">구분</span> <select class="form-select"
				name="division">
				<option value="">선택</option>
				<option value="서비스공지"
					<c:if test="${cnb.division == '서비스공지' }">
				selected
				</c:if>>서비스공지</option>
				<option value="콘텐츠공지"
					<c:if test="${cnb.division == '콘텐츠공지' }">
				selected
				</c:if>>콘텐츠공지</option>
			</select>
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-text">내용</span>
			<textarea class="form-control" rows="15" cols="50" name="content">${cnb.content }</textarea>
		</div>
		<br>
		<div>
			<button type="submit" class="btn btn-primary justify-content-end">완료</button>
		</div>
	</div>
</form>
