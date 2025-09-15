
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This line will create the employee object//
		
		employeesuperclass emp1 = new employeesuperclass("Myles", "Fuentes", 1);
		emp1.setSalary(65000);
		emp1.employeeSummary();
		
		System.out.println();
		
		
		//This line will create the manager object//
		
		SubclassManager mgr1 = new SubclassManager("David", "White", 2, "Finance");
		mgr1.setSalary(85000);
		mgr1.employeeSummary();
		
	}

}
