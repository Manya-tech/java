package Tree;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scn);
        tree.prettyDisplay();
    }
    
}
