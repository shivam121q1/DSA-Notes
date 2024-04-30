public class primeRange {
    public static void main(String[] args) {
        int n =37;
        boolean[] prime = new boolean[n+1];
        setprime(n, prime);
        
    }
    static void setprime(int n ,boolean[] prime){
        for (int i = 2; i*i < n; i++) {
            if(!prime[i]){
                for (int j = i*2; j <=n; j+=i) {
                    prime[j]=true;
                    
                }
            }

            
        }
        for (int i = 2; i<=n; i++) {
            if(!prime[i]){
                System.out.println(i+" ");

            }
            
        }
    }
    
}
