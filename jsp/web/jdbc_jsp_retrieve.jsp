<%-- 
    Document   : jdbc_jsp_retrieve
    Created on : Sep 4, 2017, 11:40:21 AM
    Author     : HP
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SEE DATA</title>
    </head>
    <body>
        <form action="" method="post">
            ENTER THE NAME : <input type="text" name="name" placeholder="NAME..">
            <br><br>
            <input type="submit" name="ok" value="SUBMIT">
            <%
         try{
          String name=" ";
          name=request.getParameter("name");
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","12345");
         PreparedStatement p=(PreparedStatement)con.prepareStatement("select * from servlet where name=?");
         p.setString(1,name);
         ResultSet s=p.executeQuery();
         out.newLine();
         out.write(name+" : ");out.newLine();%>
         <br>
         <%
         if(s!=null){
         while(s.next()){
             out.write(s.getString("age")+"  "+s.getString("comment")+" ");out.newLine();
             out.write("<br>");
         }}else{
             out.write("NO DATA");
         }
         }catch(Exception e){
             
         }                

                %>
        </form>
    </body>
</html>
