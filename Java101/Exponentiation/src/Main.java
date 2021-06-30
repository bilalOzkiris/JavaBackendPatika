import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        n^r = n * n * n * .... * n -> r times.
         */
        Scanner scan = new Scanner(System.in);
        int n, r, result = 1;
        System.out.println("n^r;");
        System.out.print("n: ");
        n = scan.nextInt();
        System.out.print("r: ");
        r = scan.nextInt();

        for (int i = 0; i < r; i++) {
            result *= n;
        }
        System.out.println(String.format("%d power %d:", n, r) + " = " + result);
    }
}
