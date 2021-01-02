# Number to Words
* Write a method called `numberToWords` with one `int` parameter named `number`
* The method should print out the passed number using words for the digits.
* If the number is negative, print `Invalid Value`
  
* Write a second method `reverse` which should have one `int` parameter and return the reversed number (`int`).
* Use the method `reverse` within the method `numberToWords` in order to print the words in the correct order.

* Write a third method `getDigitCount` which should have one `int` parameter called `number` and return the count of the digits in that number
* If the number is negative, return -1 to indicate an invalid value
* 
  
# Number as words
1. To print the number as words, follow these steps:
2. Extract the last digit of the given number using the remainder operator
3. Convert the value of the digit found in Step 1 into a word
4. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
5. Print the corresponding word for each digit, e.g. print "Zero" for the digit 0, "One" for the digit 1 and so on
6. Remove the last digit from the number
7. Repeat Steps 2 through 4 until the number is 0

# Examples - getDigitCount(int number)
* `getDigitCount(100);` // 3
* `getDigitCount(0);` // 1
* `getDigitCount(123);` // 3
* `getDigitCount(-12);` // -1
* `getDigitCount(5200);` // 4

# Examples - reverse(int number)
* `reverse(-121);` // -121
* `reverse(1212);` // 2121
* `reverse(1234);` // 1234
* `reverse(100);` // 1

# Examples - numberToWords(int number)
* `numberToWords(123);` // "One Two Three"
* `numberToWords(1010);` // "One Zero One Zero"
* `numberToWords(1000);` // "One Zero Zero Zero"
* `numberToWords(-12);` // "Invalid Value"


