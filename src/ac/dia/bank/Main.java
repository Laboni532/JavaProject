package ac.dia.bank;

import ac.dia.bank.transaction.Transaction;

public class Main {

    public static void main(String[] args) {
        Accounts accounts = new Accounts(101, "Mr.B", 0);

        accounts.display();
        accounts.setAccNumber(1001);
        accounts.setTitle("MR.A");
        accounts.setBalance(1000);

        accounts.display();
        Transaction transaction1 = new Transaction(1);
        transaction1.deposit(accounts, 1000);

        transaction1.transactionDisplay();

        //accounts.display();
        Transaction transaction2 = new Transaction(2);
        transaction2.withdrawn(accounts, 2000);
        transaction2.transactionDisplay();
        //accounts.withdrawn(2000);
        accounts.showBalanceSheet();
    }
}
