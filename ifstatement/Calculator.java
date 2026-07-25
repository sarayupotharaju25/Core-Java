package ifstatement;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int a = 20;
		int b = 5;
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		switch(c) {
		case '+' : 
			int addition = a+b;
			System.out.println("add: " +addition);
		break;
		case '-' :
			int subtraction = a-b;
			System.out.println("sub: "+subtraction);
		break;
		case '*' :
			int multiplication = a*b;
			System.out.println("mul: " +multiplication);
		break;
		case '/' : 
			int division = a/b; 
			System.out.println("div: " +division);
		break;
		case '%' : 
			int mod = a%b;
			System.out.println("modulo: " +mod);
		break;
		default : System.out.println("invalid operator");
		}

	}

}
