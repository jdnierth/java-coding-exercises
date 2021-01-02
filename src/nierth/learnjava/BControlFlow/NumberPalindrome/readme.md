# Number Palindrome
* Write a method called `isPalindrome` with one `int`parameter called `number`
* The method needs to return a `boolean`.
* It should return `true` if the number is a palindrome number otherwise it should return `false`

# Examples
* `isPalindrome(-1221);` // `true`
* `isPalindrome(707);` // `true`
* `isPalindrome(11212);` // `false`

# Tips
## What is a palindrome number?
* A palindrome number is a number which when reversed is equal to the original `number`
* Negative numbers can be palindrome numbers

## Reverse numbers
* Declare and initially another variable to store the reverse of a number, for example `reverse = 0`
* Extract the last digit of the given number by performing the modulo division (remainder)
* Store the last digit to some variable say `lastDigit = num % 10`
* Increase place value multiply the reverse variable by 10 e.g. `reverse = reverse * 10`
* Add last Digit to reverse
* Since the last digit of the number is processed, remove the last digit of num
* To remove the last digit `divide number by 10`
* Repeat steps until number is not equal to (or greater than) zero
