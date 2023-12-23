
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
              List<List<Integer>> res=new ArrayList<>();
        if(root == null){
            return res;
        }
        helper(root,res);
        return res;
    }
    public void helper(TreeNode root,List<List<Integer>> res){
      Queue<TreeNode> x=new LinkedList<>();
       x.add(root);
     int count=0;
        while(!x.isEmpty()){
            int sz=x.size();
             
            List<Integer> y=new ArrayList<>();
            while(sz!=0){
            TreeNode curr=x.remove();
                if(count%2==0){
             y.add(curr.val);
            }else{
                y.add(0,curr.val);
            }
               
                if(curr.left!=null){
                    x.add(curr.left);
                 
                }
                if(curr.right!=null){
                    x.add(curr.right);
                }
                sz--;
                
            }
            res.add(y);
             count++;
            
        }
         
    }
}