package ifstatement;
import java.util.Scanner;

public class Scholarship {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float cgpa = sc.nextFloat();
		int a = sc.nextInt();
		int ic = sc.nextInt();
		
		if(cgpa>=8.5){
			if(a>=85){
				if(ic<300000) {
					System.out.println("Scholarship is awarded");
				}else {
					System.out.println("high income");
				}
			}else {
				System.out.println("low attendance");
			}
		}else {
			System.out.println("low cgpa");
		}
		

	}

}
