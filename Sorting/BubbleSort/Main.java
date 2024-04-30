import java.util.Arrays;
import java.util.Scanner;


//sinking sort or exchange sory
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,6,7,8,4};
        bubblesorts(arr);

        System.out.print(Arrays.toString(arr));
        
    }

    static void bubblesorts(int[] arr ){
        boolean swapped;
        for(int i = 0;i< arr.length ; i++){
            swapped =false;
            for(int j= 1 ; j < arr.length -i ; j++){
                //swap if te item is smaller than previous one
                if(arr[j]<arr[j-1]){
                   int temp = arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]= temp;
                   swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

   
    // static void swap(int a , int b){
    //     int temp;
    //     temp = a;
    //     a=b;
    //     b=temp;

    // }

    
}