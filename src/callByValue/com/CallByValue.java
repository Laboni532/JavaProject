package callByValue.com;

public class CallByValue {
    int i=10;
    public int change(int i){
        return i+=20;
    }
    public static void main (String[]args){
        CallByValue obj=new CallByValue();
        int x=15;
        System.out.println("Before calling in x : "+ x);
        System.out.println(obj.change(x));
        System.out.println("After calling in x : "+ x);
    }
}
