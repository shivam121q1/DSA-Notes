public class Nquee {
    
    public static void main(String[] args) {

        int n=4;

        boolean[][] board = new boolean[n][n];

        System.out.println(Nqueen(board, 0));
        
    }

    static int Nqueen(boolean[][] board , int r){
        if(r == board.length){
            display(board);
            System.out.println();
         return 1;
        }
        int count =0;

        //placing the Queen and checking for every row and col
        for(int col = 0; col < board.length ; col++){

            //place the queen if it is saFE
            if(isSafe(board,r,col)){
                board[r][col] =true;
                count += Nqueen(board, r+1);
                board[r][col] =false;
            }

        }

        return count;

    }

    private static void display (boolean[][] board) {

        for(boolean[] row :board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                } else{
                    System.out.print("X ");
                }
                
            }
            System.out.println();
            
            
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
      
        for(int i = 0 ; i< row; i++){
            if(board[i][col]){
                 return false;
            }

        }
        //CHECK DIAGONal left 

        int maxLeft = Math.min(row, col);

        for(int i = 1 ; i<=maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int maxRight = Math.min(row, board.length-col-1);

        for(int i = 1 ; i<=maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;

    }
}



        
    

