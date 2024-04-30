import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,5,7,8,4};

        sort(arr);

        System.out.println(Arrays.toString(arr));
        
    }
    static void sort(int[] arr){
        //timecomplexity is 0(n2)
        //stable =  not
        //it performs well in small list/arrays
        for(int i = 0 ; i<arr.length; i++){
            //find the maximum item in the remaining array ans wap it with correct index
            int last = arr.length -1-i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }
    }

    private static int getMaxIndex(int[] arr, int start,int last){
        int max = start;
        for(int i = start;i<=last;i++){
            if(arr[max] < arr[i]){
                max=i;
            }
        }
        return max;

    }
    static void swap(int[] arr, int first ,int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
    
}
