package Tree;

import java.util.Scanner;

class BinaryTree {
    
    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int val){
            this.value=val;
        }
    }

    private Node root;

    public void populate(Scanner scn){
        System.out.println("Enter the root node: ");
        int val = scn.nextInt();
        root = new Node(val);

        populate(scn,root);
    }

    private void populate(Scanner scn, Node node){
        System.out.println("Do you want to enter the left of" + node.value);
        boolean left = scn.nextBoolean();
        if(left){
            System.out.println("Enter the left of "+node.value);
            int val = scn.nextInt();
            node.left = new Node(val);
            populate(scn,node.left);
        }

        System.out.println("Do you want to enter the right of" + node.value);
        boolean right = scn.nextBoolean();
        if(right){
            System.out.println("Enter the right of "+node.value);
            int val = scn.nextInt();
            node.right = new Node(val);
            populate(scn,node.right);
        }
    }

    public void display(){
        disp(root," ");
    }

     private void disp(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        disp(node.left,indent+"\t");
        disp(node.right,indent+"\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level){
        if(node==null){
            return;
        }

        prettyDisplay(node.right,level+1);

        if(level!=0){
            for(int i=0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|---->"+node.value);

        }else{
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level+1);
    }
}
