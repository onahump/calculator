package com.oswaldo.ponce;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator calculatorOperation = new Calculator();
	
	@Test
	public void sumTest() {
		assertEquals(6,calculatorOperation.Sum(3,3));
	}
	
	@Test
	public void subtractionTest() {
		assertEquals(2,calculatorOperation.Subtraction(5,3));
	}
	
	@Test
	public void multiplicationTest() {
		assertEquals(8,calculatorOperation.Product(2,4));
	}
	
	@Test
	public void divisionTest() {
		assertEquals(2,calculatorOperation.Division(10,5));
	}

}
