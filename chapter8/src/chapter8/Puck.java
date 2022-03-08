package chapter8;


	public class Puck extends Disk {
		
		 public double minStdWeight = 5;
		 public double maxStdWeight = 5.5;
		 public double minYthWeight = 4;
		 public double maxYthWeight = 4.5;
		 private double weight;
		 private boolean standard, youth; 
		 /**
		  * Constructor
		
		  */
		 public Puck(double t, double w) {
		 
			 super(1.5, 1);
		 
			 weight = w;
		
			 if (weight >= minStdWeight && weight <= maxStdWeight)  {
			 standard = true;
			 youth = false;
			 }
			 else {
				 youth = true;
				 standard = false;
				 }
		}
			 
		 /**
		  * Returns the weight of the disk
		
		  */
		 public double getWeight() 
		 {
			 return(weight);
			 }
			 
		 /**
		  * Returns the division.
	
		  */
		 public String getDivision() 
		 {
			 String div;
			 
			 if (standard) {
				 div = "Puck is standard";
				 } 
			     else {
				     div = "Puck is youth";
			         }
					 return(div);
		  }

		 /*
		  * Determines if the object is equal to another Puck object.
		*/
		 public boolean equales(Object obj) 
		 {
			 Puck testObj = (Puck)obj;
			 
			  if(testObj.getDivision() == getDivision()) 
			  {
				 return(true);
				 } 
			     else
			     {
					 return(false);
					 }
	     }
			 
		 /**
		  * Returns a String that represents thePuck object.
		 
		  */
		 public String toString() 
		 {
			 String puckString;
			 
			 puckString = "The puck has weight " + getWeight() + " and division " + getDivision() + ".";
			 return(puckString);
			 }
		 }


