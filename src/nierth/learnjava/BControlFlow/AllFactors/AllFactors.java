package nierth.learnjava.BControlFlow.AllFactors;

public class AllFactors {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printFactors(int number) {
        String factors = "";

        if(number < 1) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        }

        int count = number;

        while(count > 0) {

            if(number % count == 0) {
                factors += (number / count) + " ";
            }

            count -= 1;
        }

        System.out.println(factors);
    }
}
