# Bill's BurgersDescription

## Introduction
* The purpose of this application is to help a company called Bill's Burgers manage the process of selling their hamburgers. 
* In order to match Bill's menu, you will need to create 3 classes,`Hamburger`, `DeluxeBurger`, and `HealthyBurger`
  
### Hamburger Class
* 4 variables to represent the four basic ingredients of the `Hamburger`, `name`, `meat`, `price`, and `breadRollType` 
** The `price` variable should be of type `double`
** The other three are of type `String` 
** Constructor accepts these four values as parameters when creating a new `Hamburger`
* There will also need to be separate variables for 4 possible additions to the `Hamburger`:
** `addition1Name` (String), `addition1Price` (double)
** `addition2Name` (String), `addition2Price` (double)
** `addition3Name` (String), `addition3Price` (double)
** `addition4Name` (String), `addition4Price` (double)
* 4 methods for adding up to 4 additions to the `Hamburger` which should be named:
** `addHamburgerAddition1(String name, double price)` (void)
** `addHamburgerAddition2(String name, double price)` (void)
** `addHamburgerAddition3(String name, double price)` (void)
** `addHamburgerAddition4(String name, double price)` (void) 
** `itemize` (`double`) which returns the total `price`of the `Hamburger`, including the base price plus additional 
  items and accepts
* 1 method for printing out an itemized listing of the final `Hamburger` with addons, if any, and the total `price`
  
### DeluxeBurger
* No additional member variables
* The constructor accepts no parameters 
* Creates a `deluxe burger` with all the fixings and chips and a drink for a base `price` of `$19.10`
* The constructor can be configured in any way, as long as chips and drink are added for the total `price` just 
  mentioned
* The 4 methods defined in the `Hamburger` class for including additional toppings must each be overridden so that a 
  message is printed stating that no additional items can be added to a deluxe burger.
* 
### HealthyBurger
* 4 additional member variables called:
** `healthyExtra1Name` (String),`healthyExtra1Price` (double)
** `healthyExtra2Name` (String), `healthyExtra2Price` (double) 
* The constructor for this class accepts 2 parameters for `meat` and `price`
* Those are set in the constructor along with an appropriate `name` for the type of burger
* 2 methods should be created that each accept a `name` and `price` for the addition, allowing for up to 2 addons to the basic healthy burger
** `addHealthyAddition1(String name, double price)`
** `addHealthyAddition2(String name, double price)`
* `itemizeHamburger` method created in the `Hamburger` class should be overridden to generate a message appropriate to the type of burger along with any addons
* The method also returns the total `price` of the healthy burger of type `double`.
  
# Example input:
```
Hamburger Hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
Hamburger.addHamburgerAddition1("Tomato", 0.27);
Hamburger.addHamburgerAddition2("Lettuce", 0.75);
Hamburger.addHamburgerAddition3("Cheese", 1.13);
System.out.println("Total Burger price is " + Hamburger.itemizeHamburger());
HealthyBurger HealthyBurger = new HealthyBurger("Bacon", 5.67);
HealthyBurger.addHamburgerAddition1("Egg", 5.43);
HealthyBurger.addHealthyAddition1("Lentils", 3.41);
System.out.println("Total Healthy Burger price is " + HealthyBurger.itemizeHamburger());
DeluxeBurger db = new DeluxeBurger();
db.addHamburgerAddition3("Should not do this", 50.53);
System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
```

# Example output:
```
Basic Hamburger on a White roll with Sausage, price is 3.56
Added Tomato for an extra 0.27
Added Lettuce for an extra 0.75
Added Cheese for an extra 1.13
Total Burger price is 5.71
Healthy Hamburger on a Brown rye roll with Bacon, price is 5.67
Added Egg for an extra 5.43
Added Lentils for an extra 3.41
Total Healthy Burger price is 14.51
Cannot not add additional items to a deluxe burger
Deluxe Hamburger on a White roll with Sausage Bacon, price is 14.54
Added Chips for an extra 2.75
Added Drink for an extra 1.81
Total Deluxe Burger price is 19.10
```