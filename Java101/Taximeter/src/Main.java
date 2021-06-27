import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Açılış ücreti.
        final double openingFee = 10;
        // Katedilen km.
        int traveledDistance;
        // Kilometre başı ücret ve tutar.
        double perKm = 2.2, amount;

        System.out.print("Katedilen km: ");
        traveledDistance = scanner.nextInt();

        amount = openingFee + (traveledDistance * perKm);
        amount = (amount <  20) ? 20 : amount;

        System.out.println("Toplam tutar: " + amount);

    }
}
