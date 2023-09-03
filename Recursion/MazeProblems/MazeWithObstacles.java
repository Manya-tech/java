package Recursion.MazeProblems;

public class MazeWithObstacles {

    public static void main(String[] args) {

        boolean[][] arr = new boolean[3][3];
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = true;
            }
        }

        arr[0][2]=false;


        pathWithOb(arr,"",0,0);
            // System.out.println(pathlist("",3,3));
     
        
    }

    static void pathWithOb(boolean[][] arr, String p, int r, int c){

        if(r==2 && c==2){
            System.out.println(p);
            return ;
        }
        if(arr[r][c]==false){
            return ;
        }

        if(r<arr.length-1){

            pathWithOb(arr, p+"d", r+1, c);
        }

        if(c<arr[0].length-1){
            pathWithOb(arr, p+"r", r, c+1);
        }
        


    }


    
}
