import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inpNum, total = 0, average;

        System.out.print("Enter a number: ");
        inpNum = sc.nextInt();
        // if a number is divisible by 3 and 4, it is divisible by 12.
        // we are starting at 0 so adding 12 in every iteration will do the trick.
        for (int i = 0; i <= inpNum; i += 12) {
            total += i;
        }
        // number of numbers which can be divisible by 3 and 4 can be found with
        // (inpNum / 12) + 1. (if you want to exclude 0, inpNum / 12 will be enough.
        average = total / ((inpNum / 12) + 1);

        System.out.println("Average of numbers divisible by 3 and 4: " + average);

    }
}
