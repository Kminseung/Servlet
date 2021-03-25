package com.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
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

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// POST 방식 요청을 처리하기 위한 메서드
		// 폼으로 전송된 파라미터 받아오기
		// 폼의 입력 데이터의 인코딩
		req.setCharacterEncoding("UTF-8");
		// 폼 내의 input 태그의 name 속성
		String firstName = req.getParameter("First_name");
		String lastName = req.getParameter("Last_name");
		
		// 응답 객체에서 Writer 얻어옴
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Form Data</h1>");
		out.println("<p>성 : " + lastName + "</p>");
		out.println("<p>이름 : " + firstName + "</p>");
	}
	
	
}
