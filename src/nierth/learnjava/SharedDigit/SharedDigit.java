package nierth.learnjava.SharedDigit;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }

        int aLastDigit = a % 10;
        int aFirstDigit = a / 10;
        int bLastDigit = b % 10;
        int bFirstDigit = b / 10;

        return (aFirstDigit == bLastDigit || aLastDigit == bLastDigit ||
                aLastDigit == bFirstDigit || aFirstDigit == bFirstDigit);
    }
}
