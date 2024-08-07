package com.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BankingOperations {
    private List<User> userList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
   BankAccount ba=new BankAccount();
    public void readUserChoice() {
        System.out.println("Enter your choice:");
        System.out.println("1. register a new user");
        System.out.println("2. login as an existing user");
        System.out.println("3. display user");
        
        System.out.println("4. Exit");
    }

    public void bankingMenu() throws InvalidValueException, InsufficientFundsException {
        while (true) {
            readUserChoice();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    login();
                    break;
                
                case 3:
                    displayUsers();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private void registerUser() {
        System.out.println("Enter user details:");
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();
        System.out.print("Account Number: ");
        String accNo = sc.next();
        System.out.print("User ID: ");
        String userId = sc.next();

        User user = new User();
        user.setUsername(username);
        user.setAccNumber(accNo);
        user.setUserId(userId);
        user.setPassword(password);
        userList.add(user);
        System.out.println("User registered successfully.");
    }

    private void login() throws InvalidValueException, InsufficientFundsException {
        System.out.println("Enter login details:");
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();

        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful. Welcome, " + username + "!");
                ba.deposit(10000);
               System.out.println( ba.getBalance());                               
                ba.withdraw(200);
                System.out.println( ba.getBalance()); 
            }
            else {
            	 System.out.println("Login failed. Invalid username or password.");
            }
        }

       
    }
            

    private void displayUsers() {
        System.out.println("Registered Users:");
        for (User user : userList) {
            System.out.println("Username: " + user.getUsername());
            System.out.println("Account Number: " + user.getAccNumber());
            System.out.println("User ID: " + user.getUserId());
            System.out.println(); // Add a blank line for readability
            
        }
    }

    
}