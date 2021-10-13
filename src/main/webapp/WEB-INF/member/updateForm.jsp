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
#updatePage{
	width: 450px;
	height: 400px;
	margin: 30px auto;
}
</style>
<br>
<%
String[] tel1 = { "02", "064", "010" };
request.setAttribute("tel1", tel1);
%>
<div id="updatePage">
		<h3 align="center">회원정보 수정</h3>
		<form:form commandName="memberBean" name="updateform"
			action="userupdate.member" method="post">
			<input type="hidden" name="num" value="${mb.num}">
			<input type="hidden" name="id" value="${mb.id}">
			<fieldset>
				<div class="form-group">
					<label for="password" class="form-label mt-4">이름</label> <input
						type="text" class="form-control" name="name"
						value="${mb.name}">
					<form:errors cssClass="err" path="name" />
				</div>
				
				<div class="form-group">
					<label for="name" class="form-label mt-4">전화번호</label>
					<div class="row">
						<div style="width: 120px">
							<select class="form-select" name="tel1">
								<option value="">선택</option>
								<c:forEach var="i" begin="0" end="<%=tel1.length - 1%>" step="1">
									<option value="${tel1[i] }"
										<c:if test="${tel1[i] == loginInfo.tel1 }">
								selected
								</c:if>>${tel1[i] }</option>
								</c:forEach>
							</select>
							<form:errors cssClass="err" path="tel1" />
						</div>
						-
						<div style="width: 160px">
							<input type="text" class="form-control" name="tel2"
								placeholder="전화번호 입력" value="${mb.tel2 }">
								<form:errors cssClass="err" path="tel2" />
						</div>
						-
						<div style="width: 160px">
							<input type="text" class="form-control" name="tel3"
								placeholder="전화번호 입력" value="${mb.tel3 }">
								<form:errors cssClass="err" path="tel3" />
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<label for="password" class="form-label mt-4">비밀번호</label> <input
						type="password" class="form-control" name="password">
					<form:errors cssClass="err" path="password" />
				</div>
			</fieldset>
			<br>
			<br>
			<div align="center">
				<input type="submit" class="btn btn-primary" value="수정하기">
			</div>
		</form:form>
	</div>
<%@include file="../display/bottom.jsp"%>