package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.calc.Calculator;

public class Use {

	Calculator calc = null;

	@Before
	public void getCalcObject() { // Act
		calc = new Calculator();
	}

	@Test
	public void calculateSum() {
		
		assertEquals(40, calc.sum(10, 20));

	}

}
