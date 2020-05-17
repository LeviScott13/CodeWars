public class FindOutlier{
  static int find(int[] integers){
    
    //Instantiate an even count and odd count to check if the integer array has mostly odd or even integeres
    //Instantiate to intialize the outlier
    int countEven = 0, countOdd = 0, value = 0;
    
    //Loop through the array
    for (int i = 0; i < integers.length;i++){
        //check if the integer value at index i is an even or odd value and increase the count respectively
        if(integers[i] % 2 == 0)
            countEven++;
        else
            countOdd++;
    }
    //After the counts have been initialized, check which count has a value of 1
    if(countEven == 1){
      for (int i = 0; i < integers.length;i++){
        //Finds the even outlier in an array full of odd values
        if(integers[i] % 2 == 0)
          value = integers[i];
      }
    }
    if(countOdd == 1){
      for (int i = 0; i < integers.length;i++){
        //Finds the odd outlier in an array full of even values
        if(integers[i] % 2 != 0)
          value = integers[i];
      }
    }
    //returns the outlier
    return value;
  }
}