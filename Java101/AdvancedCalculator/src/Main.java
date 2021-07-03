import java.util.Scanner;

public class Main {
    static int addition(int n1, int n2) {
        return n1 + n2;
    }

    static int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    static int division(int n1, int n2) {
        if (n2 == 0)
            return -1;
        return n1 / n2;
    }

    static int exponentiation(int base, int exponent) {
        int outcome = 1;
        for (int i = 0; i < exponent; i++)
            outcome *= base;
        return outcome;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    static int modulo(int n1, int n2) {
        return n1 % n2;
    }

    static int rectangularArea(int n1, int n2) {
        return multiplication(n1, n2);
    }

    static int rectangularPerimeter(int n1, int n2) {
        return 2 * addition(n1, n2);
    }

    static void exit() {
        System.out.println("Good bye!");
        System.exit(0);
    }

    static void error() {
        System.out.println("Invalid choice!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        System.out.println("Welcome to the Calculathor!");
        String menu = """
                1 - Addition
                2 - Subtraction
                3 - Multiplication
                4 - Division
                5 - Exponentiation
                6 - Factorial
                7 - Modulo
                8 - Rectangular area and perimeter
                0 - Exit
                """;
        String another;
        do {
            System.out.println(menu);
            System.out.print("Your choice: ");
            select = sc.nextInt();
            switch (select) {
                case 0 -> exit();
                case 1 -> {
                    System.out.print("1. Number: ");
                    int num1 = sc.nextInt();
                    System.out.print("2. Number: ");
                    int num2 = sc.nextInt();
                    int result = addition(num1, num2);
                    System.out.printf("%d + %d = %d", num1, num2, result);
                }
                case 2 -> {
                    System.out.print("1. Number: ");
                    int num1 = sc.nextInt();
                    System.out.print("2. Number: ");
                    int num2 = sc.nextInt();
                    int result = subtraction(num1, num2);
                    System.out.printf("%d - %d = %d", num1, num2, result);
                }
                case 3 -> {
                    System.out.print("1. Number: ");
                    int multiplier1 = sc.nextInt();
                    System.out.print("2. Number: ");
                    int multiplier2 = sc.nextInt();
                    int result = multiplication(multiplier1, multiplier2);
                    System.out.printf("%d x %d = %d", multiplier1, multiplier2, result);
                }
                case 4 -> {
                    System.out.print("1. Number: ");
                    int dividend = sc.nextInt();
                    System.out.print("2. Number: ");
                    int divisor = sc.nextInt();
                    int quotient = division(dividend, divisor);
                    if (quotient == -1)
                        System.out.println("Cannot be divided by zero!");
                    else
                        System.out.printf("%d / %d = %d", dividend, divisor, quotient);
                }
                case 5 -> {
                    System.out.print("1. Number: ");
                    int base = sc.nextInt();
                    System.out.print("2. Number: ");
                    int power = sc.nextInt();
                    int result = exponentiation(base, power);
                    System.out.printf("%d power %d = %d", base, power, result);
                }
                case 6 -> {
                    System.out.print("Number: ");
                    int n = sc.nextInt();
                    int result = factorial(n);
                    System.out.printf("%d! = %d", n, result);
                }
                case 7 -> {
                    System.out.print("1. Number: ");
                    int dividend = sc.nextInt();
                    System.out.print("2. Number: ");
                    int divisor = sc.nextInt();
                    int remainder = modulo(dividend, divisor);
                    System.out.printf("%d mode %d = %d", dividend, divisor, remainder);
                }
                case 8 -> {
                    System.out.print("Short edge: ");
                    int shortEdge = sc.nextInt();
                    System.out.print("Long edge: ");
                    int longEdge = sc.nextInt();
                    int area = rectangularArea(shortEdge, longEdge);
                    int perimeter = rectangularPerimeter(shortEdge, longEdge);
                    System.out.printf("Area of specified rectangle = %d", area);
                    System.out.println();
                    System.out.printf("Perimeter of specified rectangle = %d", perimeter);
                }
                default -> error();
            }
            System.out.println();
            System.out.print("Would you like to take another action?(y/n): ");
            sc.nextLine();
            another = sc.nextLine();
        } while (another.equals("y"));
        exit();
    }
}
