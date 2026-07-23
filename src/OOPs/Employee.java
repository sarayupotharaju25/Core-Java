package OOPs;

public class Employee {
	String name;
	static {
	
	    System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.name="Keerthi";
		
		System.out.println(emp1.name);
		

	}

}
