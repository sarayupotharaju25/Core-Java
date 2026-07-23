package Polymorphism;

public class Calculator {
	public int add(int a,int b) {
		System.out.println("Its 2 par");
		return a+b;
	}
	public int add(int a,int b,int c) {
		System.out.println("Its 3 par");
		return a+b+c;
	}
	public static void add(double a,int b) {
		System.out.println("Its 2 par but diff type"+a+b);
		
	}

}
