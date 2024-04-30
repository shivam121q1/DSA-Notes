import java.util.Arrays;

public class MergeInplace {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,};
        mergeinsplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        
    }

    static void mergeinsplace(int[] arr, int start , int end){
        if((end - start) == 1){
            return;
        }
        int mid = (start+end)/2;

        mergeinsplace(arr, start, mid);
        mergeinsplace(arr, mid, end);

        mergeSorted(arr,start,mid,end);
    }
    private static void mergeSorted(int[] arr,int start,int mid,int end){
          int[] mix = new int[end-start];

        int i = start;
        int j = mid;
        int k=0;

        while (i < mid && j < end) {
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            } else{
              mix[k] = arr[j];
              j++;
            }
            k++;
            
        }
        System.out.println("value after 1 loop"+Arrays.toString(mix));
        while(i<mid){


            mix[k]= arr[i];
            System.out.println("value adding in mix in 1st remaining"+k+ "value"+mix[k]);
            System.out.println("offical"+Arrays.toString(mix));

           i++;
           k++;
        }


        while (j<end) {
            mix[k] = arr[j];
            System.out.println("value adding in mix in 2nt remaining"+mix[k]);

            j++;
            
        }

        for(int l=0;l < mix.length;l++){
            System.out.println("Mix value at " + l +"location" + mix[l]);



            arr[start+l]=mix[l];
            System.out.println(Arrays.toString(arr));
        }
    }
      
    
}
