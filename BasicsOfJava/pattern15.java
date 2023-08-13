package BasicsOfJava;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int sp = n/2;
        int st = 1;

        for (int i=1; i<=n; i++){
            int ti;
            if(i<=n/2){
                ti=i;
                for (int j=1; j<=sp; j++){
                    System.out.print(" ");}
                for (int k=1; k<=st; k++){
                    System.out.print(ti);
                    if (k<=st/2){ ti++;}else{ti--;}
                }
                sp--;
                st+=2;
            }
            else{
                ti = n-i+1;
                for (int j=1; j<=sp; j++){
                System.out.print(" ");}
                for (int k=1; k<=st; k++){
                    System.out.print(ti);
                    if (k<=st/2){ ti++;
                }else{ti--;}
                }
                sp++;
                st-=2;
                }
                 System.out.println();
            }
           
        }

    
    
    }

