import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Inputs.
        String userName, password, reset, newPassword;

        System.out.print("User name: ");
        userName = scan.nextLine();
        System.out.print("Password: ");
        password = scan.nextLine();
        // Deciding..
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Successful login.");
        } else if (userName.equals("patika")) {
            System.out.println("Wrong password!");
            System.out.print("Do you want to reset your password?(yes/no): ");
            reset = scan.nextLine();
            if (reset.equals("yes")) {
                System.out.print("Enter a new password(must be different from the last attempt and current password): ");
                newPassword = scan.nextLine();
                if (newPassword.equals("java123") || newPassword.equals(password)) {
                    System.out.println("Could not create password, please enter another one.");
                } else {
                    System.out.println("Password created.");
                }
            } else if (reset.equals("no")) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid answer! Please try again.");
            }
        } else if (password.equals("java123")) {
            System.out.println("Wrong user name!");
        } else {
            System.out.println("Wrong user name and password!");
        }
    }
}
