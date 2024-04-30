import javax.swing.plaf.nimbus.State;

public class BinarySearchRecursion {

    public static void main(String[] args) {

        int[] arr = { 1,2,4,6,7,9,10};

        System.out.println(search(arr, 7, 0, arr.length));
        
    }

    static int search(int[] arr , int target ,int s , int e){

        if(s>e){
            return -1; // Element is not present in array

        }
        int m = s + (e-s) / 2; // Finding the mid of the array

        if(arr[m] ==  target){
            return m;

        }
        if(target < arr[m]){
            return search(arr, target, s, m-1); // Recursive call on the left side of mid

        }

        return search(arr, target, m+1, e);// Recursive call on the right side of mid


        

    }
    
}
