

public class sumofDigit {
    public static void main(String[] args) {
        int num =12345;
  
    System.out.println(rev2(num));
    }
    // static int SOD(int n){
    //     if(n==0){
    //         return 0;
    //     }
        
    //     int rem = n%10;
    //     return rem + SOD(n/10);
      
    // }
    // static int sum =0 ;
    // static void reverse(int n){
    //     if(n==0){
    //         return;
    //     }
        
    //     int rem = n%10;
    //     sum= sum*10+rem;
    //     reverse(n/10);
        
      
    // }

    static int rev2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    private static int  helper(int n , int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;

        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }
    
}
