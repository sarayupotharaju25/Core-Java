package Polymorphism;

public class Empsal {
	public void  calsal(double basicSalary) {
		System.out.println("Salary: "+basicSalary);
	}
	public void  calsal(double basicSalary,double bonus) {
		double salary = basicSalary+bonus;
		System.out.println("Salary: "+salary);
	}
	public void  calsal(double basicSalary,double bonus,double overtime) {
		double salary = basicSalary+bonus+overtime;
		System.out.println("Salary: "+salary);
	}

}
