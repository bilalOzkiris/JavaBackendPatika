import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int temperature;

        System.out.print("Temperature: ");
        temperature = s.nextInt();

        if (temperature < 5) {
            System.out.println("Skiing");
        } else if (temperature <= 10) {
            System.out.println("Cinema");
        } else if (temperature <= 15) {
            System.out.println("Cinema or Picnic");
        } else if (temperature <= 25) {
            System.out.println("Picnic");
        } else {
            System.out.println("Swimming");
        }
    }
}
