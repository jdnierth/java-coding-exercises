# Flour Pack Problem
* Write a method named canPack with three parameters of type `int` named `bigCount`, `smallCount`, and `goal`
* The parameter `bigCount` represents the count of big flour bags (5 kilos each)
* The parameter `smallCount` represents the count of small flour bags (1 kilo each) 
* The parameter `goal` represents the goal amount of kilos of flour needed to assemble a package.Therefore, the sum 
  of the kilos of `bigCount` and `smallCount` must be at least equal to the value of goal.
* The method should return `true` if it is possible to make a package with goal kilos of flour
* If the sum is greater than goal, ensure that only full bags are used towards the goal amount
* If any of the parameters are negative, return `false`
  
# Example 
* `canPack(1, 0, 4);` // `false` 
* `canPack(1, 0, 5);` // `true` 
* `canPack(0, 5, 4);` // `true` 
* `canPack(2, 2, 11);` // `true`
* `canPack(-3, 2, 12);` // `false`
* `canPack(2, 0, 9);` // `false`
* `canPack(1, 5, 9);` // `true`