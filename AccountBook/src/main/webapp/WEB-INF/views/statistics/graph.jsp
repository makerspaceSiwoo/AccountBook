<%@ page  contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h4>지출 그래프 페이지 입니다.</h4>
	<div id="Date">
		<p>날짜를 선택해 주세요</p>
		<form>
			<input id="start" type="date"> ~ <input id="end" type="date">
		</form>
		<button id="click">submit</button>
	</div>
	
	<div id="graph">
	</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	$("#click").click(function(){
		$.getJSON("/statistics/graph",{"start":$("#start").val(), "end":$("#end").val()}, function(data){
			console.log(0);
			console.log(data);
			/* $.each(data, fucntion(index,item){
				$("#graph").append(`<p>${item.date} : ${item.amount} </p>`);
			}); */
		}).fail(function(){
			alert("failed");
		});
	});
</script>
</html>