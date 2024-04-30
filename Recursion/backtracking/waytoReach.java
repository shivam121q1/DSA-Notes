public class waytoReach {
    public static void main(String[] args) {
        int r =3;
        int c =3;

        // System.out.println(printWays(r, c));
        printpath("", r, c);
        
    }

    static int printWays(int r , int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = printWays(r-1, c);
        int right = printWays(r, c-1);

        return left + right;
    }

    static void printpath(String p,int r , int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printpath(p+'D', r-1, c);

        }
        if(c>1){
            printpath(p+'R', r, c-1);
        }

}
}