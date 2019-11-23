// Main.java
// Author: Matt Doged
// Date: 11/3/19
// Purpose: Sort and calculate payroll information to display employee individual salary and salary expenditure per year.


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	
	//arrays to store employee objects
   static Employee emp2014[] = new Employee[10];
   static Employee emp2015[] = new Employee[10];
   static int empCount2014, empCount2015;//number of employees per year

   public static void main(String[] args) throws FileNotFoundException {
       //open file 
	   String fileName = "C:\\Users\\madog\\OneDrive\\Documents\\CMIS\\CMIS 242\\Project1\\src\\employee.txt";//filepath for the file to be read in
       Scanner file = new Scanner(new File(fileName));

       String line;
       while(file.hasNextLine()) {//read file per line
           line = file.nextLine();
           String results[] = line.split(" ");//each piece of data is split with a " " space
           if(results.length < 4) {
               file.close();
               throw new IllegalArgumentException("Data not correctly formatted. Found less than 4 arguments in a line.");
           } else {
               Employee e = null;
               if(results[1].equals("Employee")) {// checking what position the employee holds
                   e = new Employee(results[2], Integer.parseInt(results[3]));
               } else {
                   if(results.length < 5) {
                       file.close();
                       throw new IllegalArgumentException("Data not correctly formatted. Found less than 5 arguments in a line for Employee subclass.");
                   } else {
                       if(results[1].equals("Salesman")) {// checking what position the employee holds
                           e = new Salesman(results[2], Integer.parseInt(results[3]), Double.parseDouble(results[4]));
                       } else if(results[1].equals("Executive")) {// checking what position the employee holds
                           e = new Executive(results[2], Integer.parseInt(results[3]), Double.parseDouble(results[4]));
                       }
                   }
               }
               if(results[0].equals("2014")) {//checking what year the employee was paid
                   emp2014[empCount2014++] = e;
               } else if(results[0].equals("2015")) {//checking what year the employee was paid
                   emp2015[empCount2015++] = e;
               }
           }
       }
      
       //total sum of all salaries per year
       double sumSalaries2014 = 0, sumSalaries2015 = 0;
      
       System.out.println("Read data successfully from the file.\n");
       System.out.println("Printing Employee data:");

       System.out.println("\nEmployees' Data 2014: ");//print employee data for 2014
       for(int i=0; i<empCount2014; i++) {
           sumSalaries2014 += emp2014[i].annualSalary();
           System.out.println(emp2014[i] + ", Annual Salary: $" + emp2014[i].annualSalary());
       }
       System.out.println("\nEmployees' Data 2015: ");//print employee data for 2015
       for(int i=0; i<empCount2015; i++) {
           sumSalaries2015 += emp2015[i].annualSalary();
           System.out.println(emp2015[i] + ", Annual Salary: $" + emp2015[i].annualSalary());
       }
       System.out.println("++++++++++++++++++++++++++++++++++++++");

       System.out.println("Average annual salary for year 2014: " + (sumSalaries2014/empCount2014));
       System.out.println("Average annual salary for year 2014: " + (sumSalaries2015/empCount2015));
      
       file.close();
   }

}








