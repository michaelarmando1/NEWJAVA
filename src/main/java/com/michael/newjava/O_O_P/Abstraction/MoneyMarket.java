package com.michael.newjava.O_O_P.Abstraction;

public class MoneyMarket implements Account{
    @Override
    public String AccountType() {
        return "Money Market";
    }

    @Override
    public int AccountLimit() {
        return 500000;
    }

    public static void main(String[] args) {
        System.out.println("This is the " + new MoneyMarket().AccountType() + " and the Account Limit is " + "$" + new MoneyMarket().AccountLimit() + " USD");
    }

}

