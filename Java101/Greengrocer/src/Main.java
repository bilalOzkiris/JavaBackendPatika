import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Manav programı;
         *      Pear: 2,14 TL
         *      Apple: 3,67 TL
         *      Tomato: 1,11 TL
         *      Banana: 0,95 TL
         *      Eggplant: 5,00 TL
         *
         *      Input: Kilogram of each purchase.
         *      Output: Total amount.
         */
        Scanner scanner = new Scanner(System.in);

        final double Pear = 2.14, Apple = 3.67, Tomato = 1.11, Banana = 0.95, Eggplant = 5;
        double kgPear, kgApple, kgTomato, kgBanana, kgEggplant, amount;

        System.out.print("Armut(kg): ");
        kgPear = scanner.nextDouble();
        System.out.print("Elma(kg): ");
        kgApple = scanner.nextDouble();
        System.out.print("Domates(kg): ");
        kgTomato = scanner.nextDouble();
        System.out.print("Muz(kg): ");
        kgBanana = scanner.nextDouble();
        System.out.print("Patlıcan(kg): ");
        kgEggplant = scanner.nextDouble();

        amount = ((kgPear * Pear) + (kgApple * Apple) + (kgTomato * Tomato)
                    + (kgBanana * Banana) + (kgEggplant * Eggplant));

        System.out.println("Toplam tutar: " + amount + " TL");

    }
}
