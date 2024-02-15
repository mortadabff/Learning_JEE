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

public class HelloServlet extends HttpServlet{


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String yourName=req.getParameter("your_name");
        out.write("<h1>Hi "+ yourName+ " !<h1>");
		
		out.close();
    }

}
