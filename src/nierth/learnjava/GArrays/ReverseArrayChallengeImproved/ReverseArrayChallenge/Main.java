package nierth.learnjava.GArrays.ReverseArrayChallengeImproved.ReverseArrayChallenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,5,6,8};
        System.out.println("Array = " + Arrays.toString(numbers));
        ReverseArrayChallengeImproved.reverse(numbers);
    }
}
