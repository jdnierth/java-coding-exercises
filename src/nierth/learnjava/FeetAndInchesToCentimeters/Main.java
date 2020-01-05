package nierth.learnjava.FeetAndInchesToCentimeters;

public class Main {
    public static void main(String[] args) {
        System.out.println("0ft: " + FeetAndInchesToCentimeters.calcFeedAndInchesToCentimeters(0)+ " cm");
        System.out.println("1ft: " + FeetAndInchesToCentimeters.calcFeedAndInchesToCentimeters(1,0)+ " cm");
        System.out.println("20ft: " + FeetAndInchesToCentimeters.calcFeedAndInchesToCentimeters(20,0)+ " cm");
        System.out.println("42ft: " + FeetAndInchesToCentimeters.calcFeedAndInchesToCentimeters(42, 0) + " cm");
    }
}
