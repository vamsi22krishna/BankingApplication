package com.bank;

public class Bank {

	public static void main(String[] args) throws InvalidValueException, InsufficientFundsException {
		BankingOperations bo = new BankingOperations();
		bo.bankingMenu();

	}

}
