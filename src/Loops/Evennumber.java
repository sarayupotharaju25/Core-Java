 package Loops;
import java.util.Scanner;
public class Evennumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean found = false;

		
		
		for(int i=1;i<=10;i++) {
			System.out.println("enter integer : ");
			int num = sc.nextInt();
			
			
			if(num%2==0) {
				System.out.println("Enter first even number :" +num);
				found = true;
				break;
			}
		}
			if(!found) {
				System.out.println("no even number entered");
			}
		}
		
		

	}


