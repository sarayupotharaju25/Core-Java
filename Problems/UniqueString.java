package Problems;

public class UniqueString {
	public static void  Unique(String s) {
		String str = " ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(str.indexOf(ch)==-1) {
			str+=ch;
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		Unique("sarayu");
		
		
		

	}

}
