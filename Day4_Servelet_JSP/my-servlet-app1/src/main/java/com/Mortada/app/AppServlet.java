package com.Mortada.app;

//Change from javax.servlet to jakarta.servlet
import jakarta.servlet.*;
import jakarta.servlet.http.*;
 
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class AppServlet extends HttpServlet{


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.write("<h1>Hellow Servlet with 'web.xml configuration'</h1>");
		out.write("<h2>Enter yout name</h2>");
		out.write("<FORM METHOD=GET ACTION='./hello-you'> ");
		out.println("<input type='text' name='your_name'/>");
		out.println("<input type='submit' value='ENTER'/>");
		out.write("</FORM> ");
		out.close();
    }

}
