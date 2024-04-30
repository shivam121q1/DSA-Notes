import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={8,4,3,2,1,5,6,7};
        BubblSo(arr, arr.length-1, 0);
        System.out.println("The sorted Array "+ Arrays.toString(arr));
        
    }

    static void BubblSo(int[] arr,int r,int c){
        if (r==0) {
            return;
            
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                //swap
                int temp =arr[c];
                arr[c] = arr[c+1];
                arr[c+1]=temp;

            }
            BubblSo(arr,r,c+1);

        }
      else{
        BubblSo(arr,r-1,0);
      }

    }

    
}
