import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Üçgenin kenarları: input
        int a, b, c;
        // Alan: output
        double area;
        // Alan hesabında kullanılacak çevre, u değeri.
        int circumference;
        double u;

        System.out.print("1. Kenar: ");
        a = scanner.nextInt();
        System.out.print("2. Kenar: ");
        b = scanner.nextInt();
        System.out.print("3. Kenar: ");
        c = scanner.nextInt();

        circumference = a + b + c;
        u = circumference / 2.0;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.print("Üçgenin alanı: " + area);


    }
}
