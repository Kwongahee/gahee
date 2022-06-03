<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div><h1>게시글</h1></div>
	<div>
	<form id="frm"action="boardModify.do" method="post">
		<table id="table" border="1">
			<tr>
				<th >작성자</th>
				<td width="500">${content.boardName }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td> <input type="text" id="boardTitle" name="boardName"value=${content.boardTitle }></td>
			</tr>
				<tr>
				<th>작성일</th>
				<td>${content.boardDate }</td>
			</tr>
				<tr>
				<th>조회수</th>
				<td>${content.boardHit }</td>
			</tr>
			<tr>
				<th height="400">작성글</th>
				<td><textarea rows="10" cols="50" id="boardContents">
				${board.boardContents }
				</textarea></td>
			</tr>			
		</table>
	</div>
	<div>
		<button type="button" onclick="location.href='boardList.do'">목록</button>
	</div>

	</form>
	</div>

</body>
</html>