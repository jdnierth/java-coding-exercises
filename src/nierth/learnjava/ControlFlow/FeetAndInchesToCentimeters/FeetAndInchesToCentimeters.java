package nierth.learnjava.ControlFlow.FeetAndInchesToCentimeters;

public class FeetAndInchesToCentimeters {
    public static double calcFeedAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid value");
            return -1;
        }

        double feetInInches= feet * 12;

        double centimeters = (inches + feetInInches) * 2.54;

        System.out.println(feet + " feet, " +  inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeedAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            System.out.println("Invalid value");
            return -1;
        }

        double feet = inches / 12;
        double remainingInches = (int) inches % 12;

        System.out.println(inches + " inches is equal to: " + feet + " feet and " + remainingInches + " remaining " +
                "inches");
        return calcFeedAndInchesToCentimeters(feet, remainingInches);
    }
}
