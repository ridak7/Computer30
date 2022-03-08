package chapter8;

public class Staff extends UEmployee { //Start of Staff class inherits UEmployee

	private String jobtitle; //create a member private variable for job title

	public Staff() //default staff constructor
{
	super(); //Calls superclass UEmployee constructor of blank parameter
	
	jobtitle = ""; ///Sets depName as type ""//Calls superclass UEmployee constructor of blank parameter
	
	//Sets job title as type ""
}

    public Staff(String name, double salary, String job) { //Constructor which takes in name, salary and job
		
    	super(name, salary); // Calls UEmployee constructor passing name and salary to the super class UEmployee
		
		this.jobtitle = job;//sets departmentName to it's member variable department name
	}
			public String getJob() { //Gets job
				
				return this.jobtitle; //Enter your code here
				}
				
			public void setJob(String job) { //Sets job
					
					this.jobtitle = job; //Enter your code here
					
				  }
					
					public String toString() { //Start of toString, overrides default toString
						
						return this.getName() + " " + getSalary() + " " + getJob();// returns the employee's name, salary and job title
		
				}
			}