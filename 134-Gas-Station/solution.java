class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
     int n=gas.length;
     int sum=0;
     int total=0;
     int pos=0;
     for(int i=0;i<n;i++){
        sum+=gas[i]-cost[i];
        if(sum<0){
            total+=sum;
            sum=0;
            pos=i+1;
        }
     }   
     total+=sum;
     if(total>=0){
         return pos;
     }else{
         return -1;
         }
    }
}