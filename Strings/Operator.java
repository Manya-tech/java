package Strings;

import java.util.ArrayList;

public class Operator {

    public static void main(String[] args) {
        System.out.println((char)('a'+'b'));
        System.out.println('a'+'b');
        System.out.println((char)('a'+5));
        System.out.println("a"+"b");

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Manya" + new ArrayList<>());
        System.out.println("Manya" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'b');
                

    }
    
}
