<%-- 
    Document   : tag
    Created on : Aug 27, 2022, 8:27:29 PM
    Author     : Shivam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri ="/WEB-INF/tlds/mylib" prefix="t"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    <t:mytag></t:mytag>
  
    <t:printTable number="25" color="red"> </t:printTable>
    
    </body>
</html>
