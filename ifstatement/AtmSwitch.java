package ifstatement;
import java.util.Scanner;

public class AtmSwitch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int atm = sc.nextInt();
	
	switch(atm) {
	case 1: System.out.println("your balance is 25000");
	break;
	case 2 : System.out.println("Enter amount to deposit : ");
	break;
	case 3: System.out.println("Enter ampont to withdraw : ");
	break;
	case 4: System.out.println("Displaying mini statement ");
	break;
	case 5: System.out.println("Thank you for using our ATM");
	 break;
	 default : System.out.println("invalid choice");
	}
 

	}

}
