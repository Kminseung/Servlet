package com.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String name = req.getParameter("name");
		if(name == null) {
			name = "Anonymous";
		}
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>Hello, Servlet</h1>");
		out.println("<p>Welcome, " + name + "</p>");
	}
}
