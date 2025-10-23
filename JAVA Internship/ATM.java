import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: Rs" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: Rs" + balance);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
            return false;
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
            return false;
        }
    }
}

public class ATM {
    private BankAccount userAccount;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.userAccount = account;
        this.sc = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n--- ATM Menu ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositFunds();
                    break;
                case 3:
                    withdrawFunds();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        sc.close();
    }

    private void checkBalance() {
        System.out.println("Your current balance is: Rs" + userAccount.getBalance());
    }

    private void depositFunds() {
        System.out.print("Enter amount to deposit: $");
        double amount = sc.nextDouble();
        userAccount.deposit(amount);
    }

    private void withdrawFunds() {
        System.out.print("Enter amount to withdraw: $");
        double amount = sc.nextDouble();
        userAccount.withdraw(amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000.00); // 
        ATM atm = new ATM(account);
        atm.run();
    }
}