<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
#writeForm {
	width: 600px;
}
</style>

<form method="post" action="faqWrite.admin">
	<div class="container" id="writeForm">
		<div class="input-group">
			<span class="input-group-text">제목</span> <input type="text"
				class="form-control" name="subject">
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-text">구분</span> <select class="form-select"
				name="division">
				<option value="" selected>선택</option>
				<option value="이용권">이용권</option>
				<option value="서비스">서비스</option>
				<option value="로그인">로그인</option>
			</select>
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-text">내용</span>
			<textarea class="form-control" rows="15" cols="50" name="content"></textarea>
		</div>
		<br>
		<div>
			<button type="submit" class="btn btn-primary">완료</button>
		</div>
	</div>
</form>
