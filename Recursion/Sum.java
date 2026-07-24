package Recursion;

public class Sum {
	int sum(int n) {
			if(n==0) {
				return 0;
			}
			return n%10+sum(n/10);	
		}
		public static void main(String[] args) {
			Sum res = new Sum();
			
			System.out.println(res.sum(123));

	}

}
