package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
    return;
  }

  @Test
  public void testAverage() {
    Calculate calc = new Calculate();
    assertEquals(2.5, calc.average(2, 3), 0.001);
  }

  @Test
  public void testSumBetween() {
    Calculate calc = new Calculate();
    assertEquals(55, calc.sumBetween(1, 10));
  }

  @Test
  public void testAverageBetween() {
    Calculate calc = new Calculate();
    assertEquals(5.5, calc.averageBetween(1, 10), 0.001);
  }

  @Test
  public void testSumOdd() {
    Calculate calc = new Calculate();
    assertEquals(25, calc.sumOdd(1, 10));
  }

  @Test
  public void testSumEven() {
    Calculate calc = new Calculate();
    assertEquals(30, calc.sumEven(1, 10));
  }

}
