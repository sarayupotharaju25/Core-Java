package Polymorphism;

public class Productmain {

	public static void main(String[] args) {
		Product p1=new Product("Dress");
		Product p2 = new Product("Pant",45678);
		Product p3 = new Product("Cot",6787,"mattress");
		p1.display();
		p2.display();
		p3.display();
		

	}

}
