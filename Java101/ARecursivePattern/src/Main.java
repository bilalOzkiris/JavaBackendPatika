import java.util.Scanner;

public class Main {
    static int pattern(int n) {
        /*
        pattern(6) = 6 1 -4 1 6
        pattern(-6) = -6 -1 4 -1 -6
        pattern(0) = 0 5 0
         */
        System.out.print(n + " ");
        int nextNumber;
        if (n > 0) {
            if (n - 5 <= 0)
                return n;
            nextNumber = pattern(n - 5) + 5;
        }
        else {
            if (n - 5 >= 0)
                return n;
            nextNumber = pattern(n + 5) - 5;
        }
        System.out.print(nextNumber + " ");
        return nextNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number: ");
        int num = sc.nextInt();
        System.out.print("The pattern: ");
        pattern(num);
    }
}
