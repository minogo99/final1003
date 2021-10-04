<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="./../common/common.jsp" %>
<%@include file="../display/top.jsp" %>
<style type="text/css">
		.err{
		font-size: 13pt;
		color: red;
		font-weight: bold;
		}
		#signPage{
		}
		#sign {
	width: 400px;
	height: 400px;
	margin: 30px auto;
}
</style>
<script src="resources/js/jquery.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	 $('#idcheck').click(function(){

	        $.ajax({
	            url: "idCheck.member",
	            type: "POST",
	            data: {
					"userId":$('input[name="id"]').val()
				},
	            success: function(data){
	            	if(data == 0 && $.trim($('input[name="id"]').val()) != '' ){
					alert("사용가능한 아이디 입니다.");
					
					}else{
						alert("사용불가능한 아이디 입니다.");
						
					}
	            },
	            error: function(){
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
	<form:form  commandName ="memberBean" name="updateform" action="userupdate.member" method="post">
		<input type="hidden" name ="num" value="${bean.num }">
		<fieldset>
			<div class="form-group">
				<label for="id" class="form-label mt-4">아이디</label>
				<input type="text" class="form-control" name="id" placeholder="${bean.id }">
				<form:errors cssClass="err" path="id" />
				<input type="button" value="중복체크" class="btn btn-primary" id="idcheck">
			</div>
			<div class="form-group">
				<label for="password" class="form-label mt-4">비밀번호</label>
				<input type="password" class="form-control" name="password" placeholder="${bean.password }">
				<form:errors cssClass="err" path="password" />
			</div>
			<div class="form-group">
				<label for="password" class="form-label mt-4">이름</label>
				<input type="text" class="form-control" name="name" placeholder="${bean.name }">
				<form:errors cssClass="err" path="name" />
			</div>
			<div class="form-group">
			<label for="name" class="form-label mt-4">전화번호</label>
				<input type="text" class="form-control" name="phone" placeholder="${bean.phone }">
			</div>
			
		</fieldset>
		<br><br>
			<div align="center">
			<input type="submit" class="btn btn-primary" value="수정하기">
			</div>
	</form:form>
</div>	
</div>		
<%@include file="../display/bottom.jsp" %>