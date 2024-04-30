import java.util.ArrayList;

public class Ascending {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,10,10,7,8};

        // System.out.println(isAscending(arr, 0));

        finalllinearSearch(arr,10,0);
        System.out.println(list);

        
    }
    // static boolean isAscending(int[] arr,int index){
    //     //base condition!!
    //     if (index==arr.length -1){
    //         return true;
    //     }

    //     return (arr[index] < arr[index]) && isAscending(arr, index+1);

    // }

    // static int linearSearch(int[] arr ,int target, int index){

    //     if(index==arr.length){
    //         return -1;
    //     }
    //     if(arr[index]==target){
    //         return index;
    //     }else{
    //         return linearSearch(arr, target, index+1);
    //     }

    // }
    static ArrayList<Integer> list =new ArrayList<>();
    static void finalllinearSearch(int[] arr ,int target, int index){

        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }else{
             finalllinearSearch(arr, target, index+1);
        }

    }
    
}
