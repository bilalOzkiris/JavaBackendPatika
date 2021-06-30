import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number :");
        double n = input.nextInt();
        double nCopy = n;
        double result = 0;
        while (n > 0) {
            result += (1 / n);
            n--;
        }

        System.out.println("Harmonic series result of " + nCopy + " = " + result);


    }
}
