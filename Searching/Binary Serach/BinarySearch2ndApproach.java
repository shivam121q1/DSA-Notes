import java.util.Arrays;

public class BinarySearch2ndApproach {
    public static void main(String[] args) {
        int[][] arr= {
            {1,3,5},
            {6,7,8},
            {9,10,15}
        };

        System.out.println(arr.length);

       System.out.println( Arrays.toString(searchMatrix(arr, 15)));
    
        
    }

    static int[] binarySearch(int[][] arr , int row , int cStart , int cEnd , int target){
        while (cStart <= cEnd) {

            int mid = cStart + (cEnd - cStart)/2 ;

            if (arr[row][mid] ==  target) {

                return new int[]{row, mid};
                
            }
            else if(arr[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid-1;
            }
            
        }
        return new  int[]{-1,-1};
    }
    public static int[] searchMatrix(int[][]arr, int target){
        int row = arr.length;
        int col = arr[0].length ;
        int sCol = col -1;

        if(row == 1){
           return binarySearch(arr, 0, 0, col-1, target);   //if only one row then we can directly call the binary function
        }
        //run the loop till the 2 rows are remaining

        int rStart =0;
        int rEnd = row-1;
        
        int cMid = (col-1)/2;
        while (rStart < (rEnd -1)) { 

            int rMid = rStart + (rEnd  - rStart)/2;

            if(arr[rMid][cMid]==target){
                return new int[] {rMid,cMid};;
            }
            if (arr[rMid][cMid] < target) {
                rStart = rMid;
                
            }else{
                rEnd = rMid;
            }

            
        }
        System.out.println(rEnd);
        if(col==2 && cMid == 0){

        if(arr[rStart][cMid+1]== target){
            return new int[] {rStart,cMid+1};
        }else if(arr[rStart+1][cMid]==target){
            return new int[] {rStart+1,cMid};;
        }else{
            return new int[] {-1,-1};
        }
        }else if(cMid == 0){
           
        if (arr[rStart][cMid]== target) {
            return new int[] {rStart,cMid};
            
        }else if(arr[rStart+1][cMid]==target){
            return new int[] {rStart+1,cMid};

        }else{
            return new int[] {-1,-1};
        }
        
        }
        

        //now we have two rows
        //check whether the target is mid ;
        if (arr[rStart][cMid]== target) {
            return new int[] {rStart,cMid};;
            
        }
        if(arr[rStart+1][cMid]==target){
            return new int[] {rStart+1,cMid};;

        }

        
        System.out.println(arr[rStart][cMid+1]);
        //now check in first part 
        if (target<=arr[rStart][cMid-1]) {
            System.out.println(binarySearch(arr, rStart, 0, cMid-1, target));

            return binarySearch(arr, rStart, 0, cMid-1, target);
            
        }
       
        
        if (target >= arr[rStart][cMid+1] && target <= arr[rStart][col-1]) {
            System.out.println(binarySearch(arr, rStart, cMid+1, col-1, target));
            return binarySearch(arr, rStart, cMid+1, col-1, target);
            
        }if (target <=arr[rStart+1][cMid-1]) {
            System.out.println(binarySearch(arr, rStart+1, 0, cMid-1, target));
            return binarySearch(arr, rStart+1,0 ,cMid-1, target);
            
        }else{
            System.out.println(binarySearch(arr, rStart+1, cMid+1, col-1, target));
            return binarySearch(arr, rStart+1, cMid+1, col-1, target);
        }
        
            
        

        //check in 2nd part

        //check in 3rd part 

        //check in 4th part
    }

    
}
