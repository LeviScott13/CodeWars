package kata

import "fmt"

func CreatePhoneNumber(numbers [10]uint) string {

    //Return the format of the phone number using Sprintf to create a string and get the individual numbers by their index in the array
    return fmt.Sprintf("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9])
}