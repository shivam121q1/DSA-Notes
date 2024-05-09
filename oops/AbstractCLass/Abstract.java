package oops.AbstractCLass;

//A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).
/*
 There are two ways to achieve abstraction in java

Abstract class (0 to 100%)
Interface (100%)

A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
 */

 // In real scenario, method is called by programmer or user
class Abstract {
    public static void main(String args[]) {
        Shape s = new Rectangle();// In a real scenario, object is provided through method, e.g., getShape()
                                // method
        s.area(4);
    }
}



abstract class Shape  {
    // abstract void draw();
    abstract void area(int data);
}

// In real scenario, implementation is provided by others i.e. unknown by end
// user
class Rectangle extends Shape {
    // void draw() {
    //     System.out.println("drawing rectangle");
    // }

    void area(int side){
        System.out.println("Area is side*side"+ side*side);
    }
}

class Circle1 extends Shape {
    // void draw() {
    //     System.out.println("drawing circle");
    // }

    void area(int radius){
        System.out.println("Area is 2*R*R"+ 3.14 *radius*radius);
    }
}


