package OOPs;

public class EmployeeP2 {
	static {
		System.out.println("Company information loaded");
	}
	{
		System.out.println("Employee object created");
	}
	int empid;
	String empname;
	double empsalary;
	static String companyName = "ABC Technologies";

	public static void main(String[] args) {
		EmployeeP2 emp1 = new EmployeeP2();
		emp1.empid = 101;
		emp1.empname = "Rahul";
		emp1.empsalary=900000;
		EmployeeP2 emp2 = new EmployeeP2();
		emp2.empid = 102;
		emp2.empname = "Sneha";
		emp2.empsalary=500000;
		EmployeeP2 emp3 = new EmployeeP2();
		emp3.empid = 103;
		emp3.empname = "Arjun";
		emp3.empsalary=10000000;
		System.out.println("Employee1" + "\n"+"ID :"+ emp1.empid+"\n"+"Name: "+emp1.empname+"\n"+"Salary :"+emp1.empsalary+"\n"+companyName);
		System.out.println("Employee2" + "\n"+"ID :"+ emp2.empid+"\n"+"Name: "+emp2.empname+"\n"+"Salary :"+emp2.empsalary+"\n"+companyName);
		System.out.println("Employee3" + "\n"+"ID :"+ emp3.empid+"\n"+"Name: "+emp3.empname+"\n"+"Salary :"+emp3.empsalary+"\n"+companyName);
		
		

	}

}
