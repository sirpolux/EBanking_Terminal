package org.example;

import java.util.Date;

public class Transaction {
    private  Account account;
    private Date date;
    private boolean status;

    private String transactionType;
    private long amount;

    public Transaction(){}

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "account=" + account +
                ", date=" + date +
                ", status=" + status +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
