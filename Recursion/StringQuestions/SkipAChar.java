package Recursion.StringQuestions;

public class SkipAChar {
    public static void main(String[] args) {

        System.out.println(skipApple("bapplebappleapp"));
        
    }

//     static String skipChar(String str){
   
//         if(str.isEmpty()){
//             return "";
//         }

//         char ch = str.charAt(0);
//         if(ch=='a'){
//             return skipChar(str.substring(1));
//         }

//         return ch + skipChar(str.substring(1));

        

//     }

//     static void skip(String p, String up){
//         if(up.isEmpty()){
//             System.out.println(p);
//             return;
//         }

//         if(up.charAt(0)=='a'){
//             skip(p,up.substring(1));
//         }else{
//             skip(p+up.charAt(0), up.substring(1));
//     }
// }

 static String skipApple(String str){
   
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipApple(str.substring(3));
        }
        else if(str.startsWith("apple")){
            return str.substring(0,5)+skipApple(str.substring(5));
        }

        return  skipApple(str.substring(1));

    

    }
    
}
