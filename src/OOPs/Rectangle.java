package OOPs;

public class Rectangle {
	double length;
	double breadth;

	public static void main(String[] args) {
		Rectangle rect1 =new Rectangle();
		rect1.length = 10;
		rect1.breadth=40;
		System.out.println(rect1.length +" "+ rect1.breadth);
		double area=rect1.length*rect1.breadth;
		Rectangle rect2 = new Rectangle();
		rect2.length=70;
		rect2.breadth=90;
		System.out.println(rect2.length +" " +rect2.breadth);
		double prm=2*(rect2.length+rect2.breadth);
		
		System.out.println(area);
		System.out.println(prm);
		
		
		
		

	}

}
