package ExceptionHandling;

public class MultipleExcep {

	public static void main(String[] args) {
		int[] arr = new int[2];
		int a = 10;
		int b = 8;
		try {
			
			
			int r = a/b;
			arr[3]=r;
			
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("can't by 0");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong Index");
		}
		System.out.println("Program success");

	}

}
