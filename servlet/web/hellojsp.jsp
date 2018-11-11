<%-- 
    Document   : hellojsp
    Created on : Nov 4, 2018, 7:04:44 PM
    Author     : GAURAV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@ include file="morning.jsp" %>
<!DOCTYPE html>
<%! public int add(int a,int b){
return a+b;
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         addition is : <%out.println(add(5,5)); %>
    </body>
    
    
</html>
