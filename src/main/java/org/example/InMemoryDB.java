package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class InMemoryDB {
    private ArrayList<Transaction> transactions;
    private  ArrayList<User> users;
    private ArrayList <Account> accounts;

    private HashMap<Integer,ArrayList<Integer>> tractionTracking;
    private HashMap<String,Integer> usersTracking;
    private HashMap<String, Integer> accountTracing;

    //CRUDE OPERATIONS

    //CREATE


    public  <T> Response command(String command, String table, T data){
        switch (command){
            case "CREATE"->{
               return create(table,data);
            }
        }
        return  null;
    }
    private <T> Response create(String table, T data){
        Response response = new Response();
        switch (table){
            case "users"->{
               if(this.users==null){
                   users=new ArrayList<>();
                   usersTracking = new HashMap<>();
               }
               //CHECK if Account email exists
                User user = (User)data;
                if(usersTracking.containsKey(user.getEmail())){
                    response.setMsg("User email already exists");
                    response.setStatus(0);
                }else{
                    users.add(user);
                    usersTracking.put(user.getEmail(),users.size()-1);
                    response.setMsg("Account created for user:  "+ usersTracking.get(user.getEmail()));
                    response.setStatus(0);
                }
            }
            case "transaction"->{
                Transaction transaction = (Transaction) data;
                //GE
            }
        }
        return response;
    }
}
