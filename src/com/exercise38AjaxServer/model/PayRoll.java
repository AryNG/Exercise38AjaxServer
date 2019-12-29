package com.exercise38AjaxServer.model;
import com.exercise38AjaxServer.model.Employee;
public class PayRoll {
	public static double SalaryFinal (Employee myEmployee) {
		return myEmployee.getSalaryEmployee()*1.30;
	}
}
