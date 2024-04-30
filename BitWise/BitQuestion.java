

public class BitQuestion {
    public static void main(String[] args) {
        int n = 50;
        int bitno =5;
        System.out.println(n+" "+bitno);
    }

    static int findIthBit(int n,int bitno){
        
        return n & (1<< (n-1));
    }
    
}
