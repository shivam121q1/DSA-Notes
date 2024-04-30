import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

        int[] arr = {5,6,2,7,8,3,10};
        int target;
        Scanner scn = new Scanner(System.in);
    



            
     
        
        

        int ans = search(arr,8);
        System.out.println("Answer is " + ans);
        
    }
    //search element in the array return the place of the element
    //if not found return -1
    static int search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i= 0 ;i < arr.length ;i++){
            if(target== arr[i]){
                return i;
            }
        }
        return -1;
    }

}