package oops;

public class Encapsulation{

/**
Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable
*/

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
}

