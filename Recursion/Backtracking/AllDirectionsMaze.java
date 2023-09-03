package Recursion.Backtracking;

public class AllDirectionsMaze {

    public static void main(String[] args) {
        boolean[][] arr = new boolean[3][3];
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = true;
            }
        }
        allPath(arr,"",0,0);
    }

    static void allPath(boolean[][] arr,String p, int r, int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(p);
            return ;
        }

        if(!arr[r][c]){
            return ;
        }

        arr[r][c]=false;

        if(r<arr.length-1){
            allPath(arr, p+"d", r+1, c);
        }

        if(c<arr[0].length-1){
            allPath(arr, p+"r", r, c+1);
        }

        if(r>0){
            allPath(arr, p+"u", r-1, c);
        }

        if(c>0){
            allPath(arr, p+"l", r, c-1);
        }

        arr[r][c]=true;
    }
    
}
