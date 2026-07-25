package Recursion;

public class Prime {
	static boolean prime(int n,int divn) {
		if(n==divn) {
			return true;
			}
		if(n%divn==0) {
			return false;
		}
		return prime(n,divn+1);
		}

	public static void main(String[] args) {
		boolean res =prime(5,2);
		if(res) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}

	}

}
