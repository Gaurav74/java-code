package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class jdbc_005fjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("     <form action=\"\" method=\"post\">\n");
      out.write("       ");
 String ageerror=""; String nameerror=""; 
      out.write("\n");
      out.write("            NAME : \n");
      out.write("            <input type=\"text\" name=\"name\" placeholder=\"NAME\">");
 
               
            out.write(nameerror);
            
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            AGE :\n");
      out.write("            <input type=\"text\" name=\"age\" placeholder=\"AGE\">");

            out.write(ageerror);    
            
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            COMMENT : \n");
      out.write("            <input type=\"text\" name=\"comment\" placeholder=\"COMMENTS\" >\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"submit\" value=\"ENTER\">\n");
      out.write("        </form>\n");
      out.write("     \n");
      out.write("    \n");
      out.write("        ");

            
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
        
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
