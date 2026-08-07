package ExceptionHandling;

public class LowAttendanceException extends Exception{
	public LowAttendanceException(String att) {
		super(att);
	}

}
