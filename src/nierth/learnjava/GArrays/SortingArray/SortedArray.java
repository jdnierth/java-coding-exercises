package nierth.learnjava.GArrays.SortingArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    private static final int INT_CAPACITY = 5;
    private Scanner scanner = new Scanner(System.in);

    public SortedArray() {
        int[] numbers = getIntegers(INT_CAPACITY);
        printArray(numbers);
        int[] sortedArray = sortIntegers(numbers);
        System.out.println("###### Result");
        printArray(sortedArray);
    }

    public static int[] getIntegers(int capacity) {
        int[] numbers = new int[capacity];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < capacity; i++) {
            System.out.println("Enter number " + i);
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static void printArray(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + " contents " + numbers[i]);
        }
    }

    public static int[] sortIntegers(int[] numbers) {
        int[] sortedArray = Arrays.copyOf(numbers, numbers.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;

            for(int i = 0; i < sortedArray.length - 1; i++) {
                // Swap numbers
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

}
