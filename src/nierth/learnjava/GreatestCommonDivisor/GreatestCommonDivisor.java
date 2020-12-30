package nierth.learnjava.GreatestCommonDivisor;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestCommonDivisor = 0;

        if(first <= 0 || second <= 0) {
            return -1;
        }

        if(first == second) {
            return first;
        }

        for(int i = 1; i <= first && i <= second; i++)
        {
            if(first%i==0 && second%i==0)
                greatestCommonDivisor = i;
        }

        return greatestCommonDivisor;
    }
}
