package chapter8;

	public class Faculty extends UEmployee { //Start of Faculty class which inheritsUEmployee
	
		private String departmentName; //Create private member variables for department name
		
		public Faculty(String name, double salary, String departmentName) { //Faculty constructor which takes in name, salary and depName
			super(name, salary); // Calls UEmployee constructor passing name and salary to the super class UEmployee
			
			this.departmentName = departmentName;//sets departmentName to it's member variable department name
		}
      
		public String getDepartment()  
		{ //Returns department
		    
			return departmentName;
		    
		}
		       public void setDepartment(String departmentName) {
			     
		    	   this.departmentName = departmentName; //set department
			       
		       }
		          
		           
	
	}
