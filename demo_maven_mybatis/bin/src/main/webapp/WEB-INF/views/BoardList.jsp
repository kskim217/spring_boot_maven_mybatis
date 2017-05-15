<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
<!-- BootStrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<title>게시글 목록</title>
</head>
<body style="width:800px">
    <h3>게시글 목록</h3>
    <button class="btn btn-primary" style="float : right;" onclick="location.href='/boards/write'">작성</button>
    <table class="table">
        <tr> 
            <th>No</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성날짜</th>
        </tr>
        <c:forEach var="board" items="${list}">
        <tr>
            <td>${board.SRNO}</td>
            <td><a <%-- href="/boards/${board.SRNO}" --%> srno="${board.SRNO}">${board.TITLE}</a></td>
            <td>${board.USER_ID}</td>
            <td>${board.REG_DATE}</td>
        </tr>
        </c:forEach>
    </table>
</body>
<script type="text/javascript">
$(function(){
	console.log('hee');	
});
$(document).on('click', 'td a', function(){
	console.log($(this).attr('srno'));
	var srno = $(this).attr('srno');
	var url = '/boards/' + srno;
	toAjax(url,'get',null, function(res){
		console.log(res);
	});
});
function toAjax(url, method,params,callback){
	$.ajax({
		type:method
		,url:url	
		,data:params
		,dataType:"json"
		,success:callback
	});
}
</script>
</html>
