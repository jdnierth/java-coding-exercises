package nierth.learnjava.NumberToWords;

public class NumberToWords {

    public static int reverse(int number) {
        String output = "";

        if(number < 0) {
            return number;
        }

        while (number > 0) {
            output += number % 10;
            number = number / 10;
        }
        return Integer.parseInt(output);
    }

    public static void numberToWords(int number) {

        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNum = reverse(number);
        int lastNumber;
        String output = "";

        // Fill up with missing zeros after parseInt action
        int missingDigits = getDigitCount(number) - getDigitCount(reversedNum);

        while (reversedNum > 0) {
            lastNumber = reversedNum % 10;
            reversedNum = reversedNum / 10;

            switch(lastNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }

        if(missingDigits > 0) {
            for(int i = 0; i < missingDigits; i++ ) {
                System.out.println("Zero");
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;

        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            return 1;
        }

        while(number > 0) {
            number = number / 10;
            count ++;
        }

        return count;
    }
}
