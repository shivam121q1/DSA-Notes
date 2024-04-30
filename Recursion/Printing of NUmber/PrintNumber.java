

public class PrintNumber {
public static void main(String[] args) {
    int n =5;
    // prn(n);
    revprn(n);
    
}

// static int prn(int n){
//     System.out.println(n);   //print the number 
//     if(n==1){
//         return 1;
//     }

    
//     return prn(n-1);
// }
static void revprn(int n){
    //print the number 
    if(n==0){
        return;
    }

    //base value

    
    revprn(n-1);
    System.out.println(n);
}
    
}
