import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a height: ");
        int height = sc.nextInt();
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * height - 1 - 2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
