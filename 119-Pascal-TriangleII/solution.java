class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        long prev;
        long temp=0;
        int mod = 1000000007;
        for(int i=0;i<=rowIndex;i++){
            if(i==0){
                prev=1;
            }else{
                prev=(temp*(rowIndex-i+1))/i;
            }
             temp=prev;
             res.add((int)prev);
        }
        return res;
    }
}