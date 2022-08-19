package LibraryProject.com;

public class Library {
    private int pointer=0;
    Book[] bookArray = new Book[10];

    public void create(String bookName,String author,String year,int amount) {
//        Book book1 =new Book(pointer,bookName,author,year,amount);
//        bookArray[pointer]=book1;
//        pointer++;
        bookArray[pointer++]=new Book(pointer,bookName,author,year,amount);
    }
    public Book get(int id){
        if(pointer<id){
            return null;
        }
        for(int i=0;i< pointer;i++){
            if(bookArray[i].id==id) {
                return bookArray[i];
            }
        }
        return null;
    }
    public void getAll(){
        for(int i=0;i< pointer;i++) {
            System.out.println(bookArray[i]);
        }
    }
}