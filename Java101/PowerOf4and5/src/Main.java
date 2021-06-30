import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum;

        System.out.print("Enter a number: ");
        inputNum = sc.nextInt();

        System.out.println("Powers of 4 and 5 up to the entered number;");
        // using for loop with multiple counter variables.
        for (int i = 1, j = 1; i <= inputNum || j <= inputNum; i *= 4, j *= 5) {
            if (i == j) // if equal print one of them.
                System.out.println(i);
            else if (i > inputNum) // if one of the counters bigger than the input number
                System.out.println(j);
            else if (j > inputNum) // print other one.
                System.out.println(i);
            else // if none of them bigger than the input number print both of them.
                System.out.println(i + "\n" + j);
        }
        
    }
}
