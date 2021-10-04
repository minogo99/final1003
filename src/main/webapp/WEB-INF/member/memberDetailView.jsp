<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div>
	<h2 style="color: green; font-weight: bold;" align="center">회원 상세 정보</h2>

	<input type="hidden" name="num" id="num" value="${member.num}">
	<input type="hidden" name="pageNumber" id="pageNumber" value="${pageNumber}">

	<table border="1" align="center">
		<tr>
			<td>번호</td>
			<td>${member.num}</td>
		</tr>
		<tr>
			<td>아이디</td>
			<td>${member.id}</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>${member.password}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${member.name}</td>
		</tr>
		<tr>
			<td>가입일시</td>
			<td>${member.regdate}</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="button" value="상품 리스트" onclick="location.href='<%=request.getContextPath()%>/list.member?pageNumber=${pageNumber}'">

			</td>
		</tr>
	</table>

</div>


