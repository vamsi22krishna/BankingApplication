package com.bank;




public class SavingsAccount extends BankAccount {
    final double DEFAULT_RATE = 0.03; 
    private double interestRate;

    
    public SavingsAccount() {
        super();
        this.interestRate = DEFAULT_RATE;
    }

   
    public SavingsAccount(double initialBalance, double interestRate) throws InvalidValueException {
        super(initialBalance);
        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }
        this.interestRate = interestRate;
    }
    
    
    public void applyInterest() throws InvalidValueException {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

   
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double rate) throws InvalidValueException {
        if (rate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }
        this.interestRate = rate;
    }


}