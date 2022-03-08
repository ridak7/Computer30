package chapter8;

public class UEmployee {
	
	private String name; //Create private member variables for employee name
	
	private double salary; // Create private member variable for employee salary
	
	
	public UEmployee() { //Default UEmployee constructor.
	
		//Set employee name to be ""
		name = "";
		
		//set employee salary to be 0
		salary = 0;
	}
	
	public UEmployee(String name, double salary)
	{
		//UEmployee constructor which have parameters of name and salary and sets it to it's member variables
		this.name = name; //Enter your code here for setting the name
		
		this.salary = salary;//Enter your code here for setting the salary
	}
	
		public String getName() { //Gets the name
			return this.name;//Enter your code here
			}
		
		    public double getSalary() { //Gets the Salary
				return this.salary;// Enter your code here
				}
		

}


