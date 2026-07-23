package Loops;
import java.util.Scanner;

public class Skip5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: 1 ");
		int i = sc.nextInt();
		while(i<=50) {
			
			if(i%5==0) {
				i++;
			
			continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
