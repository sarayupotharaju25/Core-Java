package Methods;
import java.util.Scanner;

public class Foodonline {
	    int quantity;
		double pricePerItem;
        String selectedItem;
        double totalBill;
        double discount;
        double fBill;
        
        void displaymenu() {
        	System.out.println("1 . Burger  -- Rs.150/-");
        	System.out.println("2 . Pizza   -- Rs.200/-");
        	System.out.println("3 . Pasta   -- Rs.250/-");
        	System.out.println("Enter choice : "); 
        }
        
         double calculateBill(int quantity,double price) {
        	  return quantity * price;
          }
          double calculatediscount(double bill) {
              if (bill>1000) {
            	  return bill * 0.10;
              }
              return 0.0;
            }
          void printBill() {
        	  System.out.println("Item ordered : "+selectedItem);
        	  System.out.println("Quantity: "+quantity);
        	  System.out.println("Price per unit: Rs "+pricePerItem);
        	  System.out.printf("Subtotal: Rs%.2f\n ",totalBill);
        	  System.out.printf("AppliedDiscount:Rs%.2f\n ",discount);
        	  System.out.printf("Total :  Rs%.2f\n",fBill);
          }
            public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	Foodonline order = new Foodonline();
        	order.displaymenu();
        	int choice = sc.nextInt();
        	switch(choice) {
        	case 1 :
        		order.selectedItem = "Burger";
        		order.pricePerItem = 150;
        		break;
        	case 2 :
        		order.selectedItem = "Pizza";
        		order.pricePerItem = 200;
        		break;
        	case 3 :
        		order.selectedItem = "Pasta";
        		order.pricePerItem = 250;
        		break;
        	default :
        		System.out.println("Invalid choice!");
        	}
        	
        	System.out.println("Enter quantity : "); 
        	order.quantity = sc.nextInt();
        	
        	
        	order.totalBill = order.calculateBill(order.quantity,order.pricePerItem);
        	order.discount=order.calculatediscount(order.totalBill);
        	order.fBill=order.totalBill-order.discount;
        	order.printBill();
	}

}
