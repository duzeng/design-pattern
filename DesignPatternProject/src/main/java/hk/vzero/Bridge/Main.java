package hk.vzero.Bridge;

public class Main {

	public static void main(String[] args) {
		Display d1=new Display(new StringDisplayImpl("Hello, China."));
		Display d2=new Display(new StringDisplayImpl("Hello, World."));
		CountDisplay d3=new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		RandomDisplay d4=new RandomDisplay(new StringDisplayImpl("Hello, random."));
		CountDisplay d5=new CountDisplay(new FileDisplayImpl("Star.txt"));
		
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		
		d4.randomDisplay(5);
		d4.randomDisplay(5);
		
		d5.multiDisplay(3);
		
		
		IncreaseDisplay d6=new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
		IncreaseDisplay d7=new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
		
		d6.increaseDisplay(4);
		d7.increaseDisplay(6);
		
	}

}
