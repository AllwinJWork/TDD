package com.qa.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.demo.Factorial;

public class FactorialTest {

	private Factorial factorial = new Factorial();

	@Test
	public void test() {
		assertEquals(1, this.factorial.returnFactorial(0));
	}

	@Test
	public void test2() {
		assertEquals(5, this.factorial.returnFactorial(120));
	}

}
