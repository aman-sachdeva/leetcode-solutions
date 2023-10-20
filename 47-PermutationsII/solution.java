class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
   List<List<Integer>> result=new ArrayList<>();
       List<Integer> ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
       Answer(result,ds,nums,freq);
        return result;
    }
     public void Answer(List<List<Integer>> result,List<Integer> ds,int[] nums,boolean[] freq){
        if(ds.size()==nums.length && result.contains(ds)==false){
            result.add(new ArrayList<>(ds));
            return;
        }
         for(int i=0;i<nums.length;i++){
             if(!freq[i]){
                 freq[i]=true;
                 ds.add(nums[i]);
                 Answer(result,ds,nums,freq);
                 ds.remove(ds.size()-1);
                 freq[i]=false;
             }
         }
    }
}