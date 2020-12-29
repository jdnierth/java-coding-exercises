# Digit Sum Challenge
* Write a method with the name `sumDigits` that has one `int`parameter called `number`
* If parameter is `>= 10` then the method should process the number and return `sum of all digits`, otherwise return 
  `-1` to indicate an invalid value.
* The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process negative numbers, so also return -1 for negative numbers.

# Example
* Calling `sumDigits(125)` // 8 since 1 + 2 + 5 = 8.
* Calling `sumDigits(1)` // -1

# Hint
* Use n % 10 to extract the least-significant digit
* Use n = n / 10 to discard the least-significant digit