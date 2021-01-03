package nierth.learnjava.FPolymorphism.BillsBurger;

public class Main {
    public static void main(String[] args) {
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
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
        //db.addHamburgerAddition3("Should not do this", 50.53);
    }
}
