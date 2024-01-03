class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] freq=new int[nums.length+1];
       List<List<Integer>> ans=new ArrayList<>();
       for (int i=0;i<nums.length;i++){
           int count=freq[nums[i]];
           if(count==ans.size()){
               ans.add(new ArrayList());
                
           }
           ans.get(count).add(nums[i]);
           freq[nums[i]]++;
       }
    return ans;
    }
}