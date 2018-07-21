package net.lecigne.mavencalculator.calc;

import static org.junit.Assert.*;
import org.junit.Test;

import net.lecigne.mavencalculator.calc.App;
import net.lecigne.mavencalculator.calc.Calculator;

public class AppTest {

	@Test
	public void testSum() {
		Calculator calc = new App();
		int v1 = 2, v2 = 2;
		int expected = v1 + v2;
		int actual = calc.add(v1, v2);
		assertEquals(expected, actual);
	}

}
