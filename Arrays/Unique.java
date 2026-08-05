package Arrays;

public class Unique {

	public static void main(String[] args) {
		int[] arr= {10,20,10,30,40};
		System.out.println("Unique Elements : ");
		for(int i=0;i<arr.length;i++) {
			boolean duplicate = false;
			for(int j=0;j<1;j++) {
				if(arr[i]==arr[j]) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				System.out.println(arr[i]);
			}
		}

	}

}
