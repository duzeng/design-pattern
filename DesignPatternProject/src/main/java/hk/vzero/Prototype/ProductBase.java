package hk.vzero.Prototype;
 

public abstract class ProductBase implements Product {
  
	@Override
	public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
	} 

}
