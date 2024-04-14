package com.michael.newjava.O_O_P.Abstraction;

public class Dollar implements Account{
    @Override
    public String AccountType() {
        return "Dollar";
    }

    @Override
    public int AccountLimit() {
        return 100000;
    }

    public static void main(String[] args) {
        System.out.println("This is the " + new Dollar().AccountType() + " Account Type and the Account Limit is " + "$" + new Dollar().AccountLimit() + " USD");
    }
}
