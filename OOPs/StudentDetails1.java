package OOPs;

public class StudentDetails1 {
	static {
		System.out.println("Student Managment System Started");
	}
	{
		System.out.println("Student object created");
	}
	int id;
	String name;
	String course;

	public static void main(String[] args) {
		StudentDetails1 stu1=new StudentDetails1();
		stu1.id=101;
		stu1.name="Ravi";
		stu1.course="Java";
		StudentDetails1 stu2=new StudentDetails1();
		stu2.id=102;
		stu2.name="Priya";
		stu2.course="Python";
		System.out.println("Student1 : "+"\n" +"ID :" + stu1.id +"\n"+"Name : "+stu1.name+"\n"+"Course : "+stu1.course);
		System.out.println("Student2 : "+"\n" +"ID :" + stu2.id +"\n"+"Name : "+stu2.name+"\n"+"Course : "+stu2.course);
		
		
		
		

	}

}
