package com.exercise38AjaxServer.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.exercise38AjaxServer.model.Employee;
import com.exercise38AjaxServer.model.PayRoll;

/**
 * Servlet implementation class salaryServlet
 */
@WebServlet("/salaryServlet")
public class salaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html chartset='utf-8'");
		PrintWriter output=response.getWriter();
		
		Employee myEmployee = new Employee();
		double salaryFinal = 0.0;
		
		myEmployee.setNameEmployee(request.getParameter("txtName"));
		myEmployee.setSalaryEmployee(Double.parseDouble(request.getParameter("txtSalary")));
		
		salaryFinal = PayRoll.SalaryFinal(myEmployee);
		
		output.append("The Final Salary is:" + salaryFinal);
		//output.append("Servlet correctly connected");
		output.close();
	}

}
