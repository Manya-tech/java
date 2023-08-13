package BasicsOfJava;

import java.util.Scanner;

public class pattern10 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int osp = n/2;
        int isp = -1;
        int st = 1;
        for (int i = 1; i<=n; i++){
            if(i<=n/2){
            for (int j=1; j<=osp; j++){
                System.out.print(" ");
            }
            if (isp!=-1){
                st = 2;
            }
            else{
                st = 1;
            }
            System.out.print("*");
            if (isp!=-1){
                for (int k=1; k<=isp; k++){
                    System.out.print(" ");
                }
            }
            if(st==2){
                System.out.print("*");
            }
            System.out.println();
            osp--;
            isp+=2;
        }
        else{
            for (int j=1; j<=osp; j++){
                System.out.print(" ");
            }
            if (isp!=-1){
                st = 2;
            }
            else{
                st = 1;
            }
            System.out.print("*");
            if (isp!=-1){
                for (int k=1; k<=isp; k++){
                    System.out.print(" ");
                }
            }
            if(st==2){
                System.out.print("*");
            }
            System.out.println();
            osp++;
            isp-=2;
        }
    }


    }
    
}
