import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                total += i;
        }

        if (number == total)
            System.out.printf("%d is a perfect number.", number);
        else
            System.out.printf("%d is not a perfect number.", number);
    }
}
