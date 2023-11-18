package Array;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j] =  ' ';
            }
        }
        int c=0;
        char player = 'X';
        boolean gameOver = false;
        Scanner scn = new Scanner(System.in);

        while(!gameOver){
            display(board);
            System.out.print("Player "+ player+" enter : ");
            int row = scn.nextInt();
            int col = scn.nextInt();
            if(board[row][col]==' '){
                board[row][col]=player;
                c++;
                if(c==9){
                    gameOver= true;
                }
                gameOver = hasWon(board, player, row, col);
                if(gameOver){
                    System.out.println("Player "+player+" has won");
                }else{
                    player = (player=='X')?'O':'X';
                }

            }else{
                System.out.println("Please enter another position.");
            }

        }
        c++;
        
    }

    static void display(char[][] board){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(board[i][j]+" "+"|"+" ");
            }
            System.out.println();
        }
    }

    static boolean hasWon(char[][] board, char player, int row, int col){
        //check row
        if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
            return true;
        }

        //check column
        if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
            return true;
        }

        //check diagonal
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }

        return false;
         

    }
    
}
