import java.util.*;

public class Order {
  public static String order(String words) {
    
    //Split the String into an array of strings.
    String [] word = words.split(" ");

    //Instantiate a String Builder to build a new string of sorted string values
    StringBuilder order = new StringBuilder();

    //Instantiate a boolean value, a count value, and an index value 
    boolean value = false;
    int count = 1, j = 0;
    
    //If the word string is empty, append to the String Builder
    if(words == ""){
        order.append(words);
    }
    //Else check the string for number values in each individual string
    else{
      //Start looping through the string
      for(int i = 0; i < word.length; i++){
          //Update the value back to false after each iteration
          value = false;
          while(value == false){
              //Check which string value contains the value equal to the initialized count variable
              if(word[j].contains(Integer.toString(count))){
                  //Append that string value to the String Builder, update the boolean value to exit the loop
                  order.append(word[j] + " ");
                  value = true;
              }
              //If the string value does not contain the value equal to the count variable, index to the next string value
              else
                  j++;
          }
          //Update j to index back to the start of the string array, update the next count value
          j = 0;
          count++;
      }
    }
    //Return the order of the correct sentence sequence of the string
    return order.toString().trim();
  }
}