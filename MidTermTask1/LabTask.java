import java.util.Scanner;

public class LabTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {

            int[][] array = new int[3][3];
            int[] rowSum = new int[3];
            int[] colSum = new int[3];
            int diagonalSum1 = 0;
            int diagonalSum2 = 0;

            System.out.println("Input 9 elements:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    rowSum[i] += array[i][j];
                    colSum[j] += array[i][j];

                    if (i == j) {
                        diagonalSum1 += array[i][j];
                    }
                    if (i + j == 2) {
                        diagonalSum2 += array [i][j];
                    }
                }
            }

            System.out.println("\nHere are the Numbers and the required outputs:");
            System.out.println("Row Sum");
            System.out.println();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%-6d", array[i][j]);
                }
                System.out.printf("%-6d%n", rowSum[i]);
            }

            System.out.println();
            System.out.print("Column Sum:");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-6d", colSum[j]);
            }
            System.out.println();

            System.out.println("Diagonal sum 1: " + diagonalSum1);
            System.out.println("Diagonal sum 2: " + diagonalSum2);

            System.out.print("\nDo you want to try another input? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        scanner.close();
        System.out.println("Program terminated.");
    }
}
