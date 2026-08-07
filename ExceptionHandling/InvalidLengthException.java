package ExceptionHandling;

public class InvalidLengthException extends Exception {
	public InvalidLengthException(String pass) {
		super(pass);
	}

}
