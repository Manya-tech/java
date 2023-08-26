package Strings;

public class ComparisonInStrings {

    public static void main(String[] args) {
        String name = "Manya";
        String nickname = "Manya";

        System.out.println(name==nickname);

        String a = new String("hello");
        String b = new String("hello");

        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
    
}
