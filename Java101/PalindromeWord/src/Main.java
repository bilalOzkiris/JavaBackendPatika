import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String s) {
        int counter = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - (i + 1))) {
                counter++;
            }
        }
        return counter == s.length() / 2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Word: ");
        String word = scan.nextLine();
        boolean result = isPalindrome(word);
        String resultStr = result ? "Palindrome." : "not Palindrome.";
        System.out.println(word + " is " + resultStr);
    }
}
