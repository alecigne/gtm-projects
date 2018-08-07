package net.lecigne.mavencalculator.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testAdd() {
		Calculator calc = new App();
		int expected = 4;
		int actual = calc.add(2, 2);
		assertEquals(expected, actual);
	}

}
