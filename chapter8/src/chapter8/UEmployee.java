/*
Program: Uemployee.java          Last Date of this Revision: March 5 , 2022

Purpose: Create a UEmployee class that contains member variables for the university employee name and salary.
The UEmployee class should contain member methods for returning the employee name and salary.
Create Faculty and Staff classes that inherit the UEmployee class. 

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/
package chapter8;

public class UEmployee {
	
	private String name; //Create private member variables for employee name
	
	private double salary; // Create private member variable for employee salary
	
	
	
	public UEmployee(String name, double salary)
	{
		//UEmployee constructor which have parameters of name and salary and sets it to it's member variables
		this.name = name; 
		
		this.salary = salary;
	}
	
		public String getName() { //Gets the name
			return name;
			}
		
		    public double getSalary() { //Gets the Salary
				return salary;
				}
		    public void setName(String name) {
			this.name=name;
			
			}
		    public void setSalary(double salary) {
				this.salary=salary;
				
				}
		    

}


