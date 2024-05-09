package oops.StaticAndThiss;

//The static keyword in Java is used for memory management mainly.

/*
The static can be:

Variable (also known as a class variable)
Method (also known as a class method)
Block
Nested class
 */

public class Statics {

/*
The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.

*/    

// class Student{  
//     int rollno;  
//     String name;  
//     String college="ITS";  
// }  

/*
 Suppose there are 500 students in my college, now all instance data members will get memory each time when the object is created. All students have its unique rollno and name, so instance data member is good in such case. Here, "college" refers to the common property of all objects. If we make it static, this field will get the memory only once.
 */

 public static void main(String args[]){  
    Student s1 = new Student(111,"Karan");  
    Student s2 = new Student(222,"Aryan");  
    //we can change the college of all objects by the single line of code  
    //Student.college="BBDIT";  
    s1.display();  
    s2.display();  
    }  


    
}

//Java Program to demonstrate the use of static variable  
class Student{  
    int rollno;//instance variable  
    String name;  
    static String college ="ITS";//static variable  
    //constructor  
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display the values  
    void display (){System.out.println(rollno+" "+name+" "+college);}  
 }  


//  If you apply static keyword with any method, it is known as static method.

// A static method belongs to the class rather than the object of a class.
// A static method can be invoked without the need for creating an instance of a class.
// A static method can access static data member and can change the value of it.