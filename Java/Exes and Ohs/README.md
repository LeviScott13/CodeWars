# CodeWars
My CodeWars solutions

Problem:

Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false

Sample Tests:

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomething1() {
      assertEquals(true, XO.getXO("xxxooo"));
    }
    
    @Test
    public void testSomething2() {
      assertEquals(true, XO.getXO("xxxXooOo"));
    }
    
    @Test
    public void testSomething3() {
      assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
    }
    
    @Test
    public void testSomething4() {
      assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
    }
    
    @Test
    public void testSomething5() {
      assertEquals(false, XO.getXO("XxxxooO"));
    }
    
    @Test
    public void testSomething6() {
      assertEquals(true, XO.getXO("zssddd"));
    }
    
    @Test
    public void testSomething7() {
      assertEquals(false, XO.getXO("Xxxxertr34"));
    }
}