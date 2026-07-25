package Recursion;

public class Armstrong {
	static int arm(int n) {
		if(n==0) {
			return 0;
		}
		int rem = n%10;
		return rem*rem*rem+arm(n/10);
		
	}

	public static void main(String[] args) {
		int res=arm(153);
		System.out.println(res);

	}

}
