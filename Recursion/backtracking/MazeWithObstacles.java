public class MazeWithObstacles {
    public static void main(String[] args) {

        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true,}
            
        };
 
        Maze("",board, 0, 0);
        
    }

    static void Maze(String s,boolean[][] maze,int r , int c){
        System.out.println(maze.length-1);
        if(r==maze.length-1 && c == maze[0].length-1){
            System.out.println(s);
            return;
        }

        if(!maze[r][c]){
            return;

        }



        if(r < maze.length -1){

            Maze(s+'D', maze, r+1, c);

        }
        if(c < maze[0].length-1){
            Maze(s+'R', maze, r, c+1 );
        }

    }
    
}
