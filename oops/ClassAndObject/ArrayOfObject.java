package oops.ClassAndObject;


/*Here we are creating and array of Objects and instializing the value through the constructor */


class MyClass {
    int value;

    // Constructor
    public MyClass(int value) {
        this.value = value;
    }
}

public class ArrayOfObject {

    public static void main(String[] args) {
        // Creating an array of objects of class MyClass and initializing them using constructor
        MyClass[] myArray = new MyClass[]{
            new MyClass(0),
            new MyClass(1),
            new MyClass(2),
            new MyClass(3),
            new MyClass(4)
        };

        // Accessing elements of the array and their properties
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + ": " + myArray[i].value);
        }
    }

    
    
    
    
    
}
