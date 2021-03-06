package hk.vzero.AbstractFactory.listfactory;

import java.util.Iterator;

import hk.vzero.AbstractFactory.factory.Item;
import hk.vzero.AbstractFactory.factory.Tray; 

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator<Item> it = tray.iterator();
        while (it.hasNext()) {
            Item item = it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }

}
