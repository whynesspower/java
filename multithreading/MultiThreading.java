/**
 * This class lights the problem with concurency, when one variable is accessed by multiple threads at once. 
 */

public class MultiThreading extends Thread {
    public static int amount = 0;
  
    public static void main(String[] args) {
        MultiThreading thread = new MultiThreading();
      thread.start();
      // Wait for the thread to finish
      while(thread.isAlive()) {
        System.out.println("Waiting...");
      }
      // Update amount and print its value
      System.out.println("MultiThreading: " + amount);
      amount++;
      System.out.println("MultiThreading: " + amount);
    }
    public void run() {
      amount++;
      System.out.println("Running inside the thread");
    }
  }