package hk.vzero.Iterator;

public class BookFixShelf extends BookShelf {

	private Book[] books;
	private int last=0;
	
	public BookFixShelf(int maxSize) {
		super(maxSize);
		this.books=new Book[maxSize];
	}
	
	public void appendBook(Book book) {
		books[last]=book;
		last++;
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public int getLength() {
		return last;
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
