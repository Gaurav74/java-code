<%-- 
    Document   : first
    Created on : Aug 29, 2017, 8:07:22 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String num1=request.getParameter("first");
          String num2=request.getParameter("second");
          String c=request.getParameter("sym");
          int first=Integer.parseInt(num1);
          int second=Integer.parseInt(num2);
          int last=0;
           if(c.equals("+")){
            last=first+second;   
           }else
               if(c.equals("-")){
                last=first-second;   
               }else
                   if(c.equals("*")){
                       last=first*second;
                   }else
                       if(c.equals("/")){
                           last=first/second;
                       }
           out.write("The output is : "+last);
        %>
    </body>
</html>
