package Abstractclass;

abstract class Restaurant {
	String name;
	String location;
	
	public Restaurant(String name,String location) {
		this.name=name;
		this.location=location;
	}
	public void display() {
		System.out.println("Restaurant Name: "+name);
		System.out.println("Restaurant Location: "+location);
	}
	public abstract void prepareFood();

}
