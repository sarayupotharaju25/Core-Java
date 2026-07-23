package Polymorphism;

public class MovieTicket {
	public void bookTicket(int tickets) {
		int amount = tickets*200;
		System.out.println("Total amount: "+amount);
	}
	public void bookTicket(int tickets,boolean isPremium) {
	      int amount;
		if(isPremium==true) {
			amount = tickets*350;
			
			
		}else {
		amount = tickets*200;
		}
		System.out.println("Total amount: "+amount);
			
	
	}
	public void bookTicket(int tickets,boolean isPremium,double discount) {
		double amount;
		if(isPremium) {
		amount = tickets*350;
		}
		else {
		amount	= tickets*200;
		}
		double finalamount = amount-(amount*discount/100);
		System.out.println("Amt before dis: "+amount);
		System.out.println("dis: "+discount+"%");
		System.out.println("Final amount: "+finalamount);	
			
				
			}
		
	}


