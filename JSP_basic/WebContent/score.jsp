<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--메소드 밖. 필드처럼 선언가능--%>
<%!
	int kor;
	int eng;
	int math;
	int sci;

	private int total(){
		return kor+eng+math+sci;
	}
%>

<%--메소드 안 --%>
<%
	this.kor = Integer.parseInt(request.getParameter("kor"));
	this.eng = Integer.parseInt(request.getParameter("eng"));
	this.math = Integer.parseInt(request.getParameter("math"));
	this.sci = Integer.parseInt(request.getParameter("sci"));
	
// 	private int total(){
// 		return 0;
// 	}
%>

<ul>
	<li>국어 : <%out.print(kor); %></li>
	<li>영어 : <%out.print(eng); %></li>
	<li>수학 : <%out.print(math); %></li>
	<li>과학 : <%out.print(sci); %></li>
	<li>총점 : <%out.print(total()); %></li>
	<li>평균 : <%out.print(total()/(float)4); %></li>
</ul>

</body>
</html>