/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myweb;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.*; //javax.servlet only works for tomcat 9 or below 
import jakarta.servlet.*; //since this is tomcat 10 we have to use jakarta.servlet as this is newer
import java.io.*;
import java.util.Date;


/**
 *
 * @author Badree
 */
public class Hello extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //To change body of generated methods, choose Tools | Templates.
         resp.setContentType("text/html");
         PrintWriter out = resp.getWriter();
         out.println("<a href=\"hello\">hello</a>\n" +
"        <br>\n" +
"        <a href=\"new\">new</a>\n" +
"        <br>\n" +
"        <a href=\"newjsp.jsp\">jsp</a>\n" +
"        <br>\n" +
"        <a href=\"index.html\">html</a>");
         out.println(new Date().toString());
    }
    
}
