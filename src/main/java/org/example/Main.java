package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user =  new User();
        user.setAge(20);
        user.setPhoneNumber("polux@gmail.com");
        user.setName("Machong Paul");

        InMemoryDB inMemoryDB = new InMemoryDB();
        Response response= inMemoryDB.command("CREATE","users",user);
        System.out.println(response);
        Response response1= inMemoryDB.command("CREATE","users",user);
        System.out.println(response1);
        Scanner scanner1 = new Scanner(System.in); // Scanner
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




}