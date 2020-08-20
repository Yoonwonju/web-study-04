<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String appPath = application.getContextPath();
String filePath = application.getRealPath("index.jsp");
String serverInfo = application.getServerInfo();
%>
Web Application's Context Pass Name<br>
<b><%=appPath %></b><hr>
Web Application's File 경로명
<b><%=filePath %></b><br>
<hr>
<%
Enumeration<String> names = application.getInitParameterNames();
while(names.hasMoreElements()){
	String param = names.nextElement();

%>
	<li><%=param %> = <%=application.getInitParameter(param) %></li>
<%


}


%>
<ul></ul>
</body>
</html>