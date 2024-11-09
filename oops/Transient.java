package oops;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

// Class to demonstrate serialization
class User implements Serializable {
    private static final long serialVersionUID = 1L; // A unique ID for serialization
    
    private String username;
    private transient String password; // The 'password' field is marked as transient

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters for display
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class TransientExample {
    public static void main(String[] args) {
        // Creating an instance of User
        User user = new User("john_doe", "super_secret_password");

        // Serializing the user object
        try (FileOutputStream fileOut = new FileOutputStream("user.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(user);
            System.out.println("User object has been serialized");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserializing the user object
        User deserializedUser = null;
        try (FileInputStream fileIn = new FileInputStream("user.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            deserializedUser = (User) in.readObject();
            System.out.println("User object has been deserialized");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Displaying the deserialized user object
        if (deserializedUser != null) {
            System.out.println("Username: " + deserializedUser.getUsername());
            System.out.println("Password: " + deserializedUser.getPassword()); // Will print null
        }
    }
}
