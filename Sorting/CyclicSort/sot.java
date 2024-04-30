import java.util.Arrays;

public class sot{
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,3,2,1,4};

        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void insertionsort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct =  arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i,correct);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}