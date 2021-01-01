package nierth.learnjava.DiagonalStar;

public class DiagonalStar {

    /**
     *
     * @param number    number of rows to print
     */
    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
        }

        for(int row = 1; row <= number; row++) {
            for(int column = 1; column <= number; column++) {
                if ((row == 1 || row == number || column == 1 || column == number) || (row == column) || (column == (number - row + 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                if (column == number) {
                    System.out.println();
                }
            }
        }
    }
}
