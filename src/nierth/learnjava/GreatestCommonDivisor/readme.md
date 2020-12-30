# Greatest common divisor
* Write a method named `getGreatestCommonDivisor` with 2 parameters `int` named `first` and `second`
* If one of the parameters is < 10, the method should return -1 to indicate an invalid value
* The method shoulr return the greatest common divisor of the 2 nubmers(int)
* The greatest common divisor is the largest positive integer tha can fully divide each of teh integers (i.e. 
  without leaving a remainder)
  
# Examples
* `getGreatestCommonDivisor(25, 15);` // 5
* `getGreatestCommonDivisor(12, 30);` // 6
* `getGreatestCommonDivisor(9, 18);` // -1
* `getGreatestCommonDivisor(81, 153);` // 9

# Hint
* Use a `while` or a `for` loop and check if both numbers can be divided without a remainder
* Find the minimum of the two numbers
