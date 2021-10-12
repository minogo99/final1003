<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp"%>
<style>
#writeForm {
	width: 600px;
}
</style>

<h2 style="color: green; font-weight: bold;">FAQ수정</h2>
<form method="post" action="faqUpdate.admin">
<input type="hidden" name="num" value="${cfb.num }">
	<div class="container" id="writeForm">
		<div class="input-group">
			<span class="input-group-text">제목</span> <input type="text"
				class="form-control" name="subject" value="${cfb.subject }">
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-text">구분</span> <select class="form-select"
				name="division">
				<option value="">선택</option>
				<option value="이용권"
					<c:if test="${cfb.division == '이용권' }">
				selected
				</c:if>>이용권</option>
				<option value="서비스"
					<c:if test="${cfb.division == '서비스' }">
				selected
				</c:if>>서비스</option>
				<option value="로그인"
					<c:if test="${cfb.division == '로그인' }">
				selected
				</c:if>>로그인</option>
			</select>
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-text">내용</span>
			<textarea class="form-control" rows="15" cols="50" name="content">${cfb.content }</textarea>
		</div>
		<br>
		<div>
			<button type="submit" class="btn btn-primary justify-content-end">완료</button>
		</div>
	</div>
</form>
