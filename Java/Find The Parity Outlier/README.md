# CodeWars
My CodeWars solutions

Problem:

You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

Examples:

[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)

Sample Tests:

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class OutlierTest{
 @Test
 public void testExample() {
     int[] exampleTest1 = {2,6,8,-10,3}; 
     int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
     int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
     assertEquals(3, FindOutlier.find(exampleTest1));
     assertEquals(206847684, FindOutlier.find(exampleTest2));
     assertEquals(0, FindOutlier.find(exampleTest3));
 }}
     