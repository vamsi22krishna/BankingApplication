package com.bank;




interface Account {
	double getBalance();
	void deposit(double amount)throws InvalidValueException;
	void withdraw(double amount)throws InsufficientFundsException,InvalidValueException;
    
}
