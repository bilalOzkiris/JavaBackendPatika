import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthYear, remainder;

        System.out.print("Year of birth: ");
        birthYear = scan.nextInt();

        remainder = birthYear % 12;

        String zodiac = switch (remainder) {
            case 0 -> "Monkey";
            case 1 -> "Rooster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Mouse";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            default -> "Sheep";
        };

        System.out.println("Your chinese zodiac sign: " + zodiac);
    }
}
