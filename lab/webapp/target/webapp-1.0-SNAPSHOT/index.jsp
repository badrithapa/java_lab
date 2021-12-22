<%-- 
    Document   : index
    Created on : Dec 19, 2021, 4:08:22 PM
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
        <br><br>
    <center>
        <h1>Printing "Kathmandu, Nepal" 10 times</h1>
        <hr color="blue" width="60%">
        <h2>
        <%
            for(int i=0;i<10;i++)
            out.print("\"Kathmandu, Nepal\"<br><br>");
        %>
        </h2>
        <<a href="hello"></a>
    </center>
        
    </body>
</html>
