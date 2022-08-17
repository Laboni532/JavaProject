package callByValue.com;

public class Utlity {
    public static void display(int number){
        System.out.println("Number"+ number);
    }
    public static void display(String word){
        System.out.println("Word"+ word);
    }
    public static void display(double number){
        System.out.println("Number"+ number);
    }

   public static void display(String [] name){
       System.out.println("Welcome to the world");
       for(String s:name)
           display(s);
   }
    public static void main(String[] args) {
        Utlity.display(10);
        Utlity.display(10.5);
        Utlity.display("Hundred");
        String [] nameArray={"gg","yy","kk"};
        Utlity.display(nameArray);

    }
}
