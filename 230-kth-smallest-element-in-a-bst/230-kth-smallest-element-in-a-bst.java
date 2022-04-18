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
    List<Integer> ar=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrderTraversal(root);
        return ar.get(k-1);
    }
    public void inOrderTraversal(TreeNode root)
    {
        if(root!=null)
        {
        if(root.left!=null)
            inOrderTraversal(root.left);
        ar.add(root.val);
        if(root.right!=null)
            inOrderTraversal(root.right);
        }
    }
}