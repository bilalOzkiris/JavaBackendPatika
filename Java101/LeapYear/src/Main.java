import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isLeap;
        int year;

        System.out.print("Year: ");
        year = s.nextInt();

        isLeap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
