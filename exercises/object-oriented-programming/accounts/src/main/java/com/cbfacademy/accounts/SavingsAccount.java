package com.cbfacademy.accounts;
private double interestRate;
public class SavingsAccount extends Account{
    public SavingsAccount(int accountNumber, double balance, double interestRate){
    super(accountNumber,balance);
    this.interestRate = interestRate;
   }
}


