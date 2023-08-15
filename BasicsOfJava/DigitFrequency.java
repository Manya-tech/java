package BasicsOfJava;

import java.util.Scanner;

public class DigitFrequency {

    public static int df(int n, int d){
        int count = 0;
        while (n!=0){
            int r = n%10;
            n=n/10;
            if (r==d){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int dig = scn.nextInt();
        int c = df(num,dig);
        System.out.println(c);


    }
    
}
