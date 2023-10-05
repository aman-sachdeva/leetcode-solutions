class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int nums1=-1;
       int nums2=-1;
       int count1=0;
       int count2=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==nums1){
               count1++;
           }else if(nums[i]==nums2){
               count2++;
           }else if(count1==0){
               nums1=nums[i];
               count1++;
           }else if(count2==0){
               nums2=nums[i];
               count2++;
           }else{
               count1--;
               count2--;
           }
       } 
       List<Integer> ans=new ArrayList<>();
       int cnt1=0;
       int cnt2=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==nums1){
               cnt1++;
           }else if(nums[i]==nums2){
               cnt2++;
           }
       }
       if(cnt1>nums.length/3){
           ans.add(nums1);
       }if(cnt2>nums.length/3){
           ans.add(nums2);
       }
       return ans;
       
    }
}