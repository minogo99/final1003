<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="./../common/common.jsp"%>
<%@include file="../display/top.jsp"%>
<style type="text/css">
.err {
	font-size: 13pt;
	color: red;
	font-weight: bold;
}

#signPage {
	
}

#sign {
	width: 450px;
	height: 400px;
	margin: 30px auto;
}
</style>
<script src="resources/js/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				$('#idcheck').click(
						function() {

							$.ajax({
								url : "idCheck.member",
								type : "POST",
								data : {
									"userId" : $('input[name="id"]').val()
								},
								success : function(data) {
									if (data == 0
											&& $.trim($('input[name="id"]')
													.val()) != '') {
										alert("사용가능한 아이디 입니다.");

									} else {
										alert("사용불가능한 아이디 입니다.");

									}
								},
								error : function() {
									alert("에러");
								}
							});
						});
			});
</script>
<br>
<div id="signPage">
	<div id="sign">
		<h3 align="center">회원 가입</h3>
		<form:form commandName="memberBean" name="loginform"
			action="sign.member" method="post">
			<fieldset>
				<div class="form-group">
					<label for="id" class="form-label mt-4">아이디</label> <input
						type="text" class="form-control" name="id" placeholder="아이디 입력">
					<form:errors cssClass="err" path="id" />
					<br> <input type="button" value="중복체크" class="btn btn-primary"
						id="idcheck">
				</div>
				<div class="form-group">
					<label for="password" class="form-label mt-4">비밀번호</label> <input
						type="password" class="form-control" name="password"
						placeholder="비밀번호 입력">
					<form:errors cssClass="err" path="password" />
				</div>
				<div class="form-group">
					<label for="name" class="form-label mt-4">이름</label> <input
						type="text" class="form-control" name="name" placeholder="이름 입력">
					<form:errors cssClass="err" path="name" />
				</div>

				<div class="form-group">
					<label for="name" class="form-label mt-4">전화번호</label>
					<div class="row">
						<div style="width: 120px">
							<select class="form-select" name="tel1">
								<option value="">선택</option>
								<option value="02">02</option>
								<option value="064">064</option>
								<option value="010">010</option>
							</select>
						</div>
						-
						<div style="width: 160px">
							<input type="text" class="form-control" name="tel2"
								placeholder="전화번호 입력">
						</div>
						-
						<div style="width: 160px">
							<input type="text" class="form-control" name="tel3"
								placeholder="전화번호 입력">
						</div>
					</div>
				</div>

			</fieldset>
			<br>
			<br>
			<div align="center">
				<input type="submit" class="btn btn-primary" value="회원가입">
			</div>
		</form:form>
	</div>
</div>
<%@include file="../display/bottom.jsp"%>