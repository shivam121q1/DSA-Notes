package oops.OverRidding;

//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

//Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
//Method overriding is used for runtime polymorphism


//Java Program to demonstrate why we need method overriding  
//Here, we are calling the method of parent class with child  
//class object.  
//Creating a parent class  
class Vehicle{  
    void run(){System.out.println("Vehicle is running");}  
  }  

  class OverRidding extends Vehicle{  
       
    @Override
    void run(){System.out.println("OverRidding is running safely");}  
    public static void main(String args[]){  
    //creating an instance of child class  
     OverRidding obj  =  new OverRidding(); 
    //calling the method with child class instance  
    obj.run();  
    }  
  }  
