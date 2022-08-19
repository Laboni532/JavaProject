package LibraryProject.com;

public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        library.create("A","Mr.A","2001",5);
        library.create("B","Mr.B","2002",8);
        System.out.println(library.get(4));
        library.getAll();

    }
}
