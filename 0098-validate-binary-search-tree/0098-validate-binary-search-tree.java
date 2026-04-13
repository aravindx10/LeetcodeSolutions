class Solution {
    List<Integer> ar = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
     if(root == null)
     {
        return true;
     }
     isValidBST(root.left);
     ar.add(root.val);
     isValidBST(root.right);
     int n= ar.size();
     for(int i=1;i<n;i++)
     {
        if (ar.get(i)<=ar.get(i-1))
        return false;
     }
     return true;
    
  } 
}