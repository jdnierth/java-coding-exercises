package nierth.learnjava.BControlFlow.NumberPalindrome;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        boolean isPalindrome;

        // Normalization: Make sure number is always positive
        number = (number < 0) ? number * -1 : number;

        int originalNumber = number;

        // Check whether number is a palindrome
        int reverse = 0;

        while(number > 0) {
            int lastDigit = number % 10;
            reverse = lastDigit + (reverse * 10);
            number = number / 10;
        }

        isPalindrome = (originalNumber == reverse);

        return isPalindrome;
    }
}
