import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, stepValue, total = 0;
        System.out.print("Number: ");
        number = scanner.nextInt();
        int tempNumber = number;
        while (tempNumber != 0) {
            stepValue = tempNumber % 10;
            total += stepValue;
            tempNumber /= 10;
        }
        System.out.println(String.format("Sum of step values of %d = ", number) + total);
    }
}
