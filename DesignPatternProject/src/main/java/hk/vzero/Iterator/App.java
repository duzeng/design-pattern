package hk.vzero.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	runFixBookShelf();
    	System.out.println("-------------------------");
    	runVarBookShelf();
    }
    
    public static void runFixBookShelf() {
    	
        BookShelf bookShelf=new BookFixShelf(4);
        bookShelf.appendBook(new Book("图解JAVA多线程设计模式"));
        bookShelf.appendBook(new Book("CSS世界"));
        bookShelf.appendBook(new Book("代码整洁之道"));
        bookShelf.appendBook(new Book("1984")); 
        
        Iterator iterator=bookShelf.iterator();
        System.out.println("当前书架:"+bookShelf.getClass().getSimpleName());
        while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName());
		}
    }
    
    public static void runVarBookShelf() {
        BookShelf bookShelf=new BookVarShelf(4);
        bookShelf.appendBook(new Book("图解JAVA多线程设计模式"));
        bookShelf.appendBook(new Book("CSS世界"));
        bookShelf.appendBook(new Book("代码整洁之道"));
        bookShelf.appendBook(new Book("1984")); 
        bookShelf.appendBook(new Book("1985"));
        Iterator iterator=bookShelf.iterator();
        System.out.println("当前书架:"+bookShelf.getClass().getSimpleName());
        while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName());
		}
    }
}
