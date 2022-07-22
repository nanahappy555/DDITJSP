<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> 
<style>
table {
	border-collapse: collapse;
	border: lightgray;
}

input[type=text] {
	width: 245px;
	height: 20px;
}
#ac {
	border: 1px solid black;
	width: 188px;
	height: 40px;
}
input[type=button] {
	border: 1px solid black;
	width: 60px;
	height: 40px;
}
input[type=submit] {
	border: 1px solid black;
	width: 60px;
	height: 40px;
}
#num0 {
	width: 188px;
	height: 40px;
}

.num {
	background-color: gray;
}
.op {
	background-color: pink;
}


</style>
<script>

$(document).ready(function() {
	alert($(this).val());
});

function fn_clear(){
	location.href = "calculator";
}

</script>
</head>
<body>
<form method="post">
	<table border="1">
		<tr>
			<td colspan="4">
				<input type="text"  name="display" id="display" style="text-align:right" value="<%out.print(request.getAttribute("result"));%>" />
			</td>
		</tr>
		<tr>
			<td colspan="3">
				<input type="button" id="ac" name="ac" value="AC" onclick="fn_clear()" />
			</td>
			<td><input type="button" class="op" name="division" value="/"/></td>
		</tr>
		<tr>
			<td><input type="button" class="num" name="num7" value="7" /></td>
			<td><input type="button" class="num" name="num8" value="8" /></td>
			<td><input type="button" class="num" name="num9" value="9" /></td>
			<td><input type="button" class="op" name="multi" value="*" /></td>
		</tr>
		<tr>
			<td><input type="button" class="num" name="num4" value="4" /></td>
			<td><input type="button" class="num" name="num5" value="5" /></td>
			<td><input type="button" class="num" name="num6" value="6" /></td>
			<td><input type="button" class="op" name="minus" value="-" /></td>
		</tr>
		<tr>
			<td><input type="button" class="num" name="num1" value="1" /></td>
			<td><input type="button" class="num" name="num2" value="2" /></td>
			<td><input type="button" class="num" name="num3" value="3" /></td>
			<td><input type="button" class="op" name="plus" value="+" /></td>
		</tr>
		<tr>
			<td colspan="3">
				<input type="button" class="num" id="num0" value="0" />
			</td>
			<td><input type="submit" value="="/></td>
		</tr>
	</table>
</form>

<input type="text" id="leftValue" /> <br/>
<input type="text" id="operator" /> <br/>
<input type="text" id="rightValue" /> <br/>
</body>
</html>