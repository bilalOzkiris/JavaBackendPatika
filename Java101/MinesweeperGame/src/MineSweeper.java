import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private final int row;
    private final int column;
    private final String[][] field;
    public final int[][] minePositions;

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.field = new String[row][column];
        this.minePositions = new int[row * column / 4][2];
    }

    public void setUpField() {
        for (String[] row : field) {
            Arrays.fill(row, "-");
        }
    }

    public void setMinesNegative() {
        for (int[] minePosition : minePositions) {
            Arrays.fill(minePosition, -1);
        }
    }

    public boolean isInMines(int r, int c) {
        for (int[] row : minePositions) {
            if (row[0] == r && row[1] == c) {
                return true;
            }
        }
        return false;
    }

    public void setUpMines() {
        setMinesNegative();
        Random rand = new Random();
        int counter = 0;
        do {
            int mineRow = rand.nextInt(row);
            int mineCol = rand.nextInt(column);
            if (!isInMines(mineRow, mineCol)) {
                this.minePositions[counter][0] = mineRow;
                this.minePositions[counter][1] = mineCol;
                counter++;
            }
        } while (counter < minePositions.length);

    }

    public void displayField() {
        for (String[] row : field) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public boolean isValid(int r, int c) {
        return ((r >= 0) && (r <= (row - 1))) && ((c >= 0) && (c <= (column - 1)));
    }

    public boolean isMine(int r, int c) {
        for (int[] row : minePositions) {
            if (r == row[0] && c == row[1]) {
                return true;
            }
        }
        return false;
    }

    public boolean isClose(int r, int c) {
        return field[r][c].equals("-");
    }

    public void gameOver() {
        System.out.println("Game over!");
    }

    public String numOfAdjacentMines(int r, int c) {
        int numOfMines = 0;
        if (isValid(r - 1, c - 1) && isClose(r - 1, c - 1) && isMine(r - 1, c - 1)) {
            numOfMines++;
        }
        if (isValid(r - 1, c) && isClose(r - 1, c) && isMine(r - 1, c)) {
            numOfMines++;
        }
        if (isValid(r - 1, c + 1) && isClose(r - 1, c + 1) && isMine(r - 1, c + 1)) {
            numOfMines++;
        }
        if (isValid(r, c - 1) && isClose(r, c - 1) && isMine(r, c - 1)) {
            numOfMines++;
        }
        if (isValid(r, c + 1) && isClose(r, c + 1) && isMine(r, c + 1)) {
            numOfMines++;
        }
        if (isValid(r + 1, c - 1) && isClose(r + 1, c - 1) && isMine(r + 1, c - 1)) {
            numOfMines++;
        }
        if (isValid(r + 1, c) && isClose(r + 1, c) && isMine(r + 1, c)) {
            numOfMines++;
        }
        if (isValid(r + 1, c + 1) && isClose(r + 1, c + 1) && isMine(r + 1, c + 1)) {
            numOfMines++;
        }
        return Integer.toString(numOfMines);
    }

    public void updateField(int r, int c, String value) {
        this.field[r][c] = value;
    }

    public boolean isWin() {
        int mineCounter = 0;
        for (String[] row : field) {
            for (String col : row) {
                if (col.equals("-")) {
                    mineCounter++;
                }
            }
        }
        return mineCounter == row * column / 4;
    }

    public void revealMines() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals("-")){
                    updateField(i, j, "*");
                }
            }
        }
    }

    public void congrats() {
        System.out.println("Congratulations!");
    }

    public void invalidInputError() {
        System.out.println("--> Invalid input!");
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        setUpField();
        setUpMines();
        while (true) {
            System.out.println("---------------------");
            displayField();
            System.out.print("Row: ");
            int row = scan.nextInt();
            System.out.print("Column: ");
            int column = scan.nextInt();
            if (isValid(row, column)) {
                if (isClose(row, column)) {
                    if (isMine(row, column)) {
                        updateField(row, column, "*");
                        System.out.println();
                        System.out.println("===============");
                        displayField();
                        gameOver();
                        System.out.println("===============");
                        break;
                    } else {
                        updateField(row, column, numOfAdjacentMines(row, column));
                        if (isWin()) {
                            System.out.println();
                            System.out.println("===============");
                            revealMines();
                            displayField();
                            congrats();
                            System.out.println("===============");
                            break;
                        }
                    }
                } else {
                    invalidInputError();
                }
            } else {
                invalidInputError();
            }
        }
    }
}
