package ifstatement;
import java.util.Scanner;
public class Atmcashwithdraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ps = sc.nextInt();

		if (ps >= 90 && ps <= 100) {

			System.out.println("outstanding");
		} else if (ps >= 80 && ps <= 89) {
			System.out.println("excellent");
		}

		else if (ps >= 70 && ps <= 79) {
			System.out.println("good");
		} else if (ps >= 60 && ps <= 78) {
			System.out.println("average");
		}

		else {
			System.out.println("needs improvement");
		}

	}
}
