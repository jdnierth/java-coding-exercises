package nierth.learnjava.GArrays.MinElementChallenge;

import java.util.Scanner;

public class MinElementChallenge {

    public static int[] readIntegers(int count)  {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = 0;
        int[] numbers = new int[count];

        while(currentNumber < count) {
            System.out.println("Get next number " + currentNumber + ":");
            numbers[currentNumber] = (scanner.nextInt());
            scanner.nextLine();
            currentNumber ++;
        }

        return numbers;
    }

    public static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;

        if(numbers.length == 0) {
            return min;
        }

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }
}
