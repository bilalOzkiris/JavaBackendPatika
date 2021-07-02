import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3, balance = 1500, select;

        while (right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to the G Bank!");
                do {
                    System.out.println("--------------------");
                    System.out.println("""
                            1 - Deposit money
                            2 - Withdraw money
                            3 - Balance inquiry
                            4 - Exit""");
                    System.out.println("--------------------");
                    System.out.print("Action to be taken: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Amount to be deposited: ");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                        }
                        case 2 -> {
                            System.out.print("Amount to be withdrawn: ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Insufficient balance!");
                            } else {
                                balance -= withdrawAmount;
                            }
                        }
                        case 3 -> System.out.println("Your balance: " + balance);
                        case 4 -> {
                            System.out.println("See you again!");
                            System.exit(0);
                        }
                        default -> System.out.println("Invalid selection! Please try again.");
                    }
                } while (true);
            } else {
                right--;
                System.out.println("Wrong username or password! Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact your bank.");
                } else {
                    System.out.println("Your remaining right: " + right);
                }
            }
        }

    }
}
