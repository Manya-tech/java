package Recursion.MazeProblems;

import java.util.ArrayList;

public class PrintPath {
    public static void main(String[] args) {
        path("",3,3);
        // System.out.println(pathlist("",3,3));
    }

    static  void path(String p, int r, int c){
    //     if(r==1){
    //         while(c!=1){
    //             p = p+"r";
    //             c--;
    //         }
    //         System.out.println(p);
    //         return ;
    //     }else if(c==1){
    //         while(r!=1){
    //             p=p+"d";
    //             r--;
    //         }
    //         System.out.println(p);
    //         return ;
    //     }

    //     path(p+"d",r-1,c);
    //     path(p+"r",r,c-1);

    // }

    if(r==1 && c==1){
        System.out.println(p);
        return ;
    }

    if(r>1){
        path(p+"d",r-1,c);
    }
    if(r>1 && c>1){
        path(p+"diag",r-1,c-1);
    }
    if(c>1){
        path(p+"r",r,c-1);
    }

    }
    

    static ArrayList<String> pathlist(String p, int r, int c){
        if(r==1 && c==1){
        ArrayList<String> l = new ArrayList<>();
        l.add(p);
        return l;
    }
        ArrayList<String> l = new ArrayList<>();
        if(r>1){
            l.addAll(pathlist(p+"d",r-1,c));
        }

        if(r>1 && c>1){
            l.addAll(pathlist(p+"diag",r-1,c-1));
        }

        if(c>1){
            l.addAll(pathlist(p+"r",r,c-1));
        }

        return l;
    }
}
