/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.webapp;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
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
         out.println("<h1> this is from the servlet class hello</h1>");
         out.println(new Date().toString());
    }
    
}
