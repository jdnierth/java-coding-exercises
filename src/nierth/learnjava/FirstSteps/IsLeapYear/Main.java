package nierth.learnjava.FirstSteps.IsLeapYear;

public class Main {

    public static void main(String[] args) {
        System.out.println("-1200 is NOT a leap year: " + IsLeapYear.isLeapYear(-1200));
        System.out.println("-1600 is NOT a leap year: " + IsLeapYear.isLeapYear(-1600));
        System.out.println("1855 is NOT a leap year: " + IsLeapYear.isLeapYear(1855));
        System.out.println("1700 is NOT a leap year: " + IsLeapYear.isLeapYear(1700));
        System.out.println("1800 is NOT a leap year: " + IsLeapYear.isLeapYear(1800));
        System.out.println("1900 is NOT a leap year: " + IsLeapYear.isLeapYear(1900));
        System.out.println("2100 is NOT a leap year: " + IsLeapYear.isLeapYear(2100));
        System.out.println("2200 is NOT a leap year: " + IsLeapYear.isLeapYear(2200));
        System.out.println("2300 is NOT a leap year: " + IsLeapYear.isLeapYear(2300));
        System.out.println("2500 is NOT a leap year: " + IsLeapYear.isLeapYear(2500));
        System.out.println("2600 is NOT a leap year: " + IsLeapYear.isLeapYear(2600));
        System.out.println("2017 is NOT a leap year: " + IsLeapYear.isLeapYear(2017));
        System.out.println("1924 is a leap year: " + IsLeapYear.isLeapYear(1924));
        System.out.println("1600 is a leap year: " + IsLeapYear.isLeapYear(1600));
        System.out.println("2000 is a leap year: " + IsLeapYear.isLeapYear(2000));
        System.out.println("2400: " + IsLeapYear.isLeapYear(2400));

        System.out.println(IsLeapYear.getDaysInMonth(1, 2020));
        System.out.println(IsLeapYear.getDaysInMonth(2, 2020));
        System.out.println(IsLeapYear.getDaysInMonth(2, 2018));
        System.out.println(IsLeapYear.getDaysInMonth(-1, 2020));
        System.out.println(IsLeapYear.getDaysInMonth(1, -2020));
        System.out.println(IsLeapYear.getDaysInMonth(8, 2020));
    }
}
