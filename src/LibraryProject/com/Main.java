package LibraryProject.com;

public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        Book book =new Book(1,"Abook","A", "1000");
        book.print();
    }
}
