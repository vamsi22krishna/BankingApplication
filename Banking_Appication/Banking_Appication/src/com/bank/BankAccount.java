package com.bank;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class InvalidValueException extends Exception {
    public InvalidValueException(String message) {
        super(message);
    }
}
public class BankAccount implements Account {
    protected double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public BankAccount(double initialBalance) throws InvalidValueException {
        if (initialBalance < 0) {
            throw new InvalidValueException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws InvalidValueException {
        if (amount <= 0) {
            throw new InvalidValueException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    
    public void withdraw(double amount) throws InsufficientFundsException, InvalidValueException {
        if (amount <= 0) {
            throw new InvalidValueException("Withdrawal Cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficiant account balence.");
        }
        balance -= amount;
    }

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
    
}
