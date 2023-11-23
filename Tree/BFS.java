package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BFS {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

    if(root==null){
        return res;
    }

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    while(q.isEmpty()){
        int levelSize = q.size();
        List<Integer> clevel = new ArrayList<>(levelSize);

        for(int i=0; i<levelSize; i++){
            TreeNode node = q.poll();
            clevel.add(node.val);
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
        }

        res.add(clevel);
    }

    return res;

}
}
