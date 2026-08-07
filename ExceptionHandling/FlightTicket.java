package ExceptionHandling;

public class FlightTicket {
	static int availseats = 50;
	static void book(int selseats)throws InsufficientSeatsException{
		if(selseats>availseats) {
			throw new InsufficientSeatsException("No seats Available");
		}
		System.out.println("Seats Available");
		}

	public static void main(String[] args) {
		try {
			book(45);
		}catch(InsufficientSeatsException e) {
			e.printStackTrace();
		}
		System.out.println("Program successful");
		

	}

}
