<%-- 
    Document   : newjsp
    Created on : Dec 20, 2021, 9:40:59 PM
    Author     : Badree
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>Hello World jsp!</h1>
        <a href="hello">hello</a>
        <br>
        <a href="new">new</a>
        <br>
        <a href="newjsp.jsp">jsp</a>
        <br>
        <a href="index.html">html</a>
        <hr color="blue" width="60%">
        <%
            for(int i= 0 ; i<10;i++){
                out.println("<h3>&quot;Kathmandu, Nepal&quot;</h3>");
            }
        %>
            
    </body>
</html>
