class Solution {
    public List<Integer> largestValues(TreeNode root) {
      HashMap<Integer,Integer>map=new HashMap();
      dfs(root,0,map);
      return new ArrayList(map.values());  
    }
    public void dfs(TreeNode root,int level,HashMap<Integer,Integer> map){
        if(root==null){
            return;
        }
        map.put(level,Math.max(root.val,map.getOrDefault(level,Integer.MIN_VALUE)));
        dfs(root.left,level+1,map);
        dfs(root.right,level+1,map);
    }
}