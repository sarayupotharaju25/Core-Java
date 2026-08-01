package AccessModifier;

public class Manager extends Employee{
	    public void displayDetails() {
	        System.out.println("Employee Name: " + employeeName);
	        System.out.println("Department: " + department);
	        showDepartment();
	        showEmployeeId();
	        System.out.println("Salary: " + getSalary());
	        displayBonus();
	    }
	}



