import java.util.Scanner;

public class Main {
    static int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for fibonacci value: ");
        int userInput = sc.nextInt();
        int result = fibonacci(userInput);
        System.out.printf("Fibonacci value of %d = %d", userInput, result);
    }
}
