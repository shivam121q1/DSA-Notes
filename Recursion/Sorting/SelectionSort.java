import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,3,5,6,2,1,7,8};
        Sortin(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Sortin(int[] arr,int r,int c,int maxElement){
        if(r==0){
            return;
        }
        if(c<r){
           if(arr[c] >arr[maxElement]){
            Sortin(arr, r, c+1, c);

           } else{
            Sortin(arr, r, c+1, maxElement);
           }

        } else{
            int temp = arr[maxElement];
            arr[maxElement] = arr[r-1];
            arr[r-1]= temp;
            Sortin(arr, r-1, 0, 0);
        }

    }
    
}
