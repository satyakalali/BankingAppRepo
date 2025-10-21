package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("    <title>Hello World Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <h1>Hello Satya Kalali, Welcome to Hello World Servlet Program! 123</h1>");
        out.println("    <p>This is a simple Java Servlet.</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
