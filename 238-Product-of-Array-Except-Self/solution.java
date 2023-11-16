class Solution {
    public int[] productExceptSelf(int[] nums) {
      int product=1;
      int n=nums.length;
      int [] output=new int[n];
      for(int i=0;i<n;i++){
          if(i==0){
              output[i]=nums[i];
          }
          else{
          output[i]=nums[i]*output[i-1];
          }
      }  
      for(int i=n-1;i>=0;i--){
        if(i==n-1){
            output[i]=output[i-1];
        }else if(i==0){
            output[i]=product;
        }
        else{
        output[i]=output[i-1]*product;
        }
        product*=nums[i];
      }
    return output;
    }
}