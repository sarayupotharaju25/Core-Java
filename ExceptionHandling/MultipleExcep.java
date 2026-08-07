package ExceptionHandling;

public class MultipleExcep {

	public static void main(String[] args) {
		int[] arr = new int[2];
		int a = 10;
		int b = 0;
		try {
			int r = a/b;
			arr[3]=r;	
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide by 0");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of Bound");
		}
		System.out.println("Program success");
	}
}
