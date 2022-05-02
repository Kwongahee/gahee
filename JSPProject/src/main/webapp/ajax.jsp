<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax.jsp</title>
</head>
<body>
	<script>
	// Asynchrounous Javascript And Xml.
	let url = "StudentGetServlet";
	//fetch라는 함수 자체가 promise객체로 return 함
	fetch(url)
		 .then(result => {
			 console.log(result);
			 return result.json(); // {"id":23,"name":"hong"} .. json 타입
		 })
		 .then(result => {
			 console.log(result);
		 })
		 .catch(error => {
			 console.log(error);
		 })
	
  </script>
</body>
</html>