<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import ="com.epam.reader.web.ReaderBean" %>
<jsp:useBean id="reader" scope="request" class = "com.epam.reader.web.ReaderBean"></jsp:useBean>
<html>
<head>
  <title>Gradle tutorial</title>
</head>
<body>
<h1><%= reader.read()%></h1>
</body>
</html>

