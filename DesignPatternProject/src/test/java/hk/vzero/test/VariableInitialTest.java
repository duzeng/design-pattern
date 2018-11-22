package hk.vzero.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class VariableInitialTest {
	private boolean filed1;
	
	@Test
	public void testLocalVariabalInit() {
		int result;
		
		assertTrue(filed1==false);
	}
	
	@Test
	public void testDiv() {
		
		assertTrue(3==(3+4)/2);
	}

}
