package br.com.practice.staticVariables;

public class Account {
    private String accountNumber;
    public static int numberOfAccounts;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        numberOfAccounts+=1;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
