package hk.vzero.Bridge;

import java.util.Random;

public class RandomDisplay extends CountDisplay {

	private Random random=new Random();
	public RandomDisplay(DisplayImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}
	
	public void randomDisplay(int times) {
		multiDisplay(random.nextInt(times));
	}

}
