# Last Digit Checker
* Write a method named `hasSameLastDigit` with 3 parameters of type `int`
* Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
* If one of the numbers is not within the range, the method should return `false`.
* The method should return true if at least 2 of the numbers share the same rightmost digit; otherwise it should 
  return `false`.
  
# Examples
* `hasSameLastDigit(41,22,71);` // true
* `hasSameLastDigit(23,32,42);` // true
* `hasSameLastDigit(9,99,999);` // false
* `hasSameLastDigit(9,99,999);` // false

* Write another method named `isValid` with one parameter of type `int`
* The method needs to return `true` if the number parameter is in range of 10 (inclusive) - 1000 (inclusive), 
  otherwise return `false`
  
# Examples
* `isValid(10);` // true
* `isValid(468);` // true
* `isValid(1051);` // false