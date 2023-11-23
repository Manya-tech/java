package Tree;

class SegmentTree {

    private static class Node{

        int data;
        int si;
        int ei;
        Node left;
        Node right;

        public Node(int so, int ei){
            this.si = si;
            this.ei = ei;
        }
    }
    private Node root;
    public  SegmentTree(int[] arr){

        root = construct(arr,0,arr.length-1);
    }

    private Node construct(int[] nums,int s, int e){
        if(s==e){
            Node leaf = new Node(s,e);
            leaf.data = nums[s];
            return leaf;
        }

        Node node = new Node(s,e);
        int mid = (s+e)/2;

        node.left = construct(nums,s,mid);
        node.right = construct(nums,mid+1,e);

        node.data = node.left.data+node.right.data;
        return node;
    }
    

    public void display(){
        display(root,"Root node is : ");
    }

    private void display(Node node, String text){
        if(node==null){
            return;
        }

        System.out.println(text+node.data);
        display(node.left, "Left of "+node.data+" is ");
         display(node.right, "Right of "+node.data+" is ");
    }

    public int query(int qs, int qe){
        return query(root,qs,qe);
    }

    private int query(Node node, int qs, int qe){

        if(node.si>=qs && node.ei<=qe){
            return node.data;
        }else if(node.si<qe || node.ei<qs){
            return 0;
        }else{
            return query(node.left,qs,qe)+query(node.right,qs,qe);
        }
    }

    public void update(int val,int idx){
        root.data = update(root,val,idx);
    }

    private int update(Node node, int val, int idx){
        if(idx>=node.si && idx<=node.ei){
            if(idx==node.si && idx==node.ei){
                node.data=val;
                return node.data;
            }else{
                int left = update(node.left,val,idx);
                int right = update(node.right,val,idx);
                node.data = left+right;
                return node.data;
            }
        }

        return node.data;
    }
}
