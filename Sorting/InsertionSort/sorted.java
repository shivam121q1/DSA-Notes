import java.util.Arrays;

/**
 * sorted
 */
public class sorted {
    public static void main(String[] args) {

        //first sort till index 1
        // then sort till index 2
        // then sort till index last

        //for every index 
        //put that index element at the correct index of LHS

        int [] arr = {1,4,5,6,7,-1,0};
        insert(arr);
        System.out.println(Arrays.toString(arr));
        
    }


    //when element j is not smaller than previous element j -1 break , because the left side array it already sorted 

    static void insert(int[] arr){

        //time complexity is 
        // worst case = 0(n2)
        //best case 
        //aray is already sorted it is the best case (N-1) so best is 0(N)
        for(int i = 0; i<arr.length -1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]= temp;
                }else{
                    break;
                    
                }
            }
        }
    }

    //why use it 
    //adaptibe : steps get reduced if array is sorted
    //no of setps get as comopared to bubble sort
    //stable
    //used for smaller values of n 
    // array is partially sorted

    // That's why it takes parts in hybird sorting alogritims

    
}