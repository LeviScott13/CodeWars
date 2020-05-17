import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        //Instantiate an int value that will represent the number of a binary value. 
        //Instantiate an int value that will represent the value at each index in the binary list (2^(i = 0) = 1, 2^(i = 1) = 2, 2^(i = 2) = 4 ...)
        int numberValue = 0, multiplier = 1;
        
        //Initiate looping through the binary list from the end to the start.
        for(int i = binary.size() - 1; i >= 0; i--){
            //Check if a value at (i) index contains a 1, if so, initialize the value by adding the index value represention in the binary list
            if(binary.get(i) == 1)
                numberValue += multiplier;
            //Update the next index representation in the binary list
            multiplier = multiplier * 2;
        }
        //Return the number representation of the binary value
        return numberValue;
    }
}