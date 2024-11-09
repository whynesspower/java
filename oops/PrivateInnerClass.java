package oops;

class OuterClass {
    int x = 10;
  
    private class InnerClass {
      int y = 5;
    }
  }
  
  public class PrivateInnerClass {
    public static void main(String[] args) {
        // creating the object for the outer class
      OuterClass myOuter = new OuterClass();

      // creating the innerClass object
      OuterClass.InnerClass myInner = myOuter.new InnerClass();

      // using both the inner and outer class object
      System.out.println(myInner.y + myOuter.x);
    }
  }