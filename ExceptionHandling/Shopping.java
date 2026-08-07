package ExceptionHandling;

public class Shopping {
	static int stock = 10000;
	static void order(int quant)throws InsufficientQuantityException{
		if(quant>stock) {
			
			throw new InsufficientQuantityException("Requested quantity insuffient");
		}
			System.out.println("Ordered Stock is available");
		}
		

	public static void main(String[] args) {
		try {

			order(1000000000);
		}catch(InsufficientQuantityException e) {
			e.printStackTrace();
		}
		
		System.out.println("program completed");
			
		}

	}


