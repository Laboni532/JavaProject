package LibraryProject.com;

public class Book {
    int id;
    String bookName;
    String author;
    String year;

    public Book() {}
    public Book(int id,String bookName,String author,String year){
        this.id=id;
        this.author=author;
        this.bookName=bookName;
        this.year=year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public void print(){
        System.out.println(id+ "   BOOK NAME : " +bookName+ "AUTHOR: "+author+ "YEAR : "+year);
    }
    }

