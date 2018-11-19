package hk.vzero.AbstractFactory.tablefactory;

import hk.vzero.AbstractFactory.factory.Factory;
import hk.vzero.AbstractFactory.factory.Link;
import hk.vzero.AbstractFactory.factory.Page;
import hk.vzero.AbstractFactory.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
