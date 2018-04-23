<%-- 
    Document   : jdbc_jsp
    Created on : Aug 29, 2017, 8:55:57 PM
    Author     : HP
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <form action="" method="post">
       <% String ageerror=""; String nameerror=""; %>
            NAME : 
            <input type="text" name="name" placeholder="NAME"><% 
               
            out.write(nameerror);
            %>
            <br><br>
            AGE :
            <input type="text" name="age" placeholder="AGE"><%
            out.write(ageerror);    
            %>
            <br><br>
            COMMENT : 
            <input type="text" name="comment" placeholder="COMMENTS" >
            <br><br>
            <input type="submit" value="ENTER">
        </form>
     
    
        <%
            
           try{
              String name=request.getParameter("name");
              if(name.equals(null)){
                  nameerror="enter the name";
              throw new Exception("name not entered");
              }
           String comment=request.getParameter("comment");
           if(comment.equals(null)){
               throw new Exception("comment please");
           }
           String agestr=request.getParameter("age");
           if(agestr.equals(null)){
              ageerror="enter the age";
              throw new Exception("enter age");
           }
           int age=Integer.parseInt(agestr);
           Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","12345");
           String sql="insert into servlet values(?,?,?)";
           
           PreparedStatement stmt=(PreparedStatement)con.prepareStatement(sql);
           stmt.setString(1,name);
           stmt.setInt(2, age);
           stmt.setString(3,comment);
           
           int bool=stmt.executeUpdate();
           String output="";
           if(bool>=0){
               output="DATA ENTERED";
           }else{
               output="DATA FAILED";
           }
           out.write(output);
           }
           catch(Exception e){
         out.write(""+e);
              
           }
        
            %>
    </body>
</html>
