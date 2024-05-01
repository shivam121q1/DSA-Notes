package oops.ClassAndObject;

/*In Java, a constructor is a block of codes similar to the method. 
It is called when an instance of the class is created.
 At the time of calling constructor, memory for the object is allocated in the memory. */

/*It calls a default constructor if there is no constructor available in the class. 
 In such case, Java compiler provides a default constructor by default. */

 /* 
There are two types of constructors in Java:

1.Default constructor (no-arg constructor)
2.Parameterized constructor
 */

//  A constructor is called "Default Constructor" when it doesn't have any parameter.

//Java Program to create and call a default constructor  
class Bike1{  
    //creating a default constructor  
    Bike1(){System.out.println("Bike is created");}  
    //main method  
    public static void main(String args[]){  
    //calling a default constructor  
    Bike1 b=new Bike1();  
    }  
}  

/*A constructor which has a specific number of parameters is called a parameterized constructor. */
//Java Program to demonstrate the use of the parameterized constructor.  
class Student4{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student4(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);} 
    
}   

/*
 Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.
 */

 class Student5{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Student5(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Student5(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  

}



public class Constructor {

    public static void main(String args[]){  
        //creating objects and passing values  
        Student4 s1 = new Student4(111,"Karan");  
        Student4 s2 = new Student4(222,"Aryan");  
        //calling method to display the values of object  
        s1.display();  
        s2.display();  
       }  

}
