package ifstatement;
import java.util.Scanner;

public class Internetbankingtransaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int accbal = sc.nextInt();
		int tranamou = sc.nextInt();
		boolean accstatus = sc.nextBoolean();
		if(accstatus) {
			if(accbal>=tranamou) {
				System.out.println("transaction successful");
			}else {
				System.out.println("Insufficient balance");
			}
		}else {
			System.out.println("Account blocked");
		
			}

	}

	}

