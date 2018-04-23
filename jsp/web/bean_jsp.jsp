<%-- 
    Document   : bean_jsp
    Created on : Sep 5, 2017, 10:06:10 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP BEANS page</title>
    </head>
    <body>
        <input type="text" name="name"><br>
        <jsp:useBean id="first_bean" class="bean_pack.beans_jsp">
            <jsp:setProperty name="first_bean" property="name" value="Gaurav kumar" />
            <jsp:setProperty name="first_bean" property="age" value="20" />
        </jsp:useBean >
   
        My name is:
        <jsp:getProperty name="first_bean" property="name" /><br>
        My age is: 
        <jsp:getProperty name="first_bean" property="age" /><br>
    </body>
</html>
