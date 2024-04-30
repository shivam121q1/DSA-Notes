

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr =  {5,8,7,4,3,2,9,1};

    System.out.println("The element is present at index " + BS(arr, 9));
        
    }
    static int BS(int arr[], int target){
        int start =0 ;
        int  end =arr.length-1;
        

        while(end > start){
            int mid = start + (end -start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end =mid -1;
            }else if(target > arr[mid]){
                start = mid +1 ;
            }
            }

            return -1;
        }
    }

