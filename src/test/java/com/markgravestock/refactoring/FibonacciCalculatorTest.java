package com.markgravestock.refactoring;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class FibonacciCalculatorTest {
	@Test
	public void canCalculateFirstFibonacciNumber() throws Exception {
		Calculator sut = new Calculator();
		assertThat(sut.calculateFibonacci(1), is(equalTo(1)));
	}
}
