
import model.entities.Account;
import model.exceptions.InsufficientBalanceException;
import model.exceptions.WithdrawLimitExceededException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");

            System.out.print("Account number: ");
            int accountNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(accountNumber, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.print("New Balance: " + account.getBalance());
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch (WithdrawLimitExceededException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
      sc.close();
    }
}