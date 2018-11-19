package hk.vzero.AbstractFactory.factory;

public abstract class Item implements HTMLLabel {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    } 
}
