class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
       int result =0;
       for(int i=0;i<left.length;i++){
           result=Math.max(result,left[i]);
       } for(int i=0;i<right.length;i++){
           result=Math.max(result,n-right[i]);
       }
       return result;
    }
}