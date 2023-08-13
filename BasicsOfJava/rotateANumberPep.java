package BasicsOfJava;

import java.util.Scanner;

public class rotateANumberPep {

    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.print("enter n ");
        int n = scn.nextInt();

        int temp = n;
        int nod = 0;
        while(temp!=0){
            nod++;
            temp = temp/10;
        }

        int c = 1;
        while(c==1){
            System.out.print("GO on? ");
            c = scn.nextInt();
            System.out.print("enter k ");
            int k = scn.nextInt(); 
        k = k%nod;
        if (k<0){
            k = nod+k;
        }

        int div = 1;
        int mul = 1;
        for (int i=0; i<nod; i++){
            if (i<k){
                div*=10;
            }
            else{
                mul*=10;
            }
        }

        int q = n/div;
        int r = n%div;
        r = r*mul+q;
        System.out.println(r);   }     


}
}

