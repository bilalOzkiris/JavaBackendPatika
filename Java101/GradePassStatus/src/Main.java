import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int math, physics, turkish, chem, music;
        double average;

        System.out.print("Math grade: ");
        math = scan.nextInt();
        System.out.print("Physics grade: ");
        physics = scan.nextInt();
        System.out.print("Turkish grade: ");
        turkish = scan.nextInt();
        System.out.print("Chemistry grade: ");
        chem = scan.nextInt();
        System.out.print("Music grade: ");
        music = scan.nextInt();

        // checking for valid grade input... if not valid set to zero.
        math = (math < 0 || math > 100) ? 0 : math;
        physics = (physics < 0 || physics > 100) ? 0 : physics;
        turkish = (turkish < 0 || turkish > 100) ? 0 : turkish;
        chem = (chem < 0 || chem > 100) ? 0 : chem;
        music = (music < 0 || music > 100) ? 0 : music;

        average = (math + physics + turkish + chem + music) / 5.0;
        System.out.println("Your average: " + average);

        if (average < 55) {
            System.out.println("You have failed.");
        } else {
            System.out.println("You have passed.");
        }

    }
}
