public class BasicThreads extends Thread {
    public static Integer count=0;
    public static void main(String[] args){
        BasicThreads thread = new BasicThreads();
        thread.start();
        System.out.println("Outside the thread");
    }
    public void run(){
        count++;
        System.out.println("Inside the thread");
    }
}