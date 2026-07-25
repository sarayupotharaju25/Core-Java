package ifstatement;
import java.util.Scanner;

public class Smartdoor {

	public static void main(String[] args) {
		int p = 123;
		Scanner sc = new Scanner(System.in);
		
		boolean fm = sc.nextBoolean();
		boolean fr = sc.nextBoolean();
		int cp = sc.nextInt();
		
		if(fm) {
			if(fr) {
				if(p==cp) {
					System.out.println("successful");
				}else {
					System.out.println("invalid pin");
				}
			}else {
				System.out.println("invalid face");
			}
		}else {
			System.out.println("invalid finger");
		}
		

	}

}
