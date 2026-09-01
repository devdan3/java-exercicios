package model.entities;

import model.exceptions.InsufficientBalanceException;
import model.exceptions.WithdrawLimitExceededException;

public class Account {

    private int accountNumber;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(){

    }

    public Account(int accountNumber, String holder, double balance, double withdrawLimit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(balance == 0) {
            throw new InsufficientBalanceException("Withdraw error: Not enough balance.");
        }
        if(amount > withdrawLimit || amount > balance) {
            throw new WithdrawLimitExceededException("Withdraw error: The amount exceeds withdraw limit.");
        }
        balance -= amount;
    }
}
