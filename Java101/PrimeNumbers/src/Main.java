import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String primeNumbers = "";
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            int counter = 0;
            for(int num = i; num >= 1; num--) {
                if(i % num == 0)
                    counter = counter + 1;
            }
            if (counter == 2)
                primeNumbers = primeNumbers + i + " ";
        }
        System.out.printf("Prime numbers from 1 to %d are: ", n);
        System.out.println(primeNumbers);
    }
}
