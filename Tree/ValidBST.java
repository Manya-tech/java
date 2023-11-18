package Tree;

//import javax.swing.tree.TreeNode;

public class ValidBST {

    static class TreeNode {
            int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
            }

            public static void main(String[] args) {
                //[5,4,6,null,null,3,7]
                TreeNode a = new TreeNode(3);
                TreeNode b = new TreeNode(7);
                TreeNode c = new TreeNode(6,a,b);
                TreeNode d = new TreeNode(4);
                TreeNode e = new TreeNode(5,d,c);
                System.out.println(isValidBST(e));
                
            }
    static boolean isValidBST(TreeNode root) {
        
        return isvalidBST(root,root);
    }
    
    static boolean isvalidBST(TreeNode root, TreeNode head){
        if(root==null){
            return true;
        }
        
        boolean lans = isvalidBST(root.left,head);
        boolean ans=false;
        if(root.left==null && root.right==null){
            ans=true;
        }else if(root.left==null && root.right!=null){
            ans = (root.val<root.right.val && head.val<root.right.val)?true:false;
        }else if(root.left!=null && root.right==null){
             ans = (root.val>root.left.val && head.val>root.left.val)?true:false;
        }else{
            ans = (root.val>root.left.val && head.val>root.left.val && root.val<root.right.val && head.val<root.right.val)?true:false;
        }
        boolean rans = isvalidBST(root.right,head);
        
      
        return (lans&&ans&&rans);
        
    }
    
}
