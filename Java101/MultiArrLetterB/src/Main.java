import java.util.Scanner;

public class Main {
    public static String[][] letterB(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == (arr.length - 1) / 2 || i == arr.length - 1) {
                    arr[i][j] = " *";
                } else if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = " *";
                } else {
                    arr[i][j] = "  ";
                }
            }
        }
        return arr;
    }

    public static void printMultiDimArr(String[][] arr) {
        for (String[] row : arr) {
            for (String col: row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row(must be odd and bigger than 2): ");
        int row = sc.nextInt();
        System.out.print("Column(must be bigger than 2): ");
        int column = sc.nextInt();

        String[][] letter = letterB(new String[row][column]);
        printMultiDimArr(letter);
    }
}
