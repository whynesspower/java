import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The behavior of the compare method:
 * 
 */

class Car{
    public String name;
    public Integer year;
    Car(String name, Integer year){
        this.name= name;
        this.year= year;
    }
}

class sortByYear implements Comparator{
    public int compare(Object car1, Object car2){
        Car a = (Car) car1;
        Car b = (Car) car2;
        if(a.year < b.year){
            return -1;
            // Returns -1: This indicates that the first object (obj1) should be placed before the second object (obj2) in the sorted order.
        }
        else if(a.year > b.year){
            return 1;
            // Returns 1: This indicates that the first object (obj1) should be placed after the second object (obj2) in the sorted order.
        }
        else return 0;
        // Returns 0: This indicates that both objects are considered equal in terms of ordering, so their order relative to each other doesn't change.
    }
}

public class CustomSort {
    public static void main(String[] args){
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Mustang", 1940));
        cars.add(new Car("Farari", 1980));
        Comparator myComparator = new sortByYear();

        Collections.sort(cars, myComparator);

        for(Car c: cars){
            System.out.println("name of the car: " + c.name + "Year: " +c.year);
        }
    }
    
}



/**
 * 
 * Using lambda this code could have been
 
 Collections.sort(myCars, (obj1, obj2) -> {
  Car a = (Car) obj1;
  Car b = (Car) obj2;
  if (a.year < b.year) return -1;
  if (a.year > b.year) return 1;
  return 0;
});

 */