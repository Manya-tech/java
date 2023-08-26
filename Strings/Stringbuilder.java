package Strings;

public class Stringbuilder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        builder.reverse();
        builder.deleteCharAt(25);
        builder.insert(0,"b");
        builder.lastIndexOf("b");

        System.out.println(builder);
        System.out.println(builder.lastIndexOf("b"));

        String str = "";

        for (int i=0; i<26; i++){
            char ch = (char)('a'+i);
            str+=ch;

        }

        System.out.println(str);
        
    }
    
}
