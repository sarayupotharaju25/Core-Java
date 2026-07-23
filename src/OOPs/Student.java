package OOPs;

public class Student {
	String name;
     int age;
     static String instituteName="codegnan";
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "sarayu";
		st1.age = 21;
		Student st2 = new Student();
		st2.name =  "keerthi";
		st2.age = 22;
		Student st3 = new Student();
		st3.name = "Teja";
		st3.age = 23;
		System.out.println(st1.name+" "+st1.age+" "+instituteName);
		System.out.println(st2.name+" "+st2.age+" "+instituteName);
		System.out.println(st3.name+" "+st3.age+" "+instituteName);
		
		

	}

}
