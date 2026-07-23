package Polymorphism;

public class Mainticket {

	public static void main(String[] args) {
		MovieTicket m = new MovieTicket ();
		System.out.println("Book 1: ");
		m.bookTicket(2);
		System.out.println("Book 2: ");
		m.bookTicket(2,true);
		System.out.println("Book 3: ");
		m.bookTicket(2,true,40);
		
		

	}

}
