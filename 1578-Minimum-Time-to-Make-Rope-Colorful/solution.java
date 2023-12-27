class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i=0;
        int j=0;
        int totaltime=0;
        int n=neededTime.length;
        while(i<n && j<n){
            int maxtime=0;
            int currtotal=0;
            while(j<n && colors.charAt(i)==colors.charAt(j)){
                maxtime=Math.max(maxtime,neededTime[j]);
                currtotal+=neededTime[j];
                j++;
            }
            i=j;
            totaltime+=currtotal-maxtime;
        }
        return totaltime;
    }
}