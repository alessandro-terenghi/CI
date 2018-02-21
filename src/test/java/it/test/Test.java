package it.test;

import static org.junit.Assert.assertEquals;
import it.test.real.TestReal;

public class Test {

	@org.junit.Test
	public void example1() {
		TestReal tr = new TestReal();
		System.out.print(tr.getNumber());
		assertEquals(tr.getNumber(), 1);
	}

}
