package com.exercise38AjaxServer.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exercise38AjaxServer.model.Employee;
import com.exercise38AjaxServer.model.PayRoll;

/**
 * Servlet implementation class salaryServlet2
 */
@MultipartConfig
@WebServlet("/salaryServlet2")
public class salaryServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json chartset='t'utf-8'");
		PrintWriter output = response.getWriter();
		
		Employee myEmployee = new Employee();
		double salaryFinal = 0.0;
		
		myEmployee.setNameEmployee(request.getParameter("txtName"));
		myEmployee.setSalaryEmployee(Double.parseDouble(request.getParameter("txtSalary")));
		
		salaryFinal = PayRoll.SalaryFinal(myEmployee);
		
		output.append("{\"Calculated Salary\" : "+ salaryFinal+"}");
		//output.append("Servlet correctly connected");
		output.close();
	}

}
