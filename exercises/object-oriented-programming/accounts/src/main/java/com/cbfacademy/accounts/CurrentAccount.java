package com.cbfacademy.accounts;
public class CurrentAccount extends Account {
    private double overdraftLimit;
    public class CurrentAccount {
        public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
            super(accountNumber,balance);
            this.overdraftLimit = overdraftLimit;
        }
   }
}


       