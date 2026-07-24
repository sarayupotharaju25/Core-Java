package ifstatement;
import java.util.Scanner;
public class Food {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("p.pizza\nb.burger\ns.sandwich\ng.biryani\nc.coffee");
		System.out.println("oder please!!");
		char c = sc.next().charAt(0);
		switch(c) {
		case 'p' : System.out.println("Pizza\nPrice : 200");
		break;
		case 'b' : System.out.println("Burger\nPrice : 600");
		break;
		case 's' : System.out.println("Sandwich\nPrice : 1200");
		break;
		case 'g' : System.out.println("Biryani\nPrice : 26800");
		break;
		case 'c' : System.out.println("Coffee\nPrice : 2800");
		break;
		
		
		}
	
		

	}

}
