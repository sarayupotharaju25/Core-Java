package Loops;
import java.util.Scanner;
public class MulTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter : ");
		int num = sc.nextInt();
		for(int i =1;i<=10;i++) {
			int mul = num*i;
			
			System.out.println(mul);
		}

	}

}
