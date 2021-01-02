package nierth.learnjava.ControlFlow.FirstAndLastDigitSum;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int lastDigit = number % 10;

        if(number < 0) {
            sum = -1;
        } else if (number > 0 && number < 10) {
            sum = number * 2;
        }

        while(number >= 10) {
            number = number / 10;
            System.out.println(number);

            sum = lastDigit + number;
        }

        return sum;
    }
}
