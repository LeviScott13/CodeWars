public class DRoot {
  public static int digital_root(int n) {
    
    //Convert the integer into a string & instantiate a sum value
    String num = String.valueOf(n);
    int sum = 0;

    //Loop through the number string and initialze the sum by adding each character in the string
    for(int i = 0; i < num.length(); i++){
        sum += Character.getNumericValue(num.charAt(i));
    }
    //Set the sum back to the string variable and check the length. 
    //If the length is < 2 then return the sum, if it's not, pass the sum through the method parameters and start the process over.
    num = String.valueOf(sum);
    if(num.length() < 2){
      return sum;
    }
    else
      return digital_root(sum);
  }
}