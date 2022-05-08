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
     public int averageOfSubtree(TreeNode root) {
        int[] result = new int[]{0};
        helper(root, result);
        return result[0]; 
    }
    private static int[] helper(TreeNode root, int[] result){
        if (root == null){
            return new int[]{0, 0};
        }
        int[] left = helper(root.left, result);
        int[] right= helper(root.right, result);
        int sum = left[0] + right[0] + root.val;
        int count = left[1] + right[1] + 1;
        int avg = sum / count;
        result[0] += (avg == root.val ? 1 : 0);
        return new int[]{sum, count};
    }
    /*
    private static int nodes=0,count=0;
    public int averageOfSubtree(TreeNode root) {
            helper(root);
            if(root.left!=null) helper(root.left);
            if(root.right!=null) helper(root.right);
        return count;  
    }
    public void helper(TreeNode root){
        int rootSub=preOrderTraversal(root,0);
        System.out.println(rootSub);
        if(rootSub/nodes==root.val)
            count++;
        nodes=0;
        if(root.left!=null)
        {
        int leftSub=preOrderTraversal(root.left,0);
        System.out.println(leftSub);
        if(leftSub/nodes==root.left.val)
            count++;
        }
        nodes=0;
        if(root.right!=null)
        {
        int rightSub=preOrderTraversal(root.right,0);
        System.out.println(rightSub);
        if(rightSub/nodes==root.right.val)
           count++;
        }
    }
    public int preOrderTraversal(TreeNode root,int sum){
        sum+=root.val;
        nodes++;
        if(root.left!=null)
            return preOrderTraversal(root.left,sum);
        if(root.right!=null)
            return preOrderTraversal(root.right,sum);
        return sum;
        
    }
    */
    /*
    public int averageOfSubtree(TreeNode root) {
        TreeNode rootSub=preOrderTraversal(root,0,0);
        if(rootSub.val==root.val)
            count++;
        TreeNode left=preOrderTraversal(root.left,0,0);
        if(left.val==root.left.val)
            count++;
        TreeNode right=preOrderTraversal(root.right,0,0);
        if(right.val==root.right.val)
            count++;
        return count;
    }
    public TreeNode preOrderTraversal(TreeNode root,int nodes,int sum){
        sum+=root.val;
        nodes++;
        if(root.left!=null)
            return preOrderTraversal(root.left,nodes,sum);
        if(root.right!=null)
            return preOrderTraversal(root.right,nodes,sum);
        return new TreeNode(sum/nodes);
    }
    */
}