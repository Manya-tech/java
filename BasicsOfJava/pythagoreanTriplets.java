package BasicsOfJava;

import java.util.Scanner;

public class pythagoreanTriplets {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (a*a+b*b==c*c){
            System.out.println("true");
        } else if (a*a==b*b+c*c){
            System.out.println("true");
        }else if (a*a+c*c==b*b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}
