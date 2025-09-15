
public class SubclassManager extends employeesuperclass {
private String department;

	// This constructor will call employeesuperclass constructor//

public SubclassManager(String firstName, String lastName, int employeeID, String department) {
	super(firstName, lastName, employeeID);
	this.department = department;
}

// Setting up the Getter and setter for department//

public String getDeparment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

// This section will set Override employeeSummary to include department @Override//

public void employeeSummary() {
	super.employeeSummary();
	System.out.println("Department: " + department);
}

}
		
		

	


