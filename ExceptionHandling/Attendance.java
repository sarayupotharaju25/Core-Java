package ExceptionHandling;

public class Attendance {
	static int minatt =75;
	 static void valid(int att)throws LowAttendanceException{
	 
		 try {
		 if(att<minatt) {
			 System.out.println("Low attendance");
			 throw new LowAttendanceException("Attendance less than 75");
			 
		 }
		 }catch(LowAttendanceException e) {
				e.printStackTrace(); 
		 
		 }	
	}
public static void main(String[] args) 
throws LowAttendanceException {

	valid(45);
System.out.println("program completed");

}




	
		

	}


