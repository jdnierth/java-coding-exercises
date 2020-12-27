package nierth.learnjava.AreaCalculator;

public class AreaCalculator {
    private static final String INVALID_INPUT_MESSAGE = "Invalid value";

    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if( x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }
}
