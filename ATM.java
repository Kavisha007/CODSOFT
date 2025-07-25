import java.util.*;

class BankAccount {
    double balance;

    public BankAccount(double initialbalance) {
        balance = initialbalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully Deposited Rs." + amount);
        } else {
            System.out.println("Invalid Deposit Amount ");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Successfully Withdrawn Rs." + amount);
        } else {
            System.out.println(" Insufficient Balance or Invalid Amount ");
        }
    }

    public double Checkbalance() {
        return balance;
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0);
        while (true) {

            System.out.println("-----------ATM Menu-----------");
            System.out.println("1. Check Bank Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            int a = in.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Current Balance: Rs." + account.Checkbalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposited :Rs.");
                    double deposit = in.nextDouble();
                    account.deposit(deposit);
                    break;
                case 3:
                    System.out.println("Enter the amount to be withdrawn :Rs");
                    double withdraw = in.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                    in.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice !Enter from 1 -4");
            }
        }
    }
}
