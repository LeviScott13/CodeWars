import java.util.Arrays;  
import java.util.List;  
import java.util.ArrayList;
public class Line {
   public static String WhoIsNext(String[] names, int n)
     {
        //Instantiate a value to hold the name of who is next in line. 
        //Convert the Array into an ArrayList for better adding names to the existing list of names
        String name = "";
        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(names));
        
        //Loop based on n
        for(int count = 0; count < n; count++){
            //Double the names and add them to the list
            nameList.add(nameList.get(count));
            nameList.add(nameList.get(count));
            //Get the name based on the index count to see who's next in line in the list
            name = nameList.get(count);
        }
        //return the name of who's next
        return name;
     }
}