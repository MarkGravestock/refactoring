package com.markgravestock.refactoring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FibonacciCalculatorTest {
  @Test
  public void canCalculateZerothFibonacciNumber() throws Exception {
    FibonacciCalculator sut = new FibonacciCalculator();
    assertThat(sut.calculateFibonacci(0), is(equalTo(0)));
  }

  @Test
  public void canCalculateFirstFibonacciNumber() throws Exception {
    FibonacciCalculator sut = new FibonacciCalculator();
    assertThat(sut.calculateFibonacci(1), is(equalTo(1)));
  }

  @Test
  public void canCalculateFirstFibonacciNumber1() throws Exception {
    FibonacciCalculator sut = new FibonacciCalculator();
    assertThat(sut.calculateFibonacci(1), is(equalTo(1)));
  }
}
