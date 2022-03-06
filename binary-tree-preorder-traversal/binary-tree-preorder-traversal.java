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
    ArrayList<Integer> ar=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null)
        {
            ar.add(root.val);
        if(root.left!=null)
            {
                preorderTraversal(root.left);
            }
        if(root.right!=null)
            {
                preorderTraversal(root.right);
            }
        }
       
        return ar;
    }
}