<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>게시판</h1>
		</div>
		<div>
			<form id="frm" action="" method="post">
				<select name="state" id="state">
					<option value="1">전체</option>
					<option value="2">작성자</option>
					<option value="3">제 목</option>
					<option value="4">내 용</option>
				</select>
				<input type="text" id="key" name="key">
				<button type="button" onclick="searchlist()">검색</button>
			</form>
		</div>
		<br />
		<div>
			<table id="tb" border="1">
				<thead>
					<tr>
						<th>순번</th>
						<th>작성자</th>
						<th>제목</th>
						<th>작성일자</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${!empty boards }">
						<c:forEach items="${boards }" var="b">
							<tr onclick="boardinfo(${b.boardId })">
								<td>${b.boardId }</td>
								<td>${b.boardName }</td>
								<td>${b.boardTitle }</td>
								<td>${b.boardDate }</td>
								<td>${b.boardHit }</td>
							</tr>
						</c:forEach>
					</c:if>
					<c:if test="${empty boards }">
						<tr>
							<td colspan="5" align="center">게시글이 존재하지 않습니다.</td>
						</tr>
					</c:if>
				</tbody>
			</table>
			<form id="frm2" action="" method="post">
				<input type="hidden" id="boardId" name="boardId">
			</form>
			<div>
				<button type="button" onclick="location.href='boardInsertForm.do'">글
					등록</button>
				<button type="button" onclick="location.href='home.do'">홈으로</button>	
			</div>
		</div>

	</div>
</body>

<script>

	function boardinfo(data){
	frm2.boardId.value = data;
	frm2.action="boardContent.do"
	frm2.submit();		
			}

	function searchlist(){
		let list = document.querySelector('tbody');
		fetch('ajaxSearch.do',{
			method : 'POST',
			body : new FormData(document.getElementById('frm'))
		})
		.then(response => response.json())
		.then(data => {
			list.innHTML='';
			makeTbody(data);
		})
	}

	function makeTbody(Ary){
		let keys = ['boardId', 'boardName', 'boardTitle', 'boardDate', 'boardHit']
		Ary.forEach(b => {
			let tr = document.creatElement('tr')
			for(let key of keys){
				let td = document.createElement('td')
				td.innerHTML=b[key];
				tr.appendChild(td);
			}
			list.appendChild(tr);
		})
	}
</script>
</html>