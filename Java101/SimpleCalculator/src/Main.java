import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Numbers to calculate.
        double num1, num2;
        // Character for calculation type.
        char op;
        // Showing available operations and corresponding operation symbols.
        System.out.println("Available operations;");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Addition: +\nSubtraction: -\nMultiplication: *\nDivision: /\nModulo: %");
        System.out.println("----------------------------------------------------------------------");
        // Getting inputs.
        System.out.print("1. Number: ");
        num1 = scanner.nextDouble();
        System.out.print("The character corresponding to the operation you want to perform: ");
        op = scanner.next().charAt(0);
        System.out.print("2. Number: ");
        num2 = scanner.nextDouble();
        // Calculating...
        switch (op) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                }else {
                    System.out.println("Cannot be divided by zero!");
                }
                break;
            case '%':
                System.out.println("Result: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid operator!!! Please try again.");
        }

    }
}
