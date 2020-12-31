package nierth.learnjava.InputCalculator;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int count = 0;

        while(true) {
            //System.out.println("Enter a number " + (count + 1) + ":");
            boolean hasInt = scanner.hasNextInt();

            if(hasInt) {
                int input = scanner.nextInt();
                sum += input;
                count++;
            } else {
                avg = (count != 0)  ? Math.round(sum / count) : avg;
                break;
            }

            scanner.nextLine();

        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
