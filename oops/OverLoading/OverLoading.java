package oops.OverLoading;


//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

//Method overloading increases the readability of the program.

/*
There are two ways to overload the method in java

By changing number of arguments
By changing the data type
 */
class Adder{  
    static int add(int a,int b){return a+b;}  
    static int add(int a,int b,int c){return a+b+c;}  
    }  

public class OverLoading {

        public static void main(String[] args){  
            System.out.println(Adder.add(11,11));  
            System.out.println(Adder.add(11,11,11));  
            }

    
}

//In java, method overloading is not possible by changing the return type of the method only because of ambiguity.
