package Tree;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        // Scanner scn = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(scn);
        // tree.prettyDisplay();

        BST tree = new BST();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree.populate(nums);
        System.out.println("Done");
        tree.display();
    }
    
}
