<%@page import="com.jsp.dto.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
		</tr>
		<%
			List<MemberVO> memberList = (List<MemberVO>)request.getAttribute("memberList");
			for(MemberVO member : memberList) {
				pageContext.setAttribute("member",member);
		%>
		<tr>
			<!-- <td>${memberList[i].id }</td>
			<td>${memberList[i].pwd }</td> -->
			<td>${member.id }</td>
			<td>${member.pwd }</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>