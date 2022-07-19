<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li>국어 : <%out.print(request.getParameter("kor")); %></li>
	<li>영어 : <%out.print(request.getParameter("eng")); %></li>
	<li>수학 : <%out.print(request.getParameter("math")); %></li>
	<li>과학 : <%out.print(request.getParameter("sci")); %></li>
	<li>총점 : <%out.print(request.getAttribute("total")); %></li>
	<li>평균 : <%out.print((int)request.getAttribute("total")/4f); %></li>
	<li>평균 : <%out.print(request.getAttribute("avg")); %></li>
</ul>

</body>
</html>