package kata

import "strconv"

func CreatePhoneNumber(numbers [10]uint) string {
    //Initialize a string value to store a phone number
    var s string

    //Store the format of the phone number and convert the numbers in the array to strings
    s = "(" + strconv.FormatInt(int64(numbers[0]), len(numbers)) + strconv.FormatInt(int64(numbers[1]), len(numbers)) + strconv.FormatInt(int64(numbers[2]), len(numbers)) + ")" +
        " " + strconv.FormatInt(int64(numbers[3]), len(numbers)) + strconv.FormatInt(int64(numbers[4]), len(numbers)) + strconv.FormatInt(int64(numbers[5]), len(numbers)) + "-" +
        strconv.FormatInt(int64(numbers[6]), len(numbers)) + strconv.FormatInt(int64(numbers[7]), len(numbers)) + strconv.FormatInt(int64(numbers[8]), len(numbers)) + 
        strconv.FormatInt(int64(numbers[9]), len(numbers)) 
    
    //Return the created phone number
    return s
}