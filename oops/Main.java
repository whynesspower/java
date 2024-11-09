package oops;

public class Main {
    int x = 5;
  
    public static void main(String[] args) {
      Main myObj = new Main();
      System.out.println(myObj.x);

      StaticMethod myObj2 = new StaticMethod();
      myObj2.second();
      myObj2.first();
    }
  
  }
  