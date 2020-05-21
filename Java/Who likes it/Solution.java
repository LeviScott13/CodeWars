class Solution {
    public static String whoLikesIt(String... names) {
        
        //Initialize a string value to store the desired display text for likes underneath a post
        String stringLikes = ""; 

        //Check the amount of individuals in the list of names that liked the post and output the display message respictively
        if(names.length == 0)
          stringLikes = "no one likes this";
        else if(names.length == 1)
          stringLikes = names[0] + " likes this";
        else if(names.length == 2)
          stringLikes = names[0] + " and " + names[1] + " like this";
        else if(names.length == 3)
          stringLikes = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        else
          stringLikes = names[0] + ", " + names[1] + " and " + Integer.toString(names.length - 2) + " others like this";
        
        //Return the desired display text underneath the post
        return stringLikes;
    }
}