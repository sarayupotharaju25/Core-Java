package interfaces;

public class Checkout {
	private Payment payment;

    public Checkout(Payment payment) {
        this.payment = payment;
    }

    public void processPayment(double amount) {
        payment.pay(amount);
    }
}


