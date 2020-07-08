# CodeWars
My CodeWars solutions

Problem:

Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

Example:

The binary representation of 1234 is 10011010010, so the function should return 5 in this case

Test Cases:

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class BitCountingTest {
  @Test
  public void testGame() {
    assertEquals(5, BitCounting.countBits(1234)); 
    assertEquals(1, BitCounting.countBits(4)); 
    assertEquals(3, BitCounting.countBits(7)); 
    assertEquals(2, BitCounting.countBits(9)); 
    assertEquals(2, BitCounting.countBits(10)); 
  }
}