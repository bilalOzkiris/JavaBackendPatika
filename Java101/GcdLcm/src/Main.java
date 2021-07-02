import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = scan.nextInt();
        System.out.print("Second number: ");
        int num2 = scan.nextInt();

        // gcd section.
        int gcd = 1;
        int gcdCounter = (num1 <= num2) ? num1 : num2;
        while (gcdCounter > 0) {
            if (num1 % gcdCounter == 0 && num2 % gcdCounter == 0) {
                gcd = gcdCounter;
                break;
            }
            gcdCounter--;
        }

        // lcm section.
        int lcm = 1;
        int lcmCounter = num1 * num2;
        while (lcmCounter >= 1) {
            if (lcmCounter % num1 == 0 && lcmCounter % num2 == 0) {
                lcm = lcmCounter;
                break;
            }
            lcmCounter--;
        }

        System.out.println("GCD: " + gcd + "\n" + "LCM: " + lcm);

    }
}
