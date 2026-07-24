package ifstatement;
import java.util.Scanner;

public class GradeSwitch {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char g = sc.next().charAt(0);
		
		switch(g) {
		case 'A' : System.out.println("Excellent");
		break;
		case 'B': System.out.println("Very Good");
		break;
		case 'C' : System.out.println("Good");
		break;
		case 'D' : System.out.println("Need improvement");
		break;
		case 'F' : System.out.println("Fail");
		break;
		default:System.out.println("invalid grade");
		}

	}

}
