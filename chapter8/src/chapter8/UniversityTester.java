
package chapter8;

public class UniversityTester {
	public static void main(String[] args) {
		
		UEmployee bob = new UEmployee();
		assert bob.getName().equals("bob") ;
		assert (bob.getSalary() == 0);
		
		UEmployee alice = new UEmployee("alice", 8000);
		assert (alice.getName().equals("alice"));
		assert (alice.getSalary() == 8000);
		
		Faculty arts = new Faculty();
		assert (arts.getName().equals(""));
		assert (arts.getSalary() == 0);
		assert (arts.getDepartment().equals(""));
		arts.setDepartment("Math");
		assert (arts.getDepartment().equals("Math"));
		assert (arts.toString().equals(" 0 Math"));
		
		
		Faculty engineering = new Faculty("Bob", 8000, "Engineering");
		assert (engineering.getName().equals("Bob"));
		assert (engineering.getSalary() == 8000);
		assert (engineering.getDepartment().equals("Engineering"));
		assert (arts.toString().equals("Bob 8000 Engineering"));
		
		
		Staff alex = new Staff();
		assert (alex.getName().equals(""));
		assert (alex.getSalary() == 0);
		assert (alex.getJob().equals(""));
		alex.setJob("Teacher");
		assert (alex.getJob().equals("Teacher"));
		assert (alex.toString().equals(" 0 Teacher"));
		
		
		Staff jordan = new Staff("Jordan", 9000, "Dev");
		assert (alex.getName().equals("Jordan"));
		assert (alex.getSalary() == 9000);
		assert (alex.getJob().equals("Dev"));
		assert (alex.toString().equals("Jordan 9000 Dev")); 
		}

}
