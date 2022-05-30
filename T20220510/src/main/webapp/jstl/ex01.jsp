<%@page import="co.test.vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl/ex01.jsp</title>
</head>
<body>
  <c:set var="name" value="hong"></c:set>
  <c:set var="pi" value="3.14"></c:set>
  <c:out value ="${name } + ${pi }"></c:out>
  <h3>${pi }</h3>
  
  <%
    BookVO vo = new BookVO("20220501001","이것이 자바다","오정임","루비페이퍼",1500);
  	request.setAttribute("vo", vo);
  %>
  <h3>${vo }</h3>
  
  <c:if test="${vo eq null }">
  	<h3>저장값이 없습니다.</h3>
  </c:if>
  <c:choose>
    <c:when test="${vo.bookTitle eq '이것이 자바다' }"><h3>짱비싸용</h3></c:when>
  	<c:otherwise><h3>북코드 : ${vo.bookCode }, 저자 : ${vo.bookAuthor }</h3></c:otherwise>
  </c:choose>
for(int i=1; i<=10; i++ )
<c:forEach begin="1" end="10" var="cnt">
 <p>2 * ${cnt } = ${cnt * 2 }</p>
</c:forEach>

<c:forEach items="${list }" var="book">
<p>${book.bookCode },${book.bookTitle }</p>
</c:forEach>

<c:forTokens items="소설/ 역사/ 인문/ 정치" delims="/" var="token">
<p>token: ${token }</p>
</c:forTokens>
</body>


</html>