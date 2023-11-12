class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       List<int[]> res=new ArrayList<>();
       for(int[] i:intervals){
        if(i[1]<newInterval[0]){
            res.add(i);
        }else if(i[0]>newInterval[1]){
            res.add(newInterval);
            newInterval=i;
        }else{
            newInterval[0]=Math.min(newInterval[0],i[0]);
            newInterval[1]=Math.max(newInterval[1],i[1]);
        }
       }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}