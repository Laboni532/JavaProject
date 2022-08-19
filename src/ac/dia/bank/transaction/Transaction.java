package ac.dia.bank.transaction;
import ac.dia.bank.Accounts;

import java.time.Instant;
import java.util.ArrayList;

public class Transaction {
    private int tid;
    private String date;
    private double amount;
    private String type;
    private Accounts by;

    public Transaction(int tid) {
        this.tid = tid;
        this.date = Instant.now().toString();
    }

    public Accounts getBy() {

        return by;
    }

    public void setBy(Accounts by) {

        this.by = by;
    }

    public int getTid() {

        return tid;
    }

    public void setTid(int tid) {

        this.tid = tid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void deposit(Accounts acc, double amount){
        setType("deposit");
        setBy(acc);
        setAmount(amount);
        acc.deposit(amount);
        acc.getTransactions().add(this);
    }
    public void withdrawn(Accounts acc, double amount){
        setType("withdrawn");
        setBy(acc);
        setAmount(amount);
        acc.withdrawn(amount);
        acc.getTransactions().add(this);
    }
    public void transactionDisplay(){
        System.out.println("transactionID "+ getTid());
        System.out.println("date "+ getDate());
        System.out.println("type "+ getType());
        System.out.println("amount "+ getAmount());
        getBy().display();
    }
}
