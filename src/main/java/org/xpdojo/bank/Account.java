package org.xpdojo.bank;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private String acctNumber;
    private double balance;
    private Date businessDate;
    private String transactionActivity = null;

    public Account(String acctNum, double initialBalance)
    {
        acctNumber = acctNum;
        balance = initialBalance;
        transactionActivity = null;
       // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            formatter = new SimpleDateFormat("dd/MM/yyyy");
            businessDate = new Date();
            // System.out.println(formatter.format(businessDate));
           // businessDate = formatter.parse(formatter.format(businessDate));

    }

    public void depositAmount( double moneyToBeDeposited) {
        this.balance= this.balance + moneyToBeDeposited;
        this.transactionActivity= "Deposit";
    }

    public void withdrawAmount( double moneyToBeWithdrawn) {
        this.balance= this.balance - moneyToBeWithdrawn;
        this.transactionActivity="Withdraw";
    }

    public double getBalance()
    {
        return balance;
    }
    public void printReport ()
    {
        System.out.println("As of Business Date:" +  businessDate);
        System.out.println("Account Number:" + this.acctNumber);
        System.out.println("TransactionActivity:" +  this.transactionActivity);
        System.out.println("Balance:" +  this.balance);


    }
    public void printBalanceReport ()
    {
        System.out.println("As of Business Date:" +  businessDate);
        System.out.println("Account Number:" + this.acctNumber);
        System.out.println("Balance:" +  this.balance);


    }
    public static void transferFunds(Account fromAccount, Account toAccount,  double transferAmount)
    {
        if (fromAccount.getBalance() >= transferAmount)
        { fromAccount.withdrawAmount(transferAmount);
            toAccount.depositAmount(transferAmount);
        }
    }
    public  void filterActivity(String filterActivity)
    {
      //  if (thia.transactionActivity == filterActivity)
        //{
          //  System.out.printkn("Found the Activity");
          //  this.printReport ();
       // }
    }
}
