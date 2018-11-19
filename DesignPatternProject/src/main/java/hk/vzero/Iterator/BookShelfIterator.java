package hk.vzero.Iterator;

public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;
	private int index=0;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf=bookShelf;
	}
	
	public boolean hasNext() {
		if (index<bookShelf.getLength()) {
			return true;
		}
		return false;
	}

	public Object next() {
		Book book=bookShelf.getBookAt(this.index);
		index++;
		return book; 
	}
	
}
