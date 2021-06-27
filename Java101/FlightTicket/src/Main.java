import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double perKm = 0.1;
        double amount;
        int distance, age, type;

        System.out.print("Distance(km): ");
        distance = sc.nextInt();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Trip type(One way: 1, Round: 2): ");
        type = sc.nextInt();

        if (distance > 0 && age > 0) {
            amount = distance * perKm;
            if (age < 12) {
                amount *= 0.5;
            } else if (age <= 24) {
                amount *= 0.9;
            }
            if (age > 65) {
                amount *= 0.7;
            }
            switch (type) {
                case 1:
                    break;
                case 2:
                    amount *= 1.6;
                    break;
                default:
                    System.out.println("Invalid input! Please try again.");
            }
            System.out.println("Amount: " + amount + " TL");
        } else {
            System.out.println("Invalid input! Please try again.");
        }

    }
}
