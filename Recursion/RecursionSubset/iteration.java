import java.util.ArrayList;
import java.util.List;

public class iteration{
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        // Subsequence(" ", "abc");
        List<List<Integer>> ans = Subset(arr);

        for(List<Integer> list : ans){
            System.out.println(list);
        }
        
        
    }
    static  List<List<Integer>> Subset(int[] ans){

        List<List<Integer>> outer = new ArrayList<>();
         outer.add(new ArrayList<>());
         for (int nums : ans){
            int size = outer.size();
            for(int i = 0; i< size ; i ++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);


            }

         }

         return outer;

      
    }
    
    
}
