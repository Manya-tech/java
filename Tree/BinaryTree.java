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
            this.value = val;
        }
    }

    private Node root;

    public void populate(Scanner scn){

        int val = scn.nextInt();
        root = new Node(val);
        populate(root,scn);
    }

    private void populate(Node node, Scanner scn){
        System.out.println("Do you want to enter value in the left of "+node.value);
        boolean left = scn.nextBoolean();
        if(left){
            int val = scn.nextInt();
            node.left = new Node(val);
            populate(node.left, scn);
        }

        System.out.println("Do you want to enter value in the right of "+node.value);
        boolean right = scn.nextBoolean();
        if(right){
            int val = scn.nextInt();
            node.right = new Node(val);
            populate(node.right, scn);
        }

    }

    public void display(){
        display(root," ");
    }

    private void display(Node node,String indent){
        if(node==null){
            return;
        }

        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level){

        if(node==null){
            return;
        }

        prettyDisplay(node.right, level+1);

        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|---->"+node.value);

        }else{
            System.out.println(node.value);
        }

        prettyDisplay(node.left,level+1);
    }

}
