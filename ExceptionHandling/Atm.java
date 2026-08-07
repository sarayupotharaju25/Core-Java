package ExceptionHandling;

public class Atm {
	static int exp=2025;
	static void checkDate(int curdate)throws InvalidDateException{
		if(curdate>exp) {
			throw new InvalidDateException("Card has expired");
		}
		System.out.println("Card Working");
	}

	public static void main(String[] args) {
		try {
			checkDate(2024);
		}catch(InvalidDateException e) {
			e.printStackTrace();
		}
		
		System.out.println("program completed");
		}
		

	}
