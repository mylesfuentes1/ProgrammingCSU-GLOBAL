
public class employeesuperclass {
		private String firstName;
		private String lastName;
		private int employeeID;
		private double salary;


		
		//Constructor (Salary initialized to 0)//
		public employeesuperclass(String firstName, String lastName, int employeeID) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.employeeID = employeeID;
			this.salary = 0.0;
		}
		//Setters and Getters//
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public int getEmployeeID() {
			return employeeID;
		}
		
		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}
		
		public double getSalary() {
			return salary;
		}
		
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		//Print Attributes//
		
		public void employeeSummary() {
			System.out.println("Employee Summary:");
			System.out.println("Name: " + firstName + "" + lastName);
			System.out.println("Employee ID: " + employeeID);
			System.out.println("Salary: $" + salary);
		}
	
}

