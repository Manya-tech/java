package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        System.out.println(a);
        a.get(5);
        System.out.println(a.get(5));
        System.out.println(a.contains(5));
        System.out.println(a.set(5,99));
         System.out.println(a);
         a.remove(5);
         System.out.println(a);

         for (int i=0; i<5; i++){
            a.add(scn.nextInt());
         }
         System.out.println(a);
         for (int i=0; i<5; i++){
            System.out.println(a.get(i));
         }
    }
    
}
