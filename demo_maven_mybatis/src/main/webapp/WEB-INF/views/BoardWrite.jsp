<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
<!-- BootStrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<title>게시글 상세</title>
</head>
<body>
    <h3>게시글 상세</h3>
    <div style="padding : 30px;">
      <div class="form-group">
        <label>제목</label>
        <span>${board.title}</span>
      </div>
      <div class="form-group">
        <label>작성자</label>
        <span>${board.userId}</span>
      </div>
      <div class="form-group">
        <label>작성날짜</label>
        <span>${board.reg_date}</span>
      </div>
      <div class="form-group">
        <label>내용</label>
        <p>${board.contents}</p>
      </div>
      <div class="form-group">
          <input type="button" value="수정" onclick='location.href="/board/${board.srno}"'>
          <form:form action="/board/${board.srno}" method="DELETE">
              <input type="submit" value="삭제">
          </form:form>
      </div>
    </div>
</body>
</html>
