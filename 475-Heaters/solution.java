class Solution {
    public int findRadius(int[] houses, int[] heaters) {
      Arrays.sort(heaters);
      int ans=0;
      for(int i=0;i<houses.length;i++){
          int start=0;
          int end=heaters.length-1;
          int curr=Integer.MAX_VALUE;
          while(start<=end){
              int mid=start+(end-start)/2;
              if(houses[i]==heaters[mid]){
                  curr=0;
                  break;
              }
              else{
                  int diff=Math.abs(houses[i]-heaters[mid]);
                  curr=Math.min(curr,diff);
                  if(houses[i]<heaters[mid]){
                    end=mid-1;
                  }else{
                    start=mid+1;
                  }
              }
          }
        ans=Math.max(ans,curr);
      }
      return ans;  
    }
}