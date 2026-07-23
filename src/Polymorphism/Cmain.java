package Polymorphism;

public class Cmain {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int sum = c.add(10,20);
		System.out.println(sum);
		System.out.println(c.add(10,20,30));
        Calculator.add(10.7, 20);
	}

}
