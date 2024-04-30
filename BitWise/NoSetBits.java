public class NoSetBits {
    public static void main(String[] args) {
        int n = 10;
        int ans=0;
        while(n>0){
            if((n&1)==1){
                ans++;
            }
            n>>=1;
        }
        System.out.println(ans);
    }
    
}
