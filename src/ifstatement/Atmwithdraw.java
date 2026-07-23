package ifstatement;
import java.util.Scanner;

public class Atmwithdraw {
	public static void main(String[]args) {
	int pin = 12345;
	int b = 200;
	Scanner sc = new Scanner(System.in);
	int cpin = sc.nextInt();
	int wb = sc.nextInt();
	
	if(pin == cpin) {
		if(b>=wb) {
			System.out.println("collect your cash");
		
	}else {
		System.out.println("insufficient balance");
	}
	}else {
		System.out.println("invalid pin");
	}
}

}
