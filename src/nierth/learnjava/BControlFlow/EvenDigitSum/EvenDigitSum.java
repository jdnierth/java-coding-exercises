package nierth.learnjava.BControlFlow.EvenDigitSum;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;

        while(number > 0) {
            int lastDigit = number % 10;

            if(number % 2 == 0) {
                sum = sum + lastDigit;
            }

            // omit the last digit
            number = number / 10;
        }

        return sum;
    }
}
