# Paint Job
* Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.
  
# Task
* Write a method named `getBucketCount` with 4 parameters
* 1st parameter should be named `width` of type `double` which represents the width of the wall.
* 2nd parameter should be named `height` of type `double` which represents the height of the wall.
* 3rd parameter should be named `areaPerBucket`. It represents the area that can be covered with one bucket of paint.
* 4th parameter should be named `extraBuckets`. It represents the bucket count that Bob has at home.
* The method needs to return a value of type `int` that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
* If one of the parameters `width`, `height` or `areaPerBucket` is less or equal to 0 or if `extraBucket` is less 
  than 0, the method needs to return -1 to indicate an invalid value.
* If all parameters are valid, the method needs to calculate the number of buckets and return it.

# Examples
* `getBucketCount(-3.4, 2.1, 1.5, 2);` // -1 since `width` is invalid
* `getBucketCount(3.4, 2.1, 1.5, 2);` // 3
* `getBucketCount(2.75, 3.25, 2.5, 1);` // 3

# Extra
* Bob does not like to enter 0 for the `extraBuckets` parameter so he needs another method
* Write another overloaded method named `getBucketCount` with 3 parameters namely `width`, `height` and 
  `areaPerBucket` (all of type `double`)
* This method needs to return a value of type `int` that represents the number of buckets that Bob needs to buy 
  before going to work. To calculate the bucket count, refer to the notes below.
* If one of the parameters `width`, `height` or `areaPerBucket` is less or equal to 0, the method needs to return -1 
  to indicate an invalid value.
* If all parameters are valid, the method needs to calculate the number of buckets and return it.

# Examples
* `getBucketCount(-3.4, 2.1, 1.5);` // should return -1 since `width` is invalid
* `getBucketCount(3.4, 2.1, 1.5);` // should return 5
* `getBucketCount(7.25, 4.3, 2.35);` // should return 14

# Add on 3
* In some cases, Bob does not know the `