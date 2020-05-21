public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
        //Initialize an array to return the indexes that equals the target sum
        int [] indexes = new int [2];

        //Initialize a value to track the sum at each ith and jth index. 
        int sum = 0, j = 0;
        
        //Loop through the array of numbers
        for(int i = 0; i < numbers.length; i++){
            //Update index j back to 0 after each iteration
            j = 0;
            while( j < numbers.length){
                sum = numbers[i] + numbers[j];
                //Check if the sum is equal to the target sum, if so, store the ith and jth index and break out of the loop 
                if(sum == target){
                    indexes[0] = i;
                    indexes[1] = j;
                    break;
                }
                //Else update the sum back to 0
                else
                    sum = 0;
                //Update to the next jth index    
                j++;
            }
        }
        //return the indexes that equates to the target sum
        return indexes;
    }
}