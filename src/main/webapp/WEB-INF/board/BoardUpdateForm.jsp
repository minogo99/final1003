<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@include file="../display/top.jsp" %>
  <style>
	#update{
		margin:auto;
	}
	</style>
        <form action="update.board" method="post">
        <input type="hidden" name="num" value="${bb.num }">
<table id="update">
<tr>
<td>제목</td>
<td><input type="text" name="subject" value="${bb.subject }"></td>
</tr>
<tr>
<td>내용</td>
<td><textarea rows="15" cols="50" name="content">${bb.content }</textarea></td>
</tr>
<tr>
<td colspan="2" align="right"><input type="submit" value="수정"></td>
</tr>
</table>
    </form>
    <%@include file="../display/bottom.jsp" %>
