package Abstractclass;

public class RestMain {

	public static void main(String[] args) {
		Restaurant r1=new Shawarma("My friend's Circle","Suchitra");
		Restaurant r2 = new  Desserts("Pista house","Kompally");
		Restaurant  r3 = new  PavBhaji("Gokul chaat","Abids");
		r1.display();
		r1.prepareFood();
		System.out.println();
		r2.display();
		r2.prepareFood();
		System.out.println();
		r3.display();
		r3.prepareFood();
	}

}
