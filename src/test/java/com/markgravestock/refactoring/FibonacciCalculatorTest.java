package com.markgravestock.refactoring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FibonacciCalculatorTest {
  @Test
  public void canCalculateZerothFibonacciNumber() {
    assertThat(calculateFibonacci(0), is(equalTo(0)));
  }

  private int calculateFibonacci(final int ordinal) {
    final FibonacciCalculator sut = new FibonacciCalculator();
    return sut.calculateFibonacci(ordinal);
  }

  @Test
  public void canCalculateFirstFibonacciNumber() {
    assertThat(calculateFibonacci(1), is(equalTo(1)));
  }
}
