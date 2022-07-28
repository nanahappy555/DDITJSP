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
마저써야됨~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~ㅠㅠ
<%
	int k=90;
	if (k>90) {
		out.print("A");
	}else if(k>80){
		out.print("B");
	}else if(k>70){
		out.print("C");
	}else if(k>60){
		out.print("D");
	}else {
		out.print("F");
	}
%>
<c:set var="k" value="90" />
<c:choose>
	<c:when test="${k ge 90 }" />
		A
</c:choose>
</body>
</html>