package Recursion.Backtracking;

public class SudokuSolver {

    public static void main(String[] args) {

        int[][] board = new int[][]{
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
    };

        // if (solve(board)) {
        //     display(board);
        // } else {
        //     System.out.println("Cannot solve");
        // }
        
    }

    static boolean solve(int[][] board){

        int n = board.length;
        int r=-1;
        int c=-1;

        boolean emptyLeft = true;
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==0){
                    r=i;
                    c=j;
                    emptyLeft=false;
                    break;
                }
            }

            if(!emptyLeft){
                break;
            }
        }

        if(emptyLeft){
            return true;
        }

        for (int num=1; num<10; num++){
            if(isSafe(board,r,c,num)){
                board[r][c]=num;
                if(solve(board)){
                    return true;
                }else{
                    board[r][c]=0;
                }
            }

        }

        return false;

    }

    static void display(int[][] board){
        for (int[] row : board){
            for (int val : row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int r, int c, int num){
        //row
        for(int i=0; i<board.length; i++){
            if(board[r][i]==num){
                return false;
            }
        }

        //column
        for(int i=0; i<board.length; i++){
            if(board[i][c]==num){
                return false;
            }
        }
        int sqr = (int)Math.sqrt(board.length);
        int rowStart = r - r%sqr;
        int colStart = c - c%sqr;

        for(int row=rowStart; row<rowStart+sqr; row++){
            for(int col=colStart; col<colStart+sqr; col++){
                if(board[row][col]==num){
                    return false;
                }
            }
        }

        return true;

        
    }

    
}
