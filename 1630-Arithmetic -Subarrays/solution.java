class Solution {
    List<Boolean> res=new ArrayList<>();
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        for(int i=0;i<l.length;i++){
            int subarray[]=Arrays.copyOfRange(nums,l[i],r[i]+1);
            Arrays.sort(subarray);
            int diff=subarray[1]-subarray[0];
            boolean x=true;
            for(int j=2;j<subarray.length;j++){
                if(subarray[j]-subarray[j-1]!=diff){
                    x=false;
                    break;
                }
            }
            res.add(x);
        }
        return res;
    }
}