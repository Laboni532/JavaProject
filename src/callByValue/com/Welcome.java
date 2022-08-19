package callByValue.com;

public class Welcome {
    public static void message(String[]nameArray){
        for(String name: nameArray)
            System.out.println("welcome"+name);
    }
        public static void main(String[] args) {

        String [] nameArray={"a","b","c"};
        Welcome.message(nameArray);
    }
}
