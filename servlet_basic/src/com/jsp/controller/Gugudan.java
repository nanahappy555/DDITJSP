package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class Gugudan extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String danStr = request.getParameter("dan");
		String gopStr = request.getParameter("gop");
		
		int danNum = Integer.parseInt(danStr);
		int gopNum = Integer.parseInt(gopStr);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); //콘솔->화면
		
		for(int dan=2; dan<danNum; dan++) {
			//System.out.println(dan+"단");
			out.println(danNum+"단<br/>");
			for(int gop=1; gop<gopNum; gop++) {
				//System.out.println(dan+"*"+gop+"="+(dan*gop));
				out.println(danNum+"*"+gopNum+"="+(danNum*gopNum)+"<br/>");
			}
//			System.out.println();
			out.println("<br/>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
