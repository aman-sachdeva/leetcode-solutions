class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int h=height.length-1;
        int maxwater=0;
        while(l!=h){
            int x=Math.min(height[l],height[h]);
            maxwater=Math.max(x*(h-l),maxwater);
            if(x==height[l]){
                l++;
            }else{
                h--;
            }
        }
        return maxwater;
    }
}