#calcFeetAndInchesToCentimeters
## Part 1
* Create a method called `calcFeedAndInchesToCentimeters` that has 2 parameters.
* `feet` is the 1st, `inches` is the 2nd parameter
* You should validate that the 1st parameter is `>= 0`.
* You should validate that the 2nd parameter is `>= 0` and `<= 12`.
* Return `-1` from the method if either of the above is not true.
* If the parameters are valid, then calculate how many centimeters comprise the `feet` and `inches` passed to this method
 and return that value.
 
## Part 2
* Create a 2nd method of the same name but with only one parameter which is `inches`
* Validate that its `>= 0`
* Return `-1` if it is not `true`
* If it is valid, then calculate how many `feet` are in the `inches` and then ...
* call the other overloaded method passing the correct `feet` and `inches` calculated so that it can calculate correctly.

```
HINT: Use double for your number datatypes
HINT: 1 inch = 2.54 cm
HINT: 1 foot = 12 inches
```
 
