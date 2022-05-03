<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberResult/memberInsertOutput.jsp</title>
</head>
<body>
<!-- 정보를 보여주는 페이지! attribute 읽어올때 ${} -->
  <h3>${name }님 가입이 완료되었습니다.</h3>
  <jsp:include page="home.jsp"></jsp:include>
</body>
</html>