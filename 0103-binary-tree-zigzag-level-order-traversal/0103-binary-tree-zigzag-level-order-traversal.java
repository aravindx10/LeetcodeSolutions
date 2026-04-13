class Solution {
    List<List<Integer>> arr = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
        {
            return arr;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n= q.size();
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode temp = q.poll();
                l.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            if(arr.size()%2==1)
            {
                Collections.reverse(l);
            }
            arr.add(l);
        }
        return arr;
        
    }
}