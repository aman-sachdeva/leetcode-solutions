class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        int n=nums.length;
        for(int si=0;si<=n-1;si++){
            int max=nums[si];
            int min=nums[si];
            for(int ei=si+1;ei<=n-1;ei++){
                max=Math.max(max,nums[ei]);
                min=Math.min(min,nums[ei]);
                sum+=max-min;
            }
        }
        return sum;
    }
}