package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InMemoryDB {
    private ArrayList<Transaction> transactions;
    private  ArrayList<User> users;
    private ArrayList <Account> accounts;

    private HashMap<Long,ArrayList<Integer>> transactionTracking;
    private HashMap<String,Integer> usersTracking;
    private HashMap<Long, Integer> accountTracking;

    //CRUDE OPERATIONS

    public  <T> Response command(String command, String table, T data){
        switch (command){
            case "CREATE"->{
               return create(table,data);
            }
            case "FIND"->{

            }
            case "FIND_ALL"->{

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
                    response.setStatus(1);
                }
            }
            case "transaction"->{
                if (this.transactions==null){
                    transactions=new ArrayList<>();
                    transactionTracking = new HashMap<>();
                }
                Transaction transaction = (Transaction) data;
                transactions.add(transaction);
                if(transactionTracking.containsKey(transaction.getAccount().getAccountNumber())){
                    //Retrieve all transaction for user
                    ArrayList<Integer> myTransactions = transactionTracking.get(transaction.getAccount().getAccountNumber());
                    myTransactions.add(transactions.size()-1);
                    transactionTracking.put(transaction.getAccount().getAccountNumber(),myTransactions);
                }else {
                    ArrayList<Integer> myTransaction =  new ArrayList<>();
                    myTransaction.add(transactions.size()-1);
                    transactionTracking.put(transaction.getAccount().getAccountNumber(),myTransaction);
                }
                response.setMsg("Transaction completed for  "+ transaction.getAccount().getPerson().getName());
                response.setStatus(0);
            }
            case "account"->{
                if(this.accounts==null){
                    accounts=new ArrayList<>();
                    accountTracking=new HashMap<>();
                }
                //
                Random random = new Random();
                long lowerBound = 11000000000L;
                long upperBound = 99999999999L;
                Long acc=random.nextLong(lowerBound,upperBound);
                while (accounts.contains(acc)){
                    acc=random.nextLong(lowerBound,upperBound);
                }
                Account account = (Account) data;
                account.setAccountNumber(acc);
                accounts.add(account);
                accountTracking.put(account.getAccountNumber(),accountTracking.size()-1);
            }
        }
        return response;
    }
    private <T> T find(String table,String s){
        return (T)s;
    }
}
