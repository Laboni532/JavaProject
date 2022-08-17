package LibraryProject.com;

import ac.dia.bank.transaction.Transaction;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book>booklist=new ArrayList<Book>();

    public ArrayList<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(ArrayList<Book> booklist) {
        this.booklist = booklist;
    }
}