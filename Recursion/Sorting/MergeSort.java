import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr ={2,4,5,6,7,8,1,0,10};

        int[] ans =sort(arr);
        System.out.println(Arrays.toString(ans)); 
    }

    static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);

    }
    private static int[] merge(int[] first , int[] second){
        int[] mix = new int[first.length + second.length];
        int i =0;
        int j=0;
        int k=0;
        while(i<first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            System.out.println("value of k"+ k+"value in array"+mix[k]);
            k++;
            
        }
        System.out.println("Value of k "+ k);

        //it may be possible that one of the araays is not complete

        while(i<first.length){
            mix[k]=first[i];
            System.out.println(mix[k]);

            i++;
            k++;
        }

        while (j<second.length) {
            
            mix[k]=second[j];
            System.out.println(mix[k]);
            k++;
            j++;
            
        }

        System.out.println("value after merge"+Arrays.toString( mix));

        return mix;

    }
    
}
