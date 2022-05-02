<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
	<form name="frm" action="StudentGetServlet" method="get">
		<!-- get방식 : 주소에 전송된 값 보여짐
		 post방식 : 주소에 전송된 값 안보여짐 -->
		<input type="hidden" name="cmd" value="search">
		 ID: <input type="number" name="user_id" value="113"><br>
		 Name : <input type="text" name="user_name" value="홍길동"><br>
		 Eng : <input type="number" name="eng_score" value="89"><br>
		 Kor : <input type="number" name="kor_score" value="100"><br>
			 <input	type="submit" value="조회">
			 <input id="addBtn" type="button" value="입력">
			 <input	id="modBtn" type="button" value="수정">
			 <input	id="delBtn" type="button" value="삭제">
	</form>
		<hr>
	    <a href="studentList.jsp">리스트</a>
	<script>
		let modBtn = document.getElementById('modBtn');
		modBtn.addEventListener('click',function(){
			let frm = document.forms.frm;			
			frm.method = "post";
			frm.cmd.value = "mod"; //내가 정한 파라메터 값		
			frm.submit(); //submit버튼을 클릭
		})
	
		let delBtn = document.getElementById('delBtn')
		delBtn.addEventListener('click', function() {
			let frm = document.forms.frm;
			
			frm.method = "post";
			frm.cmd.value = "del"; //내가 정한 파라메터 값		
			frm.submit(); //submit버튼을 클릭
		});
	
		let btn = document.querySelector('#addBtn');
		btn.addEventListener('click', function() {
			let frm = document.forms.frm;
			
				//submit 이벤트 달기
				frm.action = 'StudentGetServlet';
				frm.method = "post";
				frm.cmd.value = "add";
		
							
				frm.submit(); //form의 submit.		
		});
		
		
	</script>
</body>
</html>