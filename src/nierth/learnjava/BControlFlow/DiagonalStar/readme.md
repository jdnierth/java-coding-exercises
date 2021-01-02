#Diagonal Star
* Write a method named `printSquareStar` with one parameter of type `int` named `number`. 
* If number is &lt; 5, the method should print "Invalid Value"
* The method should print diagonals to generate a rectangular pattern composed of stars (*). 
* This should be accomplished by using loops (see examples below)
* The patterns below consist of a number of rows and columns (where number is the number of rows to print)
* For each row or column, stars are printed based on four conditions

# Conditions
* In the first or last row
* In the first or last column
* When the row number equals the column number
* When the column number equals `rowCount - currentRow + 1` (where currentRow is current row number) 

# Example:
`printSquareStar(5);` // should print the following
``
*****
** ** 
* * *
** **
*****
  ``

# Explanation:
*****: 5 stars
** **: 2 stars space 2 stars
* * *: 1 star space 1 star space 1 star
** **: 2 stars space 2 stars
*****: 5 stars

#Tips
* To print in the same line use the function `print` instead of `println`
* To move to another line you can use the function `println`
* Use nested loop
