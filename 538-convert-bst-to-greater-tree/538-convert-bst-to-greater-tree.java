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
    int sum=0;
    
    public TreeNode convertBST(TreeNode root) {
        if(root!=null)
        {
            // because, keys greater will be in right subtree because it's a BST
            convertBST(root.right);
            sum+=root.val;
            root.val=sum;
            // to continue iteration from the left sides
            convertBST(root.left);
        }
        return root;
    }
}