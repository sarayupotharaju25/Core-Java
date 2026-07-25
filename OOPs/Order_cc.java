package OOPs;

public class Order_cc {
	int oid;
	String oname;
	double price;
	public Order_cc(int oid) {
		this.oid=oid;
		System.out.println("Order is created :" +oid);
	}
	public Order_cc(int oid,String oname) {
		this(oid);
		this.oname=oname;
		System.out.println("Order name: "+oname);
	}
	public Order_cc(int oid,String oname,double price) {
		this(oid,oname);
		this.price=price;
		System.out.println("Order price: "+price);
	}
	
	public static void main(String[] args) {
		Order_cc p1=new Order_cc(101,"Laptop",300000.0);
		

	}

}
