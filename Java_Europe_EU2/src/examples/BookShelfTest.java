package examples;

public class BookShelfTest {

	public static void main(String[] args) {
		
		System.out.println(Shelf.isShelfEmpty());
		
		Shelf.addBook(001, "Halim Iltas", "Book of My Life", 200);
		Book book = new Book();
		Shelf.addBook(book);
		book.setAuthor("Halim Kiltas");
		

	}

}
