package ac.dia.bank;

import ac.dia.bank.transaction.Transaction;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Accounts {
    private int accNumber;
    private String title;
    private double balance;

    private ArrayList<Transaction>transactions=new ArrayList<Transaction>();
    public Accounts(){}
    public Accounts(int accNumber, String title, double balance) {
        this.accNumber = accNumber;
        this.title = title;
        this.balance = balance;
    }
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Accounts(Accounts accounts){
        this.accNumber=accounts.getAccNumber();
        setBalance(accounts.getBalance());
        setTitle(accounts.getTitle());

    }


    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Withdraw from the account
     * provided amount is deducted from the balance
     * @param amount
     */

    public void withdrawn(double amount) {
        if(balance>=amount) {
            balance = balance - amount;
        }else{
            System.out.println("insufficient balance");
        }
    }

    /**
     * Utility account details
     */
    public void display() {
        System.out.println("Account Number : " + accNumber + "   Title : " + title + "   Balance " + balance);
    }
    public void showBalanceSheet() {
        System.out.println("Account Number :"+accNumber);
        System.out.println("Account Title  :"+title);
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getTid()+" "+
                    transaction.getDate()+" "+transaction.getAmount()+" "+
                    transaction.getType()
            );

        }
        System.out.println("Account Balance:"+balance);

    }
}
