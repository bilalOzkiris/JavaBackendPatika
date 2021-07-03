import java.util.Scanner;

public class Main {
    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, (i + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();
        boolean result = isPrime(num, 2);
        String msg = result ? "a Prime number." : "not a Prime number.";
        System.out.printf("%d is ", num);
        System.out.println(msg);

    }
}
