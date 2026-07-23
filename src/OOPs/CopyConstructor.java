package OOPs;

public class CopyConstructor {
	String brand;
	String model;
	int price;
	public CopyConstructor(String lbrand,String lmodel,int lprice) {
		brand = lbrand;
		model=lmodel;
		price = lprice;
	}
	public CopyConstructor(CopyConstructor l1) {
		brand = l1.brand;
		model=l1.model;
		price = l1.price;
	}
	public void display() {
		System.out.println("brand :"+brand);
		System.out.println("model:"+model);
		System.out.println("price :" +price);
	}

	public static void main(String[] args) {
		System.out.println("Laptop 1 : ");
		CopyConstructor l1 = new CopyConstructor("dell","inspiron 15",6200);
		
		CopyConstructor l2 = new CopyConstructor(l1);
		l1.display();
		System.out.println("Laptop 2 : ");
		l2.display();
	}

}
