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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        TreeNode temp1=root.right;
        TreeNode temp2=root.left;
        int c1=0,c2=0;
        while(temp1!=null){
         c1++;
         temp1=temp1.right;
        }
         while(temp2!=null){
         c2++;
         temp2=temp2.left;
        }
        if(c1==c2){
            int x=(int)Math.pow(2,c1)-1;
            return 1+(x*2);
        }
        return 1+countNodes(root.left)+countNodes(root.right);

        
    }
}