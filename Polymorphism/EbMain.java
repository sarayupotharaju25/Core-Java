package Polymorphism;

public class EbMain {

	public static void main(String[] args) {
		ElectricityBill b = new ElectricityBill();
		System.out.println("Bill 1: ");
		b.cB(380);
		System.out.println("Bill 2: ");
		b.cB(380,67);
		System.out.println("Bill 3: ");
		b.cB(380,67,56);

	}

}
