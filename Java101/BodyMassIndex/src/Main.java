import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * BMI = weight / (height * height)
         *      weight: kg
         *      height: meter
         */
        Scanner scanner = new Scanner(System.in);

        double weight, height, bmi;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        height = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu (kilogram cinsinde) giriniz: ");
        weight = scanner.nextDouble();

        bmi = weight / (height * height);

        System.out.print("Vücut Kitle İndeksiniz: " + bmi);

    }
}
