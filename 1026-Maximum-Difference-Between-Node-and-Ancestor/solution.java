class Solution {
    public int maxAncestorDiff(TreeNode root) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        return find(root,max,min);
    }
    public int find(TreeNode root,int maxval,int minval){
        if(root==null){
            return maxval-minval;
        }
        maxval=Math.max(maxval,root.val);
        minval=Math.min(minval,root.val);
        return Math.max(find(root.left,maxval,minval),find(root.right,maxval,minval));
    }
}