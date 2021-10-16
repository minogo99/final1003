<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
payment.jsp<br><br>

<div id="form">
	<div id="title">
		<h2>상품 구매</h2>
	</div>
	<div id="subtitle">
		<div >
			<h3>결제 내용</h3>
		</div>
		<div id="name">
			${vb.name }
		</div>
		<div id="content">
			${vb.content }
		</div>
		<div id="day">
			
		</div>
		<div id="price">
			금액 (매월) ${vb.price }원
		</div>
	</div>
	
</div>