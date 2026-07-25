package ifstatement;
import java.util.Scanner;

public class Campusplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CGPA : ");
		float c = sc.nextFloat();
		System.out.println("Enter no.of backlogs : ");
		int b =sc.nextInt();
		System.out.println("Enter communication score : ");
		int cs = sc.nextInt();
		System.out.println("Aptitude Score : ");
		int as = sc.nextInt();
		
		if(b>=1) {
			System.out.println("Not eligible");
			
		}if(b==0) {
			if(c>=6.5) {
				if(cs>10 && as>20) {
				System.out.println("Eligible for placement");
			}
		}else {
			System.out.println("Eligible for return test only");
		}

	}else {
		System.out.println("not eligible");
	}

}
}
