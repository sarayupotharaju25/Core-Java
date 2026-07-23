package Arrays;

public class SumAtEven {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<5;i++) {
			
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		
			System.out.println(sum);
		}

	}


