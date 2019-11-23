// Salesman.java
// Author: Matt Doged
// Date: 11/3/19
// Purpose: Sort and calculate payroll information to display employee individual salary and salary expenditure per year.

public class Salesman extends Employee {
	
	//class fields
	private double annualSales;
	
	//constructor
	public Salesman(String employeeName, int salaryMonth, double annualSales) {
		super(employeeName, salaryMonth);
		this.annualSales = annualSales;
	}
	// no argument constructor
	public Salesman() {
		super();	
	}
	
	//method to calculate annual salary
	@Override
	public double annualSalary() {
		double baseSalary;
		double annualSalary;
		double annualCommissionMax = Math.min((annualSales * .02), 20000.0);
		baseSalary = (getSalaryMonth() * 12);
		annualSalary = baseSalary + annualCommissionMax;
	
		return annualSalary;
	}

	@Override //toString to print Salesman objects
	public String toString() {
		return "Saleman Employee Name=" + getEmployeeName() + ", salaryMonth=" + getSalaryMonth() + ", annualSalary=" + annualSalary();
	}
	
	
	//setter and getter methods
	public double getAnnualSales() {
		return annualSales;
	}

	public void setAnnualSales(double annualSales) {
		this.annualSales = annualSales;
	}
	
	

}
