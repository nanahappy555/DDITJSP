<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		int k=5;
		if(k>3){
			out.print("true");
		}
	%>
	
	<hr/>
	
	<c:set var="k" value="<%=k %>" />
	<c:if test="${k>3 }" >
		true
	</c:if>
</body>
</html>