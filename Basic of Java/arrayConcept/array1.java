
/**
 * array1
 */
public class array1 {
    public static void main(String[] args) {
        // syntax for defining array is given below
        // datatype[] variable_name = new datatype[size];
        //int[] rollno = new int[5];
        //or directly
        // int[] rollno2 = {1,2,3,4,5};
       // if it is an integer array it will take only that integer data
       //i.e it will take data of only that datatype

       int[] ros; //declaration of array ros is getting defined in the stack
       ros = new int[6]; // initialisation acutally here object is created in the memory heap

       System.out.println(ros[1]);

       //1. array object are in heap

       //2.heap objects are not continuous

       //3. Dynamic Memory Allocation

        //may not be Continous --> it depends on JVM

        //new is used to create an object
        
    }

    
}