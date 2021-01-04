package nierth.learnjava.GArrays.AverageSumWithArray;

import java.util.Scanner;

public class AverageSum {
    private static final int NUMBERS = 5;
    private Scanner scanner = new Scanner(System.in);

    public AverageSum() {
        int[] numbers = getIntegers();
        printArray(numbers);
        System.out.println("The average sum of all numbers is: " + average(numbers));
    }

    public static int[] getIntegers() {
        int[] numbers = new int[NUMBERS];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < NUMBERS; i++) {
            System.out.println("Enter number i: " + i);
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static void printArray(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Typed in number: " + numbers[i]);
        }
    }

    public static double average(int[] numbers) {
        double sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }
}
