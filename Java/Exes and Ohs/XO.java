public class XO {
  
    public static boolean getXO (String str) {
      
        //Initialize two values to count X's and one to count O's. Initialize a bool value to return if the number of X's is equal to the number of O's
        int countX = 0, countO = 0;
        boolean value = false;
        
        //Concvert the string to all lower case values and loop through the string
        for(int i = 0; i < str.toLowerCase().length(); i++){
            //Check if the char value at index 'i' is an x or an o and increase the count 
            if(str.charAt(i) == 'x')
                countX++;
            else if(str.charAt(i) == 'o')
                countO++;
        }
        //Check if the x's and o's count are equal to each other, if so, update the value to true
        if(countX == countO)
            value = true;
        
        //Return (T/F), depending on if the string has the same number of x's and o's
        return value;
    }
}