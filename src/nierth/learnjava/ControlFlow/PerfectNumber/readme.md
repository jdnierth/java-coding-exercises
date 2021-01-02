# Perfect Number
* Write a method named `isPerfectNumber` with one parameter of type `int` named number.
* If number is < 1, the method should return `false`
* The method must calculate if the number is perfect
* If the number is perfect, the method should return `true`, otherwise it should return `false`

# Info: What is the perfect number?
* A perfect number is a positive integer
* which is equal to the sum of its proper position divisors
* Proper positive divisors are positive integers
* that fully divide the perfect number without leaving a remainder and exclude the perfect number itself

# Examples
* `isPerfectNumber(6)` // true since its proper divisors are 1, 2, 3, and the sum is 1 + 2 + 3 = 6
* `isPerfectNumber(28)` // true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
* `isPerfectNumber(5)` // false since its proper divisors are 1 and the sum is 1
* `isPerfectNumber(-1)` // false since number is < 1
