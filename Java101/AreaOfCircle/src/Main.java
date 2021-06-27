import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Area = (Pi * (r * r) * a) / 360
         *      r = radius
         *      a = Central Angle
         */
        Scanner scanner = new Scanner(System.in);
        final double Pi = 3.14;
        double r, a, area;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = scanner.nextDouble();
        System.out.print("Dairenin merkez açısını giriniz: ");
        a = scanner.nextDouble();

        area = (Pi * (r * r) * a) / 360;
        System.out.println("Dairenin alanı: " + area);


    }
}
