import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class testidea {

    class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public static void main(String[] args) {
        int[] arr = {10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    
        
    static int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids){
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                if(i<0){
                    while(!stack.isEmpty() && stack.peek()>0){
                   
                        if(stack.peek()>-1*i){
                            break;
                        }else if(stack.peek()==-1*i){
                            stack.pop();
                            break;
                        }else{
                            stack.pop();
                            stack.push(i);
                        }
                    }else{
                        stack.push(i);
                    }
                }else{
                    if(stack.peek()<0){
                        if(-1*stack.peek()>i){
                            continue;
                        }else if(-1*stack.peek()==i){
                            stack.pop();
                        }else{
                            stack.pop();
                            while(!stack.isEmpty()){
                                if(stack.peek()<0 && -1*stack.peek()<i){
                                    stack.pop();
                                }else{
                                    break;
                                }
                            }
                            stack.push(i);
                        }
                    }else{
                        stack.push(i);
                    }
                    
                }
            }
        }
        int[] ans = new int[stack.size()];
        for(int i = stack.size()-1; i>=0; i--){
            ans[i]=stack.pop();
            
        }
        
        
        return ans;
        
    }
}

    

