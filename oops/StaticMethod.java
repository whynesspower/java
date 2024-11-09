package oops;

public class StaticMethod{
    static void first(){
        System.out.println("doesn\'t need to create an object of this class to class static methods");
    }
    public void second(){
        System.out.println("Need to create an object of the class to be able to use public methods");
    }
    public static void main (String[] args){
        first();
        StaticMethod obj = new StaticMethod();
        obj.second();
    }
}