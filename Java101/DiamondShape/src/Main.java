import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Elmas şeklinin yüksekliği: ");
        int height = scan.nextInt();
        // height times
        for (int i = 0; i < height; i++) {
            // space counts in a diamond shape decreases and increases.
            // there is a relation between i, height and spaceCount,
            // which is absolute value of (i - (height - 1)) is equal to spaceCount.
            int spaceCount = Math.abs(i - ((height - 1) / 2));
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            // star counts in a diamond shape increases and decreases.
            // there is a relation between height,spaceCount and starCount.
            // which is (height - (2 * spaceCount)) is equal to starCount.
            int starCount = height - 2 * spaceCount;
            for (int k = 0; k < starCount; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
