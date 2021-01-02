package nierth.learnjava.BControlFlow.Sum3And5Challenge;

public class Sum3AndChallenge {

    public static int sum3And5() {
        int sum = 0;
        int max = 5;
        int count = 0;

        for(int i = 1; i <= 1000; i++) {
            if(canBeDivided(i)) {
                count ++;
                sum = sum + i;
                System.out.println("Found number = " + i);

                if(count == max) {
                    break;
                }
            }
        }

        return sum;
    }

    private static boolean canBeDivided(int a) {
        return a % 3 == 0 && a % 5 == 0;
    }
}
