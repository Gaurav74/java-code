/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author GAURAV
 */
public class XmlServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     *
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
ServletContext context=request.getServletContext();
        System.out.println("Gaurav Kumar");
        response.getWriter().write("<h3>HELLO </h3>");
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        PrintWriter out = response.getWriter();
        if(name!=""&&(name!=null)){
        session.setAttribute("sname", name);
         context.setAttribute("cname", name);}
        
       
        out.write("my name is :" + name + " and session name is :" + 
                (String) session.getAttribute("sname") + "  and context is :"+context.getAttribute("cname"));

    } 
}
