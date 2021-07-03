import java.util.Scanner;

public class Main {
    static int exp(int base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * exp(base, (exponent - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Power: ");
        int power = sc.nextInt();
        int result = exp(base, power);
        System.out.printf("%d to the power of %d = %d", base, power, result);
    }
}
