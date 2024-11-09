package oops;

class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
      System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute

    public void displayDetails() {
        // Call the honk() method (from the Vehicle class)
        honk();
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(brand + " " + modelName);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car carObj = new Car();
        carObj.displayDetails();
    }
}