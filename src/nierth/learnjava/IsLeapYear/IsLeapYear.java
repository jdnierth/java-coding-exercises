package nierth.learnjava.IsLeapYear;

public class IsLeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {

            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            }

            if (year % 4 != 0 || year % 400 != 0) {
                return false;
            }

            return (year % 100 == 0 && year % 400 != 0) ||
                    (year % 100 == 0 && year % 400 == 0);


        }

        return false;

    }
}
