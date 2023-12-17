package com.upgrade.skills;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(20, calculator.addNumbers(10, 10));
	}

	@Test
	public void testSubtractNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.subtractNumbers(20, 10));
	}
}
