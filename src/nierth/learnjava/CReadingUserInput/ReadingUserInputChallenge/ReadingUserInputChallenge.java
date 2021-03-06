package nierth.learnjava.CReadingUserInput.ReadingUserInputChallenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(count < 3) {

            System.out.println("Enter a number " + (count + 1) + ": ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        System.out.println("The sum of the numbers you've entered is: " + sum);

        scanner.close();
    }
}
