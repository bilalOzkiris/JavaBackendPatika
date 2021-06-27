import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double taxFreeValue, taxRate, valueWithTax, tax;

        System.out.print("Para değerini giriniz: ");
        taxFreeValue = scanner.nextDouble();

        taxRate = ((taxFreeValue >= 0) && (taxFreeValue <= 1000)) ? 0.18 : 0.08;
        tax = taxFreeValue * taxRate;
        valueWithTax = taxFreeValue + tax;

        System.out.println("KDV'siz fiyat: " + taxFreeValue);
        System.out.println("KDV oranı: " + taxRate);
        System.out.println("KDV'li fiyat: " + valueWithTax);
        System.out.println("KDV tutarı: " + tax);
    }
}
