package Problems;

public class RevWordString {

	public static void main(String[] args) {
		String S = "I am java developer";
		String[] arr=S.split(" ");
		String rev =" ";
		for(int i=arr.length-1;i>=0;i--) {
			rev = rev+arr[i]+" ";
			
		}
		System.out.println(rev);
		

	}

}
