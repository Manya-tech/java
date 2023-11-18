package Tree;

class BST {

    public class Node{
        int value;
        Node left;
        Node right; 
        int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
    }

    private Node root;
    public boolean isEmpty(){
        return root==null;
    }

    public int height(Node node){
        if(node==null){
            return -1;
        }

        return node.height;
    }

    public void insert(int val){
        root = insert(root,val);
    }

    private Node insert(Node node, int val){
        if(node==null){
            node = new Node(val);
            return node;
        }

        if(val<node.value){
            node.left = insert(node.left,val);
        }
        if(val>node.value){
            node.right = insert(node.right,val);
        }

        return node;
    }

    public void display(){
        display(root,"Root Node is ");
    }

    private void display(Node node, String details){
        if(node==null){
            return ;
        }

        System.out.println(details+node.value);
        display(node.left,"Left child of "+node.value+" is ");
        display(node.right,"Right child of "+node.value+" is ");
    }

    public void populate(int[] nums){
        for(int i=0; i<nums.length; i++){
            insert(nums[i]);
        }
    }
    
}
