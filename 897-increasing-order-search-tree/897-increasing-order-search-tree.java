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
    List<Integer> data=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inOrderTraversal(root);
        TreeNode result=new TreeNode(-1),curr=result;
        for(int value:data){
            curr.right=new TreeNode(value);
            curr=curr.right;
        }
        return result.right;
    }
    public void inOrderTraversal(TreeNode root)
    {
        if(root!=null){
        if(root.left!=null)
        inOrderTraversal(root.left);
        data.add(root.val);
        if(root.right!=null)
        inOrderTraversal(root.right);
        }
    }
}