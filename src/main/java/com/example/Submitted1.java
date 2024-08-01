package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Submitted1
 */
@WebServlet(urlPatterns = {"/submited"})
public class Submitted1 extends HttpServlet {
		public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
			String id = req.getParameter("id");
			String names = req.getParameter("names");
			
			PrintWriter out = res.getWriter();
			out.println(id);
			out.println(names);
		}
		
}
