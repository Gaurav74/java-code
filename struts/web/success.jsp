<%-- 
    Document   : success
    Created on : Sep 5, 2017, 11:36:06 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body>
        <h1>congratulations !</h1>
        <p>you have successfully logged in.</p>
        <p>your name is : .</p>
        <p>your email is id : .</p>
       <p> your id is : <bean:write name="login_form" property="name" />.</p>
        <p> your id is : <bean:write name="login_form" property="email" />.</p>
        
    </body>
</html>
