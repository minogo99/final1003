<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>
    $(function(){
        var responseMessage = "<c:out value="${message}" />";
        if (responseMessage != ""){
            alert(responseMessage)
        }
    })
</script>

<table border="1" width="400" align="center">
 
<tr>
<td>
<br>

<h3 style="color:green; font-weight : bold;">관리자 로그인</h3>

 

<form action ="admin_login.admin" method = "post">

<br>
-관리자 아이디- <input type = "text" name="admin_id" placeholder="  ID를 입력하세요 "><br><br>
-관리자 비밀번호- <input type = "password" name="admin_pass" placeholder="  비밀번호를 입력하세요 "><br><br>
<button type = "submit" name = "submit" >로그인</button>
 
<br>
<br>
<div class = "row">
    <div class="col-xs-8">
        <div class="checkbox icheck">
        <label>
            <input type = "checkbox" name = "useCookie"> 로그인유지
        </label>
        </div>
    </div>
</div>
 
</form>
</td>
</tr>
</table>

 
 
