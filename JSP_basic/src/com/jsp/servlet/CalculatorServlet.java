package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/calculatorForm.jsp";
		
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/calculatorResult.jsp";
		
		String display = request.getParameter("display");
		//12+34
		int firstNum = Integer.parseInt(display.substring(0,2));
		int lastNum = Integer.parseInt(display.substring(3));
		String operator = display.charAt(2)+"";
		
		int result = calculate(firstNum, lastNum, operator);
		
		request.setAttribute("result", result);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

	private int calculate (int firstNum, int lastNum, String operator) {
		
		int resultNum = 0;
		switch (operator) {
		case "+":
			resultNum = firstNum + lastNum;
			break;
		case "-":
			resultNum = firstNum - lastNum;
			break;
		case "*":
			resultNum = firstNum * lastNum;
			break;
		case "/":
			resultNum = firstNum / lastNum;
			break;
		}
		return resultNum;
	}
}
