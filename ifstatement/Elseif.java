package ifstatement;
import java.util.Scanner;

public class Elseif {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();
		
		char res;
		
		if(marks>=85) {
			res = 'A';
		}else if(marks>=75) {
		res = 'B';
	}else if (marks>=35) {
		res  = 'C';
	}else {
		System.out.println("res : fail");
	}
	}

}
