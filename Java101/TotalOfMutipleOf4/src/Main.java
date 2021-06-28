import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inpNum, total = 0;

        do {
            System.out.print("Enter a number: ");
            inpNum = scan.nextInt();
            if (inpNum % 4 == 0)
                total += inpNum;
        } while (inpNum % 2 == 0);

        System.out.println("Total of numbers which are multiple of 4: " + total);
    }
}
