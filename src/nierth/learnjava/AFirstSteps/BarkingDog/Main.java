package nierth.learnjava.AFirstSteps.BarkingDog;

public class Main {

    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true,1));
        System.out.println(BarkingDog.shouldWakeUp(false,2));
        System.out.println(BarkingDog.shouldWakeUp(true,8));
        System.out.println(BarkingDog.shouldWakeUp(true,-1));
        System.out.println(BarkingDog.shouldWakeUp(true,44));
    }
}
