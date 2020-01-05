package nierth.learnjava.FeetAndInchesToCentimeters;

public class FeetAndInchesToCentimeters {
    public static double calcFeedAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || (inches < 0 && inches > 12)) {
            return -1;
        }

        double feetInInches= feet * 12;

        return (inches + feetInInches) * 2.54;
    }

    public static double calcFeedAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }

        return calcFeedAndInchesToCentimeters(inches / 12, 0);
    }
}
