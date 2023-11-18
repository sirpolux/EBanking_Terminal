package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");




    }

    static User createUser(Scanner scan){
        User user = new User();
        System.out.println("Thanks for showing your interest in opening an account with us\nPlease provide the required data below\n");

        user.setName(getStringData(scan,"Enter your full name"));
        user.setAge(getIntData(scan,"Age"));
        user.setPhoneNumber(getStringData(scan,"Email"));
        user.setGender(getStringData(scan,"Gender"));
        return user;
    }

    static String getStringData (Scanner s, String msg){
        System.out.print(msg+ ":  ");
        return s.nextLine();
    }

    static Integer getIntData(Scanner s, String msg){
        System.out.print(msg+ ":  ");
        return s.nextInt();
    }
    static void instructions() {
        String[] command = new String[6];
        command[0] = "1 : Create account";
        command[1] = "2 : Make deposit";
        command[2] = "3 : Withdrawals";
        command[3] = "4 : Transfer funds";
        command[4] = "5 : Transaction history";
        command[5] = "6 : Exit";
        System.out.println("Customers Support System");
        for (String cmd : command) {
            System.out.println(cmd);
        }
    }




}