package Arrays;

public class Pattern6 {

	public static void main(String[] args) {
		int n=5;
		int star=1;
		int space=n-1;
		for(int i=1;i<n;i++) {
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
		}

	}

}
