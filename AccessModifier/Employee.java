package AccessModifier;

public class Employee {
	 public String employeeName;
	 private double salary;
     protected String department;
     int employeeId;
     public void setSalary(double salary) {
	        this.salary = salary;
	    }
     public double getSalary() {
	        return salary;
	    }
      protected void showDepartment() {
	        System.out.println("Department: " + department);
	    }
	    void showEmployeeId() {
	        System.out.println("Employee ID: " + employeeId);
	    }
	    private double calculateBonus() {
	        return salary * 0.10;
	    }
	    public void displayBonus() {
	        System.out.println("Bonus: " + calculateBonus());
	    }
	}



