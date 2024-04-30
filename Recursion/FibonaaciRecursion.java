public class FibonaaciRecursion {

    public static void main(String[] args) {
        System.out.println((Fibonaaci(4)));
        
    }

    static int Fibonaaci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
       return Fibonaaci(n-1) + Fibonaaci(n-2);
        
    }


    //fib(n) = fib(n-1)+fib(n-2);
    // This formula is called recurrence relation


    //Note How to understand & approach a problem 

    //VVVI

    // identifying if you can break down problem into smaller problems
    // write the recurssion  relation of needed
    // Draw the recursion tree
    //   see repeated work in above steps, try to minim
    //about the tree

    //See the flow of function how they are getting in stacks

    //Draw the tree and Pointer again and again using pen and paper
    //and then start writing code


    // see the values are returned at each steps


    
}
