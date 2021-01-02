package nierth.learnjava.CReadingUserInput.MinimumAndMaximumChallenge;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {
    public static void readingInput() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int input;

        while(count < 4) {
            System.out.println("Enter number " +  (count + 1) + ": ");
            boolean hasInt = scanner.hasNextInt();

            if(hasInt) {
                input = scanner.nextInt();

                min = (input < min) ? input : min;
                max = (input > max) ? input : max;

                count++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        System.out.println("Your min number: " + min + " your max number: " + max);

        scanner.close();
    }
}
