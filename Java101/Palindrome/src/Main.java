import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String original) {
        StringBuilder reverse = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse.append(original.charAt(i));
        }
        return original.equals(reverse.toString());
    }

    static boolean isPalindrome(int num) {
        int temp = num, reverseNum = 0, lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            temp /= 10;
        }
        return num == reverseNum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Palindrome checker!");
        System.out.println("""
                        1 - Number
                        2 - String
                        """);
        System.out.print("Your choice: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Number: ");
                int userInput = scan.nextInt();
                String msg = (isPalindrome(userInput)) ? "a Palindrome" : "not a Palindrome";
                System.out.printf("%d is ", userInput);
                System.out.println(msg);
            }
            case 2 -> {
                scan.nextLine();
                System.out.print("String: ");
                String userInput = scan.nextLine();
                String msg = (isPalindrome(userInput)) ? "a Palindrome" : "not a Palindrome";
                System.out.printf("%s is ", userInput);
                System.out.println(msg);
            }
            default -> System.out.println("Invalid choice!");
        }
    }
}

