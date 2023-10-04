class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
      for (int i=0;i<nums.length;i++){
          if(hmap.containsKey(nums[i])){
              count+=hmap.get(nums[i]);
              hmap.put(nums[i],hmap.get(nums[i])+1);
          }
          else{
              hmap.put(nums[i],1);
          }
      }
      
      return count; 
    }
}