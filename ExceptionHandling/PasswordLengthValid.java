package ExceptionHandling;

public class PasswordLengthValid {

	static String password ;
		 static void valid(String pass) {
		 
			 try {
			 if(pass.length()<8) {
				 
				 throw new InvalidLengthException("Length less than 8");
				 
			 }else {
				 System.out.println("Perfect length");
			 }
			 }catch(InvalidLengthException e) {
					e.printStackTrace(); 
			 
			 }	
		}
public static void main(String[] args) 
throws InvalidLengthException {
	
		valid("sara");
	System.out.println("program completed");
	
}

}
