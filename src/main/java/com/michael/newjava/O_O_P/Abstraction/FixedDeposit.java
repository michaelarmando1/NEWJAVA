package com.michael.newjava.O_O_P.Abstraction;

public class FixedDeposit implements Account{
    @Override
    public String AccountType() {
        return "Fixed Deposit";
    }

    @Override
    public int AccountLimit() {
        return 200000;
    }

    public static void main(String[] args) {
        System.out.println("This is the " + new FixedDeposit().AccountType() + " Account Type and the Account Limit is " + "$" + new FixedDeposit().AccountLimit() + " USD");
    }
}
