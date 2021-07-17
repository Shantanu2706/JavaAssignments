import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Book book = new Book();
		System.out.println("Enter book no: ");
		book.setBookNo(scanner.nextInt());
		System.out.println("Enter book title: ");
		book.setTitle(scanner.next());
		System.out.println("Enter book author: ");
		book.setAuthor(scanner.next());
		System.out.println("Enter book price: ");
		book.setPrice(scanner.nextFloat());
		
		EngineeringBook book2 = new EngineeringBook();
		System.out.println("Enter book no: ");
		book2.setBookNo(scanner.nextInt());
		System.out.println("Enter book title: ");
		book2.setTitle(scanner.next());
		System.out.println("Enter book author: ");
		book2.setAuthor(scanner.next());
		System.out.println("Enter book price: ");
		book2.setPrice(scanner.nextFloat());
		System.out.println("Enter book category: ");
		book2.setCategory(scanner.next());
	}

}
