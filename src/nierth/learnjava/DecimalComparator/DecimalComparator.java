package nierth.learnjava.DecimalComparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {

        x = x * 1000;
        y = y * 1000;

        int x1 = (int) x;
        int y1 = (int) y;

        return (x1 == y1);
    }
}
