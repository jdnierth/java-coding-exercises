package nierth.learnjava.BControlFlow.PerfectNumber;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sumProperDivisors = 0;

        if(number < 1) {
            return false;
        }

        int count = 1;

        while(count < number) {
            if(number % count == 0) {
                sumProperDivisors += count;
            }

            count ++;
        }

        return (sumProperDivisors == number);
    }
}
