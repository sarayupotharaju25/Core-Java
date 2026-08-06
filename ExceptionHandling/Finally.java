package ExceptionHandling;

public class Finally {
	public static void main(String[] args) {
		try {
			
			int num = 10/2;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			System.out.println("can't by 0");
			
			
		}finally{
			System.out.println("Program execution completed");
		}
		

	}

}



