<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<%
	List<Map<String,Object>> bList=
	(List<Map<String,Object>>)request.getAttribute("bList");
	out.print(bList);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록 보기[WEB-INF]</title>
</head>
<body>
글목록 보기
</body>
</html>