<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp"%>
<%@ include file="../display/top.jsp"%>

<style>
#boardDetailView{
margin: auto;
width:600px;
}
#reply{
margin: auto;
width:600px;
}
  table {
    border-top: 1px solid #F4FFFF;
    border-collapse: collapse;
    width:600px;
  }
  th, td{
    border-bottom: 1px solid #F4FFFF;
    padding: 10px;
  }
</style>
	<div id="boardDetailView">
    <table>
    <tr>
    <td><h3>${bb.subject }</h3></td>
    </tr>
    <tr>
    <td align="right"><b>작성자 :</b> ${bb.writer } <b>조회수 :</b> ${bb.readcount } 
    <b>등록일 :</b> <fmt:parseDate value="${bb.reg_date }" var="noticePostDate" pattern="yyyy-MM-dd" /> <fmt:formatDate value="${noticePostDate}" pattern="yyyy-MM-dd" var="reg_date" /> ${reg_date }</td>
    </tr>
    <tr>
    <td height="300">${bb.content }</td>
    </tr>
    </table>
    <br>
    <div align="right">
    <input type="button" value="글목록" onclick="location.href='list.board'">
    </div>
    <br><br>
    </div>
    <div id="reply">
    	<form method="post" action="replyWrite.board">
	<input type="hidden" name="bno" value="${bb.num}">
			<p>
			<textarea rows="3" cols="70" name="content"></textarea>
			</p>
			<p align="right">
			<input type="submit" value="댓글입력">
			</p>
	</form>
	<c:forEach items="${reply}" var="reply">
	<table>
	<tr>
	<td>
		<font size="3">ID : ${reply.writer} / <fmt:parseDate value="${reply.reg_date}" var="noticePostDate"
						pattern="yyyy-MM-dd HH:mm" /> <fmt:formatDate
						value="${noticePostDate}" pattern="yyyy-MM-dd HH:mm"
						var="reg_date" /> ${reg_date }</font>
	</td>
	<td>
		<a href="replyUpdate.board?rno=${reply.rno }">[수정]</a> <a href="replyDelete.board?rno=${reply.rno }">[삭제]</a>${reg_date }
	</td>
	</tr>
	<tr>
	<td colspan="2">
	${reply.content }
	</td>
	</tr>
	</table>	
</c:forEach>
<p align="center">
<c:forEach var="i" begin="1" end="${count%3 == 0 ? count/3 : count/3+1 }">

<a href="detailView.board?replyPageNumber=${i }&num=${bb.num}">${i }</a>

</c:forEach>
</p>
</div>
    <%@ include file="../display/bottom.jsp"%>