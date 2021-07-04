import java.util.Scanner;

public class Main {
    static int greaterZeroPattern(int n) {
        /*
        greaterZeroPattern(6) = 6 1 -4 1 6
        greaterZeroPattern(5) = 5 0 5
         */
        System.out.print(n + " ");
        if (n <= 0)
            return n;
        int nextNumber = greaterZeroPattern(n - 5) + 5;
        System.out.print(nextNumber + " ");
        return nextNumber;
    }

    static int lessThanEqualsZeroPattern(int n) {
        /*
        lessThanEqualsZeroPattern(-6) = -6 -1 4 -1 -6
        lessThanEqualsZeroPattern(-5) = -5 0 -5
        lessThanEqualsZeroPattern(0) = 0 -5 0
         */
        System.out.print(n + " ");
        if (n > 0)
            return n;
        int nextNumber = lessThanEqualsZeroPattern(n + 5) - 5;
        System.out.print(nextNumber + " ");
        return nextNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number: ");
        int num = sc.nextInt();
        System.out.print("The pattern: ");
        if (num > 0)
            greaterZeroPattern(num);
        else
            lessThanEqualsZeroPattern(num);
    }
}
