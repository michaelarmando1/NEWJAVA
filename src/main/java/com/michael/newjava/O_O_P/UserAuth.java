package com.michael.newjava.O_O_P;

public class UserAuth {

    public UserAuth(String email_address, String password) {
        if (email_address.equals("michaelamando25@gmail.com") && password.equals("Michael")){
            System.out.println("You are Welcome");
        } else{
            System.out.println("Wrong Credentials, Try Again");
        }
    }

    public UserAuth(int UID, String password) {
        if(UID == 368742 && password.equals("Michael")) {
            System.out.println("You are Welcome");
        } else {
            System.out.println();
        }
    }
}
