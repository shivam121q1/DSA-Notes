public class SingleNumber2 {

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,6,6,4,4,3,3};


        System.out.println(singleNumber(nums));
    }


    
        public static int singleNumber(int[] nums) {
          int ans = 0;
          System.out.println("ans "+ans);
        
          for (int i = 0; i < 32; ++i) {
            int sum = 0;
            System.out.println(sum);
            for (final int num : nums){
                System.out.println("num "+num);
                sum += num >> i & 1;
                System.out.println("sum after shift"+sum);

                sum %= 3;
                System.out.println("sum after modulo "+sum);
                
            }
            
              
               
           
            
            ans |= sum << i;
            System.out.println(ans);
          }

          System.out.println("Final ans "+ans);
      
          return ans;
        }
    
    
}
