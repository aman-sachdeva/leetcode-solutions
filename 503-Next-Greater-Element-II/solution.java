class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int n=nums.length;
        int[] nge=new int[n];
        Stack<Integer> ans=new Stack<>();
        for(int i=n-2;i>=0;i--){
            while(ans.size()>0 && nums[i]>=ans.peek()){
                ans.pop();
            }
            ans.push(nums[i]);
        } 
        for(int i=n-1;i>=0;i--){
            while(ans.size()>0 && nums[i]>=ans.peek()){
                ans.pop();
            }
            if(ans.size()==0){
                nge[i]=-1;
            }else{
                nge[i]=ans.peek();
            }
            ans.push(nums[i]);
        }
        return nge;
    }
}