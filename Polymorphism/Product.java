package Polymorphism;

public class Product {
	String name;
	double price;
	String category;
	
	public Product(String name){
		this.name=name;
		price = 0;
		category = "No";
	}
	public Product(String name,double price){
		this.name=name;
		this.price = price;
		category = "No";
	}
	public Product(String name,double price,String category){
		this.name=name;
		this.price = price;
		this.category = category;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Category: "+category);
		System.out.println();
	}

}
