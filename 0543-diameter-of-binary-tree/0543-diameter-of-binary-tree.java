
class Solution {
    int result=0;
    public int diameterOfBinaryTree(TreeNode root) {
           solve(root);
           return result; 
    }
    public int solve(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=solve(root.left);
        int right= solve(root.right);

        result=Math.max(result,left+right);

        return 1+ Math.max(left,right);
    }
}