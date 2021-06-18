import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float total, average ,math, physics, chem, turkish, history, music;
        String status;

        System.out.print("Matematik notu: ");
        math = scanner.nextFloat();
        System.out.print("Fizik notu: ");
        physics = scanner.nextFloat();
        System.out.print("Kimya notu: ");
        chem = scanner.nextFloat();
        System.out.print("Türkçe notu: ");
        turkish = scanner.nextFloat();
        System.out.print("Tarih notu: ");
        history = scanner.nextFloat();
        System.out.print("Müzik notu: ");
        music = scanner.nextFloat();

        total = math + physics + chem + turkish + history + music;
        average = total / 6;
        status = (average > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalama: " + average);
        System.out.println(status);


    }
}
