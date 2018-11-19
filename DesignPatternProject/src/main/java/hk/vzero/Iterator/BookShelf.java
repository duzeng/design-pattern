package hk.vzero.Iterator;

public abstract class BookShelf implements Aggregate {

	public BookShelf(int maxSize) {
	}

	abstract void appendBook(Book book);

	abstract Book getBookAt(int index);

	abstract int getLength();

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
