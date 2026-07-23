package Methods;
import java.util.Scanner;
public class Student {
	double sub1,sub2,sub3,sub4,sub5;
	double total;
	double avg;
	String grade;
	void acceptmarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for 5 subjects : ");
		
		System.out.println("Subject 1: ");
		sub1=sc.nextDouble();
		
		System.out.println("Subject 2: ");
		sub2=sc.nextDouble();
		
		System.out.println("Subject 3: ");
		sub3=sc.nextDouble();
		
		System.out.println("Subject 4: ");
		sub4=sc.nextDouble();
		
		System.out.println("Subject 5: ");
		sub5=sc.nextDouble();
	}
	void total() {
		total = sub1+sub2+sub3+sub4+sub5;
	}
	void avg() {
		avg=total/5;
	}
	void grade() {
		if(avg>=90 && avg<=100) {
			grade = "A+";
	}else if(avg>=80 && avg<90) {
           grade = "A";
	}else if(avg>=70 && avg<80) {
		grade = "B";
    }else if(avg>=60 && avg<70) {
    	grade = "C";
	}else {
		grade = "Fail";
	}
}
	 void displayResult() {
		System.out.println("Subject 1: "+sub1);
		System.out.println("Subject 2: "+sub2);
		System.out.println("Subject 3: "+sub3);
		System.out.println("Subject 4: "+sub4);
		System.out.println("Subject 5: "+sub5);
		System.out.println("Total: "+total);
		System.out.println("Average: "+avg);
		System.out.println("Grade: "+grade);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		s.acceptmarks();
		s.total();
		s.avg();
		s.grade();
		s.displayResult();
		
		
			
			
			
			
			
				
				


	}

}
