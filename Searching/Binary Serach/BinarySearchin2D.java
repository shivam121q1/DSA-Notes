import java.util.Arrays;

public class BinarySearchin2D {

    public static void main(String[] args) {
        int[][] arr= {
            {1,3,5},
            {6,7,8},
            {9,10,15}
        };

        System.out.println(arr.length);

       System.out.println( Arrays.toString(BS2D(arr, 15)));
        
    }

    static int[] BS2D(int[][] arr , int target){
        int r = 0;
        int c = arr.length -1;

        while(r <arr.length && c >=0){

            if (target == arr[r][c]){
                return new int[] {r,c};
                
            }
            else if(target <arr[r][c]){
                c--;

            }
            else{
                r++;
            }

        }
        return new int[]{-1,-1};
    }
    
}
