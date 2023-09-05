package Recursion.Backtracking;

public class NQueensProblem {

    public static void main(String[] args) {

        int n=5;
        boolean[][] board  = new boolean[n][n ];
        System.out.println(queens(board,0));

        
    }

    static int queens(boolean[][] board, int r){

        if(r==board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count =0;

        for(int i=0; i<board.length; i++){
            if(isSafe(board, r, i)){
                board[r][i]=true;
                count+=queens(board,r+1);
                board[r][i]=false;
            }
        }

        return count;



    }

    static boolean isSafe(boolean[][] board, int r, int c){
        //vertically check
        for (int i=0; i<r; i++){
            if(board[i][c]){
                return false;
            }
        }

        //left diagonal check
        int maxLeft = Math.min(r,c);
        for (int i=1; i<=maxLeft;i++){
            if(board[r-i][c-i]){
                return false;
            }
        }

        //right diagonal check
        int maxRight = Math.min(r,board.length-1-c);
        for (int i=1; i<=maxRight;i++){
            if(board[r-i][c+i]){
                return false;
            }
        }

        //all good
        return true;

    }

    static void display(boolean[][] board){

        for (boolean[] row : board){
            for (boolean val : row){
                if(val){
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }

    }

    
}


