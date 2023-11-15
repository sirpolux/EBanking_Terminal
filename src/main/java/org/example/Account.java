package org.example;

public class Account {
    private User person;
    private long accountNumber;
    private long balance;
    public Account(){}

    public User getPerson() {
        return person;
    }

    public void setPerson(User person) {
        this.person = person;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "person=" + person +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
