<%@page import="java.util.ArrayList"%>
<%@page import="com.jsp.dto.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for(int i=1; i<11; i++) {
			out.print(i+"<br/>");
		}
	%>
	
	<hr/>
	<c:forEach var="i" begin="1" end="10" step="1">
		${i }<br/>
	</c:forEach>
	
	<hr/>
	<%
		int[] data= {1,2,3,4,5,6,7,8,9,10};
		for(int i : data){
			out.print(i+"<br/>");
		}
	%>
	<hr/>
<%-- 	<c:set var="data" value="1,2,3,4,5,6,7,8,9,10" /> 
		스크립트릿 영역에 data배열이 없으면 리터럴값 넣는 c:set이 필요하다. 어트리뷰트 넣어주는 부분--%>
	<c:set var="data" value="<%=data %>" />
	<c:forEach var="i" items="${data }" >
		${i }<br/>
	</c:forEach>
	
	<hr/>
	
	
	<%
		List<MemberVO> memberList = new ArrayList<MemberVO>();		
		for(int i=0;i<100;i++) {
			memberList.add(new MemberVO("mimi"+i,"mimi"+i));
		}
		request.setAttribute("memberList",memberList); //c:set대신	
	%>
	
	<c:forEach var="member" items="${memberList }" >
		<h3>아이디 : ${member.id } , 패스워드 : ${member.pwd } </h3>		
	</c:forEach>
</body>
</html>