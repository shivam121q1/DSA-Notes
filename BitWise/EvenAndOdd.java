

public class EvenAndOdd {
    public static void main(String[] args) {
        int n =11;
        System.out.println(ENO(Integer.parseInt(args[0])));
        
    }
    
    static boolean ENO(int n){
        return (n & 1) == 0 ;
    }
}
