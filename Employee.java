// Employee.java
// Author: Matt Doged
// Date: 11/3/19
// Purpose: Sort and calculate payroll information to display employee individual salary and salary expenditure per year.

public class Employee {
	
	//class fields 
	protected String employeeName;
	protected int salaryMonth;
	
	public Employee(int year, String position, String EmployeeName, int salaryMonth) {
		
	}
	// constructor	
	public Employee(String employeeName ,int salaryMonth) {
		this.employeeName = employeeName;
		this.salaryMonth = salaryMonth;
	}
	// no argument constructor
	public Employee() {
		super();
	}
	
	//method created to calculate annual salary
	public double annualSalary() {
		double annualSalary = (salaryMonth * 12);
		return annualSalary;
	}

	//setter and getter methods
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalaryMonth() {
		return salaryMonth;
	}

	public void setSalaryMonth(int salaryMonth) {
		this.salaryMonth = salaryMonth;
	}

	@Override //toString to print Employee objects
	public String toString() {
		return "Employee Name=" + employeeName + ", salaryMonth=" + salaryMonth + ", annualSalary=" + annualSalary();
	}
	
	

}
