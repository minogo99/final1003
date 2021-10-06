<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div>
	<h2 style="color: green; font-weight: bold;" align="center">회원 상세 정보</h2>

	<input type="hidden" name="num" id="num" value="${member.num}">
	<input type="hidden" name="pageNumber" id="pageNumber" value="${pageNumber}">

	<table border="1" align="center">
		<tr>
			<th>번호</th>
			<td>${member.num}</td>
		</tr>
		<tr>
			<th>아이디</th>
			<td>${member.id}</td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td>${member.password}</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>${member.name}</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>${member.tel1}-${member.tel2}-${member.tel3}</td>
		</tr>
		<tr>
			<th>가입일시</th>
			<td>${member.regdate}</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="button" value="상품 리스트" onclick="location.href='<%=request.getContextPath()%>/list.member?pageNumber=${pageNumber}'">

			</td>
		</tr>
	</table>

</div>


