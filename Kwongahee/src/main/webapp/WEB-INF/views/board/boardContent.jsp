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
		<table id="table" border="1">
			<tr>
				<th width="70">작성자</th>
				<td width="870">${content.boardName }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${content.boardTitle }</td>
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
				<td>${content.boardContents }</td>
			</tr>			
		</table>
	</div>
	<div>
		<button type="button" onclick="location.href='boardList.do'">목록</button>
		<button type="button" onclick="location.href='boardDelete.do?boardId=${content.boardId}'">삭제</button>
		<button type="button" onclick="location.href='boardModifyForm.do?boardId=${content.boardId }'">수정</button>
	</div>
</div>
</body>
	
</html>