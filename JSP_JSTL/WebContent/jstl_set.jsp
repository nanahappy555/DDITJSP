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
<%-- 	<% pageContext.setAttribute("k", 1); %> --%>
	
	<c:set var="k" value="1" scope="page" />
	<c:set var="k" value="abc" scope="request" />
	
	<h1>k = ${k }</h1>
	<h1>request scope : k = ${requestScope.k }</h1>
	
	<c:remove var="k" scope="page" />
	
	//remove after
	<h1>k = ${pageScope.k }</h1>
	<h1>request scope : k = ${requesteScope.k }</h1>
</body>
</html>