package nierth.learnjava.GArrays.ReverseArrayChallengeImproved.ReverseArrayChallenge;

import java.util.Arrays;

public class ReverseArrayChallengeImproved {

    public static void reverse(int[] numbers) {
        int maxIndex = numbers.length - 1;
        int halfLength = numbers.length / 2;

        for(int i = 0; i < halfLength; i++ ) {
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex - 1];
            numbers[maxIndex - i] = temp;
        }

        System.out.println("Array = " + Arrays.toString(numbers) + "Reversed array = " + Arrays.toString(numbers));
    }
}
