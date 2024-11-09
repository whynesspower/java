package oops;
public class Constructor{
    int x;
    // contructors have no return type
    public Constructor(){
        x = 5;
    }
    public static void main(String[] args){
        Main obj = new Main();
        System.out.println(obj.x);
    }
}