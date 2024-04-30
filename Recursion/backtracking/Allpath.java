import java.lang.reflect.Array;
import java.util.Arrays;

public class Allpath {
    public static void main(String[] args) {

        boolean[][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true,}
            
        };
        int[][] path = new int[board.length][board[0].length];
       
 
        Maze("",board, 0, 0,path,1);
        
    }

    static void Maze(String s,boolean[][] maze,int r , int c,int[][] path, int step){
        // System.out.println(maze.length-1);
        if(r==maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] arr :path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;

        }

        //i am considering this block in my path

        maze[r][c] = false;
        path[r][c] = step;



        if(r < maze.length -1){

            Maze(s+'D', maze, r+1, c,path,step+1);

        }
        if(c < maze[0].length-1){
            Maze(s+'R', maze, r, c+1,path,step+1 );
        }
        if(r>0){
            Maze(s+'U', maze, r-1, c,path,step+1);

        }
        if(c>0){
            Maze(s+'L', maze, r, c-1,path,step+1);
        }

        //this line is where the function will be over
        //so before the function ges removed also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;

    }
    
}
