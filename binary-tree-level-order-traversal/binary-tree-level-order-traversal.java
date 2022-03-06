/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> ar=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        if(root!=null)
        q.add(root);
        while(q.size()>0){
            List<Integer> list=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                root=q.remove();
                list.add(root.val);
                if(root.left!=null)
                q.add(root.left);
            if(root.right!=null)
                q.add(root.right);
            }
            
            ar.add(list);
        }
        return ar;
    }
}