# Largest Prime
* Write a method named `getLargestPrime` with one parameter of type `int` named `number`.
* If the number is negative or does not have any prime numbers
* the method should return `-1` to indicate an invalid value.
* The method should calculate the largest prime factor of 
  a given number and return it.
  
#Example
* `getLargestPrime(21);` // 7 
* `getLargestPrime(217);` // 31
* `getLargestPrime(0);` // -1
* `getLargestPrime(45);` // 5
* `getLargestPrime(-1);` // -1
  
#Tip
* Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.