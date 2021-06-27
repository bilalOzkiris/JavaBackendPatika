import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("1. Number: ");
        num1 = sc.nextDouble();
        System.out.print("2. Number: ");
        num2 = sc.nextDouble();
        System.out.print("3. Number: ");
        num3 = sc.nextDouble();
        // comparing first and second number. If true then swap them.
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // comparing second and third number. If true then swap them.
        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        // comparing first and second number again because the order may be changed. If true then swap them.
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("The order of given numbers: "
                        + num1 + " < " + num2 + " < " + num3);
        // efficient for sorting 3 numbers only. Because incre
    }
}
