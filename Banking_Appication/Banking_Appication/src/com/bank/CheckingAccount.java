package com.bank;




public class CheckingAccount extends BankAccount {
    private double monthlyFee;
    
    
    public CheckingAccount() {
        super();
        this.monthlyFee = 10.00;
       
    }

   
    public CheckingAccount(double initialBalance, double monthlyFee) throws InvalidValueException {
        super(initialBalance);
       
        if (monthlyFee < 0) {
            throw new IllegalArgumentException("Monthly fee cannot be negative.");
        }
        this.monthlyFee = monthlyFee;
    }
    public double getBalance() {
        return balance;
    }


    
    public void applyMonthlyFee() throws InsufficientFundsException, InvalidValueException {
        withdraw(monthlyFee);
    }

   
    public double getMonthlyFee() {
        return monthlyFee;
    }

   
    public void setMonthlyFee(double fee) throws IllegalArgumentException {
        if (fee < 0) {
            throw new IllegalArgumentException("Monthly fee cannot be negative.");
        }
        this.monthlyFee = fee;
    }

}