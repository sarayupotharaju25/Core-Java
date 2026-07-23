package OOPs;

public class Constructor {
	int age;
	String name;
	public Constructor() {
		age=23;
		name = "ram";
	}
	public void display() {
		System.out.println("age: "+age);
		System.out.println("name: "+name);
	}

	public static void main(String[] args) {
		Constructor s1=new Constructor();
		System.out.println("s1 details : ");
		s1.display();
		Constructor s2=new Constructor();
		System.out.println("s2 details : ");
		s2.display();
		

	}

}
