package OOPs;

public class Food {
	int id;
	String name;
	String item;
	String address;
	
	public Food(int id) {
		this.id=id;
		System.out.println("Food order Started "+"\n"+"Your Order id is: "+id);
	}
	public Food(int id,String name) {
		this(id);
		this.id=id;
		System.out.println("Restaurant: "+name);
	}
	public Food(int id,String name,String item) {
		this(id,name);
		this.item=item;
		System.out.println("Food Item: "+item);
	}
	public Food(int id,String name,String item,String address) {
		this(id,name,item);
		this.address=address;
		System.out.println("Delivery Address: "+address);
	}

	public static void main(String[] args) {
		Food f1=new Food(1001,"Paradise","Chicken Biryani","Hyderabad");

	}

}
