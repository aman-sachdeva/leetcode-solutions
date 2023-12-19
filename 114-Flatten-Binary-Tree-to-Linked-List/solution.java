class Solution {
    TreeNode prev=null;
    public void flatten(TreeNode root) {//imp que
        if(root==null){return;}
        flatten(root.right);
        flatten(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
}