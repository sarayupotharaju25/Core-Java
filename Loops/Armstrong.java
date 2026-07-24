package Loops;

public class Armstrong {

	public static void main(String[] args) {
		int n = 153;
		int sum = 0;
		int temp = 153;
		
		while(n!=0) {
			int digit = n%10;
			sum = sum + (digit*digit*digit);
			n = n/10;
			
		}if(sum == temp) {
			System.out.println(sum);
		}
		

	}

}
