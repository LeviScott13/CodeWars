# CodeWars
My CodeWars solutions

Problem:

Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that, when added together, give the target value. The indices of these items should then be returned in a tuple like so: (index1, index2).

For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target will always be the sum of two different items from that array).

Example:

twoSum [1, 2, 3] 4 === (0, 2)

Sample Tests:

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.runners.JUnit4;

public class TwoSumTest
{
    @Test
    public void basicTests()
    {
        doTest(new int[]{1,2,3},          new int[]{0,2});
        doTest(new int[]{1234,5678,9012}, new int[]{1,2});
        doTest(new int[]{2,2,3},          new int[]{0,1});
    }
    private void doTest(int[] numbers, int[] expected)
    {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] actual = Solution.twoSum(numbers, target);
        if ( null == actual )
        {
            System.out.format("Received a null\n");
            assertNotNull(actual);
        }
        if ( actual.length != 2 )
        {
            System.out.format("Received an array that's not of length 2\n");
            assertTrue(false);
        }
        int received = numbers[actual[0]] + numbers[actual[1]];
        assertEquals(target, received);
    }
}