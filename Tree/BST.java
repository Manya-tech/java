package Tree;

class BST {

    public class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int val){
            this.value = val;
        }
    }

    private Node root;
    public boolean isEmpty(){
        return root == null ;
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

        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public boolean balanced(Node node){
        if(node==null){
            return true;
        }

        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right) ;
    }

    public void populate(int[] nums){
        for(int i =0; i<nums.length; i++){
            insert(nums[i]);
        }
    }

    public void display(){
        display(root,"Root node is ");
    }

    private void display(Node node, String text){
        if(node==null){
            return ;
        }

        System.out.println(text+node.value);
        display(node.left,"Left child of "+node.value+" is ");
        display(node.right,"Right child of "+node.value+" is ");
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums, int l, int h){
        if(l>=h){
            return;
        }

        int mid = (l+h)/2;
        insert(nums[mid]);
        populateSorted(nums, l, mid);
        populateSorted(nums, mid+1, h);
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node==null){
            return;
        }

        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
      }
    
      private void inOrder(Node node){
        if(node==null){
          return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        
        inOrder(node.right);
      }
    
      public void postOrder(){
        postOrder(root);
      }
    
      private void postOrder(Node node){
        if(node==null){
          return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
      }
    
}
