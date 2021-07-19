import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Minesweeper game!");
        System.out.println("****************************");
        System.out.println("Field's");
        System.out.print("\theight: ");
        int height = sc.nextInt();
        System.out.print("\twidth: ");
        int width = sc.nextInt();
        MineSweeper ms = new MineSweeper(height, width);
        ms.run();
    }
}
