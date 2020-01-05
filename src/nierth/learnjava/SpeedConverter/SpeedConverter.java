package nierth.learnjava.SpeedConverter;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        long result = -1;

        if(kilometersPerHour >= 0) {
            result = Math.round(Math.round(kilometersPerHour) * 0.621371);
        }

        return result;
    }

    public static void printConversion(double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
    }
}
