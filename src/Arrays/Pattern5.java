package Arrays;

public class Pattern5 {

	public static void main(String[] args) {
		int n =5;
		int star =1;
		int space =n-1;
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*" +" ");
			}
				System.out.println();
				star++;
				space--;
			
		}
		 star = n-2;
		space =2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*" +" ");
			}
			System.out.println();
			star--;
			space++;
		}

	}

}
