<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@include file="../display/top.jsp" %>
    <style>
	#write{
	margin: auto;
	}
	</style>
        <form action="write.board" method="post">
<table id="write">
<tr>
<td>제목</td>
<td><input type="text" name="subject"></td>
</tr>
<tr>
<td>내용</td>
<td><textarea rows="15" cols="50" name="content"></textarea></td>
</tr>
<tr>
<td colspan="2" align="right"><input type="submit" value="글쓰기"></td>
</tr>
</table>
    </form>
    <%@include file="../display/bottom.jsp" %>
