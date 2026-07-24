package Polymorphism;

public class StAd {
	String name;
	String course;
	int fee;
	public StAd(String name) {
		this.name=name;
		course = "No";
		fee = 0;
	}
	public StAd(String name,String course) {
		this.name=name;
		this.course = course;
		fee = 0;
}
	public StAd(String name,String course,int fee) {
		this.name=name;
		this.course = course;
		this.fee = fee;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
		System.out.println("Fee: "+fee);
		System.out.println();
		
	}
}