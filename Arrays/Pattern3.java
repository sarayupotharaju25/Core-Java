package Arrays;

public class Pattern3 {

	public static void main(String[] args) {
		int n =4;
		int star=n;
		int space = 0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			star--;
			space++;
			System.out.println();
		}

	}

}
