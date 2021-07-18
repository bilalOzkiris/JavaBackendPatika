import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[][] transpose(int[][] arr) {
        int[][] transposed = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }

    public static int[][] generateMatrix(Random random, int upperBound, int maxValue) {
        int randValue;
        int row = random.nextInt(upperBound);
        int column = random.nextInt(upperBound);
        int[][] generatedMatrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                randValue = random.nextInt(maxValue);
                generatedMatrix[i][j] = randValue;
            }
        }
        return generatedMatrix;
    }

    public static void displayMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Upper bound for height and weight of the matrix: ");
        int upperBound = scan.nextInt();
        System.out.print("Maximum value that a matrix cell can get: ");
        int maxVal = scan.nextInt();
        System.out.println();

        int[][] matrix = generateMatrix(rand, upperBound, maxVal);
        System.out.println("Original matrix;");
        displayMatrix(matrix);
        System.out.println();
        int[][] transposedMatrix = transpose(matrix);
        System.out.println("Transposed matrix: ");
        displayMatrix(transposedMatrix);
    }
}
