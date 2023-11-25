class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum=0;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
       } 
       int[] res =new int[nums.length];
       int before=0;
       for(int i=0;i<nums.length;i++){
       int ele=nums[i];
       sum=sum-ele;
       int ele_before=i;
       int ele_after=nums.length-i-1;
        int val=sum-ele_after*ele;
        val+=ele_before*ele-before;
        before+=nums[i];
        res[i]=val;
       }
       return res;
    }
}