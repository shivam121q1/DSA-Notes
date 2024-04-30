public class findapowb {

    public static void main(String[] args) {
        int base=10;
        int power=3;
        
        int ans =1;
        while(power>0){
            if((power&1)==1){
                ans=ans*base;
            }
            
            base*=base;
            power>>=1;


        }

        System.out.println(ans);
    }
    
}
