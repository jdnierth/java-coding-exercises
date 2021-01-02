package nierth.learnjava.BControlFlow.DigitSumChallenge;

public class DigitSumChallenge {
    public static int sumDigits(int n) {
        int sum = 0;

        if(n <= 10) {
            return -1;
        }

        while (n > 0) {
            // Get the least significant digit
            sum += (n % 10);

            // Drop the least significant digit
            n = n / 10;
        }

        return sum;

    }
}
