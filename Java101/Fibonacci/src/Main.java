import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of elements for Fibonnaci series: ");
        int size = sc.nextInt();

        int num1 = 0, num2 = 1;

        for (int i = 1; i < size; i++) {
            System.out.printf("%d + %d = %d", num1, num2, (num2 + num1));
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            System.out.println();
        }
    }
}
