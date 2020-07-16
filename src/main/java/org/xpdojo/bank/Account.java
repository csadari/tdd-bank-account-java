package org.xpdojo.bank;

public class Account {
    private String acctNumber;
    private double balance;

    public Account(String acctNum, double initialBalance)
    {
        acctNumber = acctNum;
        balance = initialBalance;
    }

    public void depositAmount( double moneyToBeDeposited) {
        this.balance= this.balance + moneyToBeDeposited;
    }

    public void withdrawAmount( double moneyToBeWithdrawn) {
        this.balance= this.balance - moneyToBeWithdrawn;
    }

    public double getBalance()
    {
        return balance;
    }
    public void printReport ()
    {
        System.out.println("The Account Number is :" + this.acctNumber);
        System.out.println("The balance is :" +  this.balance);
    }
    public static void transferFunds(Account fromAccount, Account toAccount,  double transferAmount)
    {
        if (fromAccount.getBalance() >= transferAmount)
        { fromAccount.withdrawAmount(transferAmount);
            toAccount.depositAmount(transferAmount);
        }
    }

}
