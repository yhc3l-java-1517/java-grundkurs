package bookext;
import bookpack.*;

class BookDemo{
	public static void main(String[] args){
		Book[] books = new Book[3];

		books[0] = new Book("Harry Potter", "J.Rowling", 1998);
		books[1] = new Book("The Hobbit", "J.Tolkien", 1937);
		books[2] = new Book("The lion the witch and the wardrobe", "C.Lewis", 1950);

		for(Book book: books){
			book.show();
		}
	}
}
