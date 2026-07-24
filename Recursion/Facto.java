package Recursion;

public class Facto {
	
	 int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		Facto f = new Facto();
		System.out.println(f.fact(4));
		

	}

}
