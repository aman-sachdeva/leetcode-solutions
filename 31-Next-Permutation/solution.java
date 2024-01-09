class Solution {
    public void nextPermutation(int[] nums) {
      int n=nums.length-1;
        if(n==0){
            return;
        }
        int i=1;
        int x=-1;
        while(i<=n){
            if(nums[i]>nums[i-1]){
                x=i;         
            }
            i++;
        }
        if(x==-1){
            for(int j=0;j<=n/2;j++){
                int temp=nums[j];
                nums[j]=nums[n-j];
                nums[n-j]=temp;
            }
            return;
        }
        int mn=nums[x];
        int index=x;
        for(int k=x;k<=n;k++){
            if(nums[k]>nums[x-1] && nums[k]<nums[index]){
                index=k;
            }
        }
        int z=nums[x-1];
        nums[x-1]=nums[index];
        nums[index]=z;
        Arrays.sort(nums,x,n+1);
    }
}