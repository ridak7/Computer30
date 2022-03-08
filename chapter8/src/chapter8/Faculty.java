package chapter8;

	public class Faculty extends UEmployee { //Start of Faculty class which inheritsUEmployee
	
		private String depName; //Create private member variables for department name
		
		public Faculty() 
		{
			super(); //Calls superclass UEmployee constructor of blank parameter
			depName = ""; ///Sets depName as type ""
	    }
		public Faculty(String name, double salary, String departmentName) { //Faculty constructor which takes in name, salary and depName
			super(name, salary); // Calls UEmployee constructor passing name and salary to the super class UEmployee
			
			this.depName = departmentName;//sets departmentName to it's member variable department name
		}
      
		public String getDepartment()  { //Returns department
		    
			return this.depName;
		    }
		       public void setDepartment(String department) {
			     
		    	   this.depName = department; //set department
			       
		       }
		           public String toString() { //Start of toString which replaces original toString
		
		   	             return this.getName() + " " + getSalary() + " " + getDepartment(); // returns the employee's name, salary and department name
		           }
	
	}
