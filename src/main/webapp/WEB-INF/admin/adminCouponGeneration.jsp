<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
#generationForm{
	width: 600px;
}
</style>

<form method="post" action="couponGeneration.admin">
	<div class="container" id="generationForm">
		<div class="input-group">
			<span class="input-group-text">쿠폰이름</span> <input type="text"
				class="form-control" name="cp_name">
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-text">할인율</span> <input type="text"
				class="form-control" name="cp_discount" placeholder="소숫점 입력">
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-text">만료날짜</span> <input type="date"
				class="form-control" name="cp_duedate">
		</div>
		<br>
		<div>
			<button type="submit" class="btn btn-primary">완료</button>
		</div>
	</div>
</form>
