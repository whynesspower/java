import java.util.ArrayList; // Import the ArrayList class from the Java Collections Framework

public class MyArrayList { // Renamed class to avoid conflict with java.util.ArrayList
    private ArrayList<String> names; // Declare the ArrayList

    public MyArrayList() { // Constructor
        names = new ArrayList<>(); // Initialize the ArrayList
        names.add("A"); // Add an element to the ArrayList
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(); // Create an instance of MyArrayList
        System.out.println(list.names); // Print the names ArrayList
    }
}