package ExceptionHandling;

public class ArrayIndex {

	public static void main(String[] args) {
		int[] arr = new int[2];
		
		try {
           arr[2]=0;
		}catch(ArrayIndexOutOfBoundsException e) {
   			System.out.println("Wrong Index");
   		}
   		System.out.println("Program success");

			
			
			
		
		}

	}


