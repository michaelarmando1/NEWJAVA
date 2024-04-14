package com.michael.newjava.O_O_P.Abstraction;

public class Current implements Account{
    @Override
    public String AccountType() {
        return "Current";
    }

    @Override
    public int AccountLimit() {
        return 1000000;
    }
    public static void main(String[] args) {
        System.out.println("This is the " + new Current().AccountType() + " Account Type and the Account Limit is " + "$" + new Current().AccountLimit() + " USD");
    }
}
