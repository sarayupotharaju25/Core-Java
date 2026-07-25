package OOPs;

public class Employee2 {
	int id;
	String name;
	String dpt;
	int salary;
	
	public Employee2(int empid,String empname,String edpt,int empsalary) {
		id=empid;
		name=empname;
		dpt=edpt;
		salary=empsalary;
	}
	public void display() {
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Department: "+dpt);
		System.out.println("Employee Salary: "+salary);
	}

	public static void main(String[] args) {
		Employee2 e1=new Employee2(101,"Ravi","HR",35000);
		Employee2 e2=new Employee2(102,"Riya","Developer",55000);
		Employee2 e3=new Employee2(103,"Kiran","Testing",42000);
         e1.display();
         System.out.println(" ");
         e2.display();
         System.out.println(" ");
         e3.display();
	}

}
