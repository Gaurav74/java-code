<%-- 
    Document   : login
    Created on : Sep 5, 2017, 11:24:19 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Struts page</title>
    </head>
    <body>
    <html:form action="/login">
        <table border="1">
            
            <tbody>
               <tr>
                    <td colspan="2"> 
                        <bean:write name="login_form" property="error" filter="false" />
                        &nbsp;
                                    </td>
                </tr>
                <tr>
                    <td>Enter your name :</td>
                    <td><html:text property="name" /></td>
                </tr>
                <tr>
                    <td>enter your email :</td>
                    <td><html:text property="email" /></td>
                </tr>
                <tr>
                    <td><html:submit value="login" /></td>
                </tr>
                
            </tbody>
        </table>

        
    </html:form>
    </body>
</html>
