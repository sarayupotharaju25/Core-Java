package OOPs;

public class Book {
	int bookId;
	String title;
	String author;
	int price;
	
	public Book() {
		bookId=101;
		title="java programming";
		author="james gosling";
		price = 650;
	}
	public void display() {
		System.out.println("BookId: " +bookId);
		System.out.println("Title: " +title);
		System.out.println("Author: " +author);
		System.out.println("Price: " +price);
	}

	public static void main(String[] args) {
		Book b1=new Book();
		System.out.println("book details");
		b1.display();
		

	}

}
