class Solution {
    public int candy(int[] ratings) {
       int n=ratings.length;
       int count=n;
       int i=1;
       while(i<n){
           if(ratings[i]==ratings[i-1]){
               i++;
               continue;
           }
       
       int peak=0;
       while(ratings[i]>ratings[i-1]){
           peak++;
           count+=peak;
           if(i==n-1){
               return count;
           }
           i++;
       }
       int dip=0;
       while(i<n && ratings[i]<ratings[i-1]){
           dip++;
           count+=dip;
           i++;
       }
       count-=Math.min(peak,dip);
       }
       return count;
    }
}