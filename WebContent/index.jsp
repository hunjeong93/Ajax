<%@ page contentType ="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/bootstrap.css">
	<title>JSP AJAX</title>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</head>
<body>
	<br>
	<div class="container">
		<div class="form-group row pull-right">
			<div class="col-xs-8">
				<input class="form-control" type="text" size="20">				
			</div>
			<div class ="col-xs-2">
				<button class="btn btn-primary" type="button">검색</button>
			</div>
		</div>
		<table class="table" style="text-align : center ; border : 1px solid #dddddd">
			<thread>
				<tr>
					<th style="background-color: #fafafa;" text-align: center;">이름</th>
					<th style="background-color: #fafafa;" text-align: center;">나이</th>
					<th style="background-color: #fafafa;" text-align: center;">성별</th>
					<th style="background-color: #fafafa;" text-align: center;">이메일</th>
				</tr>
			</thread>
			<tbody>
				<tr>
					<td>곽훈정</td>
					<td>29</td>
					<td>남자</td>
					<td>rhkrgnswjd@gamil.com</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>