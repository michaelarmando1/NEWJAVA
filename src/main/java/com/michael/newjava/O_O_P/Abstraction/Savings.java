package com.michael.newjava.O_O_P.Abstraction;

public class Savings implements Account{
    @Override
    public String AccountType() {
        return "Savings";
    }

    @Override
    public int AccountLimit() {
        return 3000000;
    }

    public static void main(String[] args) {
        System.out.println("This is the " + new Savings().AccountType() + " Account Type and the Account Limit is " + "$" + new Savings().AccountLimit() + " USD");
    }
}
