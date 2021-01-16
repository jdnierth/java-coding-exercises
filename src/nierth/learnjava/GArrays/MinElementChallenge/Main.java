package nierth.learnjava.GArrays.MinElementChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many numbers: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = MinElementChallenge.readIntegers(count);
        int min = MinElementChallenge.findMin(numbers);
        System.out.println("The minimum number is: " + min);
    }
}
