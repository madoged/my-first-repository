// Executive.java
// Author: Matt Doged
// Date: 11/3/19
// Purpose: Sort and calculate payroll information to display employee individual salary and salary expenditure per year.

public class Executive extends Employee {
	
	//class fields
	private double stockPrice;

	//constructor
	public Executive(String employeeName, int salaryMonth, double stockPrice) {
		super(employeeName, salaryMonth);
		this.stockPrice = stockPrice;
	}
	
	//no argument constructor
	public Executive() {
		super();
	}
	
	//method to calculate annual salary
	@Override
	public double annualSalary() {
		double annualSalary;
		final double stockBonus = 30000;
		annualSalary = (getSalaryMonth() * 12);
		
		if(stockPrice > 50) {
			annualSalary = annualSalary + stockBonus;
		}
		return annualSalary;
	}

	@Override //toString to print Executive objects
	public String toString() {
		return "Executive Employee Name=" + getEmployeeName() + ", salaryMonth=" + getSalaryMonth() + ", annualSalary=" + annualSalary();
	}


	//setter and getter methods
	public double getStockPrice() {
		return stockPrice;
	}


	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

}
