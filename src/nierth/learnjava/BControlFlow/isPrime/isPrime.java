package nierth.learnjava.BControlFlow.isPrime;

public class isPrime {
    public static boolean printIsPrime(int n) {
        System.out.println("Input number n is: " + n);
        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
