package oops.ClassAndObject;

// Object-Oriented Programming is a paradigm that provides many concepts, such
// as inheritance, data binding, polymorphism, etc.

// Any entity that has state and behavior is known as an object.

// An Object can be defined as an instance of a class. An object contains an
// address and takes up some space in memory.

// Object-based programming language follows all the features of OOPs except
// Inheritance. JavaScript and VBScript are examples of object-based programming
// languages.

// An object has three characteristics:

// State: represents the data (value) of an object.
// Behavior: represents the behavior (functionality) of an object such as
// deposit, withdraw, etc.
// Identity: An object identity is typically implemented via a unique ID. The
// value of the ID is not visible to the external user. However, it is used
// internally by the JVM to identify each object uniquely.

// Definition Of Instance Variable
/*
 * A variable which is created inside the class but outside the method is known
 * as an instance variable. Instance variable doesn't get memory at compile
 * time. It gets memory at runtime when an object or instance is created. That
 * is why it is known as an instance variable.
 * 
 */

public class MainClassAndObject {

    // creating main method inside the MainClassAndObject class
    public static void main(String args[]) {
        // Creating an object or instance
        Student s1 = new Student();// creating an object of Student
        // Printing values of the object
        System.out.println(s1.id);// accessing member through reference variable
        System.out.println(s1.name);

        /* ReferenceVariable */

        s1.id = 101;
        s1.name = "Sonoo";
        System.out.println(s1.id + " " + s1.name);// printing members with a white space

        /* By Invoking Method */

        // we can Create multiple Object of a Class
        Student s2 = new Student();

        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");

        /*By Constructor Method */

    }


}
// Java Program to illustrate how to define a class and fields
// Defining a Student class.
class Student {
    // defining fields
    int id;
    int rollno; 
    // field or data member or instance variable
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}

// There are 3 ways to initialize object in Java.
/*
 * By reference variable
 * By method
 * By constructor
 */

// By reference Variable

/*
 * Initializing an object means storing data into the object. Let's see a simple
 * example where we are going to initialize the object through a reference
 * variable.
 * Example refer to Line 42 to 46
 */

/*
 * 2.In this example, we are creating the two objects of Student class and
 * initializing the value to these objects by invoking the insertRecord method.
 * Here, we are displaying the state (data) of the objects by invoking the
 * displayInformation() method.
 * Line no 70 to 77 && 52 to 55
 */

/* 3: Initialization through a constructor */
