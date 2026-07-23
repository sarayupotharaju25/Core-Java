package ifstatement;
import java.util.Scanner;
public class Hospital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter temp : ");
		int bt = sc.nextInt();
		System.out.println("Enter oxygenlevel : ");
		int ol = sc.nextInt();
		
		if(ol<90) {
			System.out.println("Emergency");
		}
		else if(bt>102 && age>60) {
			System.out.println("High priority");
		}
		else {
			System.out.println("Normal priority");
		}
		

	}

}
