<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@include file="./../common/common.jsp" %>     

<style type="text/css">
		.err{
		font-size: 9pt;
		color: red;
		font-weight: bold;
		}
			#signPage{
		}
		#sign {
	width: 450px;
	height: 400px;
	margin: 30px auto;
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

	<%
String[] tel1 = { "02", "064", "010" };
request.setAttribute("tel1", tel1);
%>
<div id="sign">
<h3 style="color:green; font-weight : bold;" align="center">회원 수정 화면</h3>

<form:form commandName="member" method="post" action="memberUpdate.admin">
	<input type="hidden" name="pageNumber" value="${pageNumber}">
	<input type="hidden" name="num" value="${member.num}">

		<fieldset>
		<div class="form-group">
			<label for="id" class="form-label mt-4">아이디</label>
			<input type="text" class="form-control" name="id" placeholder="아이디 입력" value="${member.id }">
			<form:errors cssClass="err" path="id" />
			<br>
				<input type="button" value="중복체크" class="btn btn-primary" id="idcheck">
		</div>
		<div class="form-group">
			<label for="password" class="form-label mt-4">비밀번호</label>
				<input type="password" class="form-control" name="password" placeholder="비밀번호 입력" value="${member.password }">
				<form:errors cssClass="err" path="password" />
		</div>
		<div class="form-group">
				<label for="name" class="form-label mt-4">이름</label>
				<input type="text" class="form-control" name="name" placeholder="이름 입력" value="${member.name }">
				<form:errors cssClass="err" path="name" />
			</div>

		<div class="form-group">
					<label for="name" class="form-label mt-4">전화번호</label>
					<div class="row">
						<div style="width: 120px">
							<select class="form-select" name="tel1">
								<option value="">선택</option>
								<c:forEach var="i" begin="0" end="<%=tel1.length -1%>" step="1">

									<option value="${tel1[i] }"
										<c:if test="${tel1[i] == loginInfo.tel1}">
								selected
								</c:if>>${tel1[i] }</option>

									<option value="${tel1[i]}"
										<c:if test="${tel1[i] == loginInfo.tel1}">
								selected
								</c:if>>${tel1[i]}</option>

								</c:forEach>
							</select>
							<form:errors cssClass="err" path="tel1" />
						</div>
						-
						<div style="width: 160px">
							<input type="text" class="form-control" name="tel2"
								placeholder="전화번호 입력" value="${member.tel2 }" >
								<form:errors cssClass="err" path="tel2" />
						</div>
						-
						<div style="width: 160px">
							<input type="text" class="form-control" name="tel3"
								placeholder="전화번호 입력" value="${member.tel3 }">
								<form:errors cssClass="err" path="tel3" />
						</div>
					</div>
				</div>
			<br><br>
			<div align="center">
			<input type="submit" class="btn btn-primary" value="수정하기">
			<input type="button" class="btn btn-primary" onclick="history.go(-1);" value="취소">
			</div>
</fieldset>
</form:form>
	</div>		

