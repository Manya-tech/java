package Tree;
class AVL {

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

    public int height(){
        return height(root);
    } 
    
    private int height(Node node){
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

        return rotate(node);
    }
    private Node rotate(Node node){
        
        if(height(node.left)-height(node.right)>1){
            //left heavy

            if(height(node.left.left)-height(node.right.right)>0){
                //left left case
                return rightRotate(node);
            }else if(height(node.left.left)-height(node.right.right)<0){
                //left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }else if(height(node.left)-height(node.right)<-1){
            //right heavy

            if(height(node.left.left)-height(node.right.right)<0){
                //right right case
                return leftRotate(node);
            }else if(height(node.left.left)-height(node.right.right)>0){
                //right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        
        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
    c.height = Math.max(height(c.left), height(c.right) + 1);

    return c;
    }

    private Node leftRotate(Node c){
       Node p = c.right;
       Node t = p.left;
       p.left = c;
       c.right = t;
       

        p.height = Math.max(height(p.left), height(p.right) + 1);
    c.height = Math.max(height(c.left), height(c.right) + 1);

    return p;
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
