public class Main {
    public static void main(String[] args) {

        printSquareStar(5);
        System.out.println();
        printSquareStar(6);
        System.out.println();
        printSquareStar(7);
        System.out.println();
        printSquareStar(8);

    }

    public static void printSquareStar (int numberOfRows) {

        if (numberOfRows < 5) {
            System.out.println("Invalid Value");
        } else {

            int numberOfColumns = numberOfRows; //it's redundant, but I may upgrade program to do other patterns in future
            String space = " ";
            String asterisk = "*";

            for (int i = 1; i <= numberOfRows; i++) {

                for (int j = 1; j <= numberOfColumns; j++) {
                    if (j == 1 || j == numberOfColumns) {
                        System.out.print(asterisk);
                    } else if (i == j) {
                        System.out.print(asterisk);
                    } else if (i == 1 || i == numberOfRows) {
                        System.out.print(asterisk);
                    } else if (j == numberOfRows - i + 1) {
                        System.out.print(asterisk);
                    } else {
                        System.out.print(space);
                    }

                }
                System.out.println();
            }
        }

    }
}