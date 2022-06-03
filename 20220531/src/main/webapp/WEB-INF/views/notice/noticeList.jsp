<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jquery-3.6.0.min.js">

</script>
</head>
<style>
table tr:hover {
	cursor:pointer;
	background:gray;
}
</style>
<body>
<div align="center">
	<div><h1>공지사항 목록</h1></div>
	<div>
		<form id="frm" action="" method="post">
			<select name="state" id="state">
				<option value="1">전 체</option>
				<option value="2">작성자</option>
				<option value="3">제 목</option>
				<option value="4">내 용</option>
			</select>&nbsp;
			<input type="text" id="key" name="key">&nbsp;
			<button type="button" onclick="searchList()">검색</button>
		</form>
	</div><br/>
	<div>
		<table id="tb" border="1">
		<thead>
		<tr>
		<th width="70">순번</th>
        <th width="150">작성자</th>
		<th width="300">제목</th>
		<th width="150">작성일자</th>
		<th width="70">조회수</th>
		<th width="110">첨부파일</th>
		</tr>
		</thead>
		<tbody>
		
			<c:if test="${not empty notices }">
				<c:forEach items="${notices }" var="n">
					<tr onclick="eventList(${n.noticeId })">
						<td>${n.noticeId }</td>
						<td>${n.noticeName }</td>
						<td>${n.noticeTitle }</td>
						<td>${n.noticeDate }</td>
						<td>${n.noticeHit }</td>
						<td>${n.noticeAttech }</td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${empty notices }">
				<tr>
					<td colspan = "6" align="center"> 게시글이 존재하지 않습니다.</td>
				</tr>
			</c:if>
		</tbody>
		</table>
				<form id ="frm2" action="" method="post">
				<input type="hidden"id="noticeId" name="noticeId">
				</form>	
	</div><br>
	<div>
		<button type="button" onclick="location.href='noticeInsertForm.do'">글 등록</button>
	</div>
</div>
</body>

<!-- 그룹이벤트 (상세조회) -->
<script>

	function eventList(data){
//	let list = document.querySelector('tbody');
//	list.addEventListener('click',function(ev){
	//	if(ev.target.tagName === 'TD'){
		//주석처리 > get 방식
		//console.log(ev.target.parentNode.children[0].textContent);
		//location.href='getContent.do?noticeId='+ev.target.parentNode.children[0].textContent;
		frm2.noticeId.value = data;
		frm2.action="getContent.do";
		frm2.submit();
	//	}		
	//	});
	}
	
	function searchList(){
		let state = $("#state").val(); //document.getElementById("state").value
		let key = $("#key").val(); 
		
		$.ajax({
			url : "ajaxSearchList.do", //url
			type : "post", //전송방식
			data : {"state" : state, "key" : key}, //전달할 데이터(json 타입으로 던지기)
			dataType : "json", //돌려받을 결과의 데이터 타입 ex)html, text, xml, json ..
			success : function(rs){ //성공했을 때 실행 할 함수.. 결과는 rs에 담김
				htmlConvert(rs);
			},
			error : function(){ //실패했을 때 수행할 함수
				alert('오류 발생')
			}
		});
	}
	
	function htmlConvert(rs){
		$("tbody").remove(); //tbody 삭제
		let tbody = $("<tbody/>");
		$.each(rs,function(index, n){ //배열 객체
			var row = $("<tr onclick = 'eventList("+n.noticeId+")'/>").append(
					  $("<td/>").text(n.noticeId),
					  $("<td/>").text(n.noticeName),
					  $("<td/>").text(n.noticeTitle),
					  $("<td/>").text(n.noticeDate),
					  $("<td/>").text(n.noticeHit),
					  $("<td/>").text(n.noticeAttech)
				);
			tbody.append(row); //행을 추가
		})
		$("#tb").append(tbody); //tbody를 추가
	}
	
</script>
<script type="text/javascript">
	/* function searchList(){
	let list = document.querySelector('tbody');
	fetch('ajaxSearchList.do',{
		method : 'POST',
		body : new FormData(document.getElementById('frm'))
	})
	.then(response => response.json())
	.then(data => {
			list.innerHTML='';
			makeTbody(data);
		})
	}
	
	function makeTbody(Ary){
		let keys =['noticeId','noticeName','noticeTitle','noticeDate','noticeHit' ,'noticeAttech'];
		Ary.forEach(n => {
			let tr = document.createElement('tr')	
			for (let key of keys) {
			let td = document.createElement('td')
			td.innerHTML=n[key];
			tr.appendChild(td);
			}
			list.appendChild(tr);
		})
			
	} */
	
</script>
</html>