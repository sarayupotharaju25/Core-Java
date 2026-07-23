package Arrays;
import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter : "+n);
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum +=arr[i];
		}
		double avg = (double)sum/n;
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
