public class Codewars {
  public static String oddOrEven (int[] array) {
    
    //Instantiate a value to calculate the sum of the values in the array. Instantiate a value to index the array values;
    int sum = 0, i = 0;

    //Loop through the array
    while(i != array.length){
      //Sum up the values in the array 
      sum += array[i];
      i++;
    }
    //Return if the sum is even or odd
    return (sum % 2 == 0) ? "even" : "odd";
  }
}