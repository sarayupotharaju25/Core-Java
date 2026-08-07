package ExceptionHandling;

public class ArrayIndex {

	public static void main(String[] args) {
		int[] arr = new int[2];
		
		try {
           arr[2]=0;
		}catch(ArrayIndexOutOfBoundsException e) {
   			System.out.println("Index Out of Boundary");
   		}
   		System.out.println("Program success");
      }

	}


