public class NUmberExample {

    public static void main(String[] args) {
        //Write a function that takes in a number and print it
        //print first 5 number

        prints(1);

    }
    static void prints(int n){
        if(n==5){
            System.out.println(5);
            return;
        } //base call
        System.out.println(n);
        //all the function call get into the stack memory
        //wile the function is not finished executing it will remain in the stack
        
        prints(n+1); //recursion calling

    }
    
}
