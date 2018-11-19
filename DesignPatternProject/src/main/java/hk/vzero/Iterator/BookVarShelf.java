package hk.vzero.Iterator;

import java.util.ArrayList;

public class BookVarShelf extends BookShelf {
	private ArrayList<Book> books; 
	
	public BookVarShelf(int maxSize) {
		super(maxSize);
		this.books=new ArrayList<Book>(maxSize);
	}
	
	public void appendBook(Book book) {
		this.books.add(book); 
	}
	
	public Book getBookAt(int index) {
		return (Book) books.get(index);
	}
	
	public int getLength() {
		return books.size();
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
