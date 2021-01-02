# Input Calculator
* Write a method called `inputThenPrintSumAndAverage` that does not have any parameters.
* The method should not return anything
* It needs to keep reading `int` numbers from the keyboard
* When the user enters something that is not an `int` then it needs to print a message in the format `SUM = XX AVG = YY`
* XX represents the sum of all entered numbers of type `int`
* YY represents the calculated average of all numbers of type `long`

## Example 1
Input:
1
2
3
4
5
a

Output:
`SUM = 15 AVG = 3`

## Example 2
Input:
hello

Output:
`SUM = 0 AVG = 0`

# Tips
* Use `Scanner` to read an input from the user
* Use casting when calling the round method since it needs `double` as a parameter
* Use the method `Math.ournd` to round the calculated average (double). The method `round`returns `long`