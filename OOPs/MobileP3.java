package OOPs;

public class MobileP3{
	int id;
	String brand;
	String model;
	int price;
	String color;
	public MobileP3(int mid,String mbrand,String modelm,int mprice,String mcolor) {
		id=mid;
		brand=mbrand;
		model=modelm;
		price=mprice;
		color=mcolor;
				
	}
	public MobileP3(MobileP3 m2) {
		id=m2.id;
		brand=m2.brand;
		model=m2.model;
		price=m2.price;
		color=m2.color;
	}
	
	public MobileP3() {
		id=1001;
		brand="samsung";
		model ="Galaxy A35";
		price = 28000;
		color = "Blue";
	}
	public void display() {
		System.out.println("id : "+id+"\n"+"brand :"+brand+"\n"+"model: "+model+"\n"+"price :"+price+"\n"+"color : "+color);
	}

	public static void main(String[] args) {
		MobileP3 m1 = new MobileP3();
		System.out.println("Mobile 1 :");
		m1.display();
		
		MobileP3 m2 = new MobileP3(1002,"Oneplus","Nord CE 5",24999,"Black");
		System.out.println("Mobile 2: ");
		m2.display();
		System.out.println("Mobile 3 : ");
		MobileP3 m3 = new MobileP3(m2);
		m3.price = 23000;
		m3.display();
		
		
		

	}

}
