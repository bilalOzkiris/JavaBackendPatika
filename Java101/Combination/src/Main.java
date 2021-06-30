import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double combination;
        int n, r, nMinusR, nFakt = 1, rFakt = 1, nMinusRFakt = 1;
        System.out.println("C(n, r);");
        System.out.print("n: ");
        n = reader.nextInt();
        System.out.print("r: ");
        r = reader.nextInt();

        for (int i = 1; i <= n; i++) {
            nFakt *= i;
        }
        for (int j = 1; j <= r; j++) {
            rFakt *= j;
        }
        nMinusR = n - r;
        for (int t = 1; t <= nMinusR; t++) {
            nMinusRFakt *= t;
        }
        combination = (double) ((nFakt) / (rFakt * nMinusRFakt));
        System.out.println(String.format("C(%d, %d)", n, r) + " = " + combination);
    }
}
