package ifstatement;
import java.util.Scanner;
public class Incometax {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		
		if(i<=400000) {
			System.out.println("No Tax");
		}else if(i<=800000 ){
			System.out.println("tax : " +i*(5.0/100.0));
		}else if(i<=1200000 ) {
			System.out.println("tax : " +i*(10.0/100.0));
		}else if(i<=2000000 ){
			System.out.println("tax : "+i*(20.0/100.0));
		}else if(i>2000000) {
			System.out.println("tax : " +i*(30.0/100.0));
		}
	}

}
