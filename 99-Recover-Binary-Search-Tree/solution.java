class Solution {
    TreeNode prev = null, first = null, second = null;
public void recoverTree(TreeNode root) {
  fix(root);
  int temp = first.val;
  first.val = second.val;
  second.val = temp;
}
public void fix(TreeNode root){
  if(root == null) return;
  fix(root.left);
  if(prev != null && root.val < prev.val){
      if(first == null){
          first = prev;
      }
      second = root;
  }
  prev = root;
  fix(root.right);  
}
}