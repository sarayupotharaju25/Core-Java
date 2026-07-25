package ifstatement;
import java.util.Scanner;

public class Nestedif {
	public static void main(String[]args) {
		String name = "wertyu";
		int password = 3456;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String uname=sc.next();
		System.out.println("Enter your password : ");
		int upw=sc.nextInt();
		
		if(name.equals(uname)) {
			if(password==upw) {
				System.out.println("login successful");
			  }else {
				System.out.println("Invalid password");
			   } 
			
		}else {
			System.out.println("Invalid username");
		}
		
	}

}
