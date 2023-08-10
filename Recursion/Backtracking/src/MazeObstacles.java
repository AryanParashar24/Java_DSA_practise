import java.util.ArrayList;
import java.util.Arrays;

public class MazeObstacles {

    public static void main(String[] args) {

        boolean[][] board = {
            {true, true, true},
            {true, true,false},
            {true, true, true},

        };
        boolean[][] board2 = {
                {true, true, true},
                {true, true,true},
                {true, true, true}

        };
//        pathrestriction("", board, 0, 0);
        ArrayList<String> ans = ObstacleMaze("", board, 0, 0);
        System.out.println(ans);

//        AllDirections("", board2, 0, 0);

        int[][] path = new int[board.length][board[0].length];
        AllPathPrint("", board2, 0, 0, path, 1);
    }

    static void pathrestriction(String p, boolean[][] maze, int r, int c){
        if(r==maze.length -1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        if(c < maze.length-1){
            pathrestriction(p + "R", maze, r, c+1);
        }
        if(r < maze[0].length-1){
            pathrestriction(p + "D", maze, r+1, c);
        }
        if(c < maze.length-1 && r < maze[0].length-1){
            pathrestriction(p + "C", maze, r+1, c+1);
        }
    }


    static ArrayList<String> ObstacleMaze(String p, boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            //here the list.add is included in the list so as to build a list in whihc all the local lsist been made in the code are added in the main or the external list
            list.add(p);
            return list;
        }

        if(!maze[r][c]){
            return new ArrayList<>();
        }
        //To build a local list for each pattern formed in the codebase
        ArrayList<String> list = new ArrayList<>();

        if (c < maze.length-1){
            list.addAll(ObstacleMaze(p + "R", maze, r, c+1));
        }
        if (r < maze[0].length-1){
            list.addAll(ObstacleMaze(p + "D", maze,r+1, c));
        }
        if (r < maze.length-1 && c < maze[0].length-1){
            list.addAll(ObstacleMaze(p + "C", maze,r+1,c+1 ));
        }

        return list;
    }
    static void AllDirections(String p, boolean[][] maze, int r, int c){
        if(r==maze.length -1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        //thsi sis the place where i declared the paths that were called as fasle so that the paths didn't get called again
        // whihc might result in StackOverflow
        maze[r][c] = false;

        if(c < maze.length-1){
            AllDirections(p + "R", maze, r, c+1);
        }
        if(r < maze[0].length-1){
            AllDirections(p + "D", maze, r+1, c);
        }
        if(r > 0 && c < maze.length){
            AllDirections(p + "U", maze, r-1, c);
        }
        if(c >0 && r < maze[0].length -1){
            AllDirections(p + "L", maze, r, c-1);
        }

        //THis is the place where the function gets out of the recursion calls
        //So make sure to call the changes made by the recursion call before it gets out or returned
        maze[r][c] = true;
    }

    static void AllPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r==maze.length -1 && c==maze[0].length-1){
            path[r][c] = step;
            for (int arr[] : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }

        //thsi sis the place where i declared the paths that were called as fasle so that the paths didn't get called again
        // whihc might result in StackOverflow
        maze[r][c] = false;
        path[r][c] = step;

        if(c < maze.length-1){
            AllPathPrint(p + "R", maze, r, c+1, path, step+1);
        }
        if(r < maze[0].length-1){
            AllPathPrint(p + "D", maze, r+1, c, path, step+1);
        }
        if(r > 0 && c < maze.length){
            AllPathPrint(p + "U", maze, r-1, c, path, step+1);
        }
        if(c >0 && r < maze[0].length -1){
            AllPathPrint(p + "L", maze, r, c-1, path, step+1);
        }

        //THis is the place where the function gets out of the recursion calls
        //So make sure to call the changes made by the recursion call before it gets out or returned
        maze[r][c] = true;
        path[r][c] = 0;

    }
}
