public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 2,4,5,2,5,3,4,6,3};

        System.out.println(unique(arr));
    }

    static int unique(int[] arr){
        int u = 0 ;
        for(int n : arr){
            u^=n; // XOR operation to find the unique
        }
        return u;
    }
    
}
