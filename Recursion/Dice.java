package Recursion;

import java.util.ArrayList;

public class Dice {

    public static void main(String[] args) {

        System.out.println(diceret("",4));
        diceret("",4);
        
    }

    static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return ;
        }

        for (int i=1 ; i<=6 && i<=target; i++){
            dice(p+i,target-i);
        }
    }

    static ArrayList<String> diceret(String p, int target){
        if(target==0){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        ArrayList<String> l = new ArrayList<>();
        for (int i=1 ; i<=6 && i<=target; i++){
            l.addAll(diceret(p+i,target-i));
        }

        return l;
    }

    static void diceface(String p, int target, int face){
        if(target==0){
            System.out.println(p);
            return ;
        }

        for (int i=1 ; i<=face && i<=target; i++){
            diceface(p+i,target-i, face);
        }
    }
    
}
