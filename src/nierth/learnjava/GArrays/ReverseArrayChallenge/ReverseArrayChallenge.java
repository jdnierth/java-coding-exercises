package nierth.learnjava.GArrays.ReverseArrayChallenge;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++ ) {
            reversed[i] = numbers[numbers.length - (i + 1)];
        }

        System.out.println("Array = " + Arrays.toString(numbers) + "Reversed array = " + Arrays.toString(reversed));
    }
}
