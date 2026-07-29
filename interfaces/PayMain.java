package interfaces;

public class PayMain {
	
	    public static void main(String[] args) {

	        Payment payment = new UPIPayment();
	        Checkout checkout = new Checkout(payment);
	        checkout.processPayment(1500);

	        payment = new CreditCardPayment();
	        checkout = new Checkout(payment);
	        checkout.processPayment(2500);
	    }
	}


