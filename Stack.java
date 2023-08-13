import java.util.*;

class Stack{
    ArrayList<Integer> stack = new ArrayList<>();
    public boolean isEmpty(){
        return stack.size()==0;
    }

    public void push(int data){
        stack.add(data);
    }

    public int pop(){
        if(this.isEmpty()){
            return -1;
        }
        int top = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;
    }

    public int peek(){
        if(this.isEmpty()){
            return -1;
        }
        return stack.get(stack.size()-1);
    }
}

class test{
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}