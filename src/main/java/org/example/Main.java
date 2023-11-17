package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user =  new User();
        user.setAge(20);
        user.setEmail("polux@gmail.com");
        user.setName("Machong Paul");

        InMemoryDB inMemoryDB = new InMemoryDB();
        Response response= inMemoryDB.command("CREATE","users",user);
        System.out.println(response);
        Response response1= inMemoryDB.command("CREATE","users",user);
        System.out.println(response1);
        Scanner scanner1 = new Scanner(System.in); // Scanner
    }

    static User createUser(Scanner scan){

        return null;
    }

    static String getStringData (Scanner s, String msg){
        System.out.print(msg+ ":  ");
        return s.nextLine();
    }




}