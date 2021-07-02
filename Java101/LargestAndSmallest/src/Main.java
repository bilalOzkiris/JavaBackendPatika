import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner s = new Scanner(System.in);

        System.out.print("How many numbers will you enter?: ");
        int numOfNums = s.nextInt();

        for (int i = 0; i < numOfNums; i++){
            System.out.printf("%d. Number: ", (i + 1));
            int number = s.nextInt();
            if (number < min)
                min = number;
            if (number > max)
                max = number;
        }

        System.out.printf("Largest: %d\nSmallest: %d%n", max, min);
    }
}
