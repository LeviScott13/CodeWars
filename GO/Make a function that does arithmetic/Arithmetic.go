package kata

func Arithmetic(a int, b int, operator string) int{
	
	//Initialize a value to hold the value after performing an arithmetic operation
	var value int

	//Check operator string and return the value with the correct arithmetic
	switch operator{
		case "add":
			value = a + b
		case "subtract":
			value = a - b
		case "multiply":
			value = a * b
		case "divide":
			value = a / b
	}
	return value
}