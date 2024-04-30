public class NoOfDigits {
    public static void main(String[] args) {
        int num =124567;
        int b =2;

        int ans = (int)(Math.log(num)/Math.log(b))+1;
        System.out.println("Number of digits "+ ans);

    }
    
}
