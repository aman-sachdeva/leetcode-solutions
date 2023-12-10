class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int[] nge=new int[n];
        HashMap<Integer,Integer> hmap=new HashMap<>();
        Stack<Integer> ans=new Stack<>();
        for(int i=n-1;i>=0;i--){
                while(ans.size()>0 && ans.peek()<nums2[i]){
                    ans.pop();
                }
                if(ans.isEmpty()){
                    nge[i]=-1;
                }
                else{
                    nge[i]=ans.peek();
                }
                ans.push(nums2[i]);
                hmap.put(nums2[i],nge[i]);
            
        }
        int[] x=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            x[i]=hmap.get(nums1[i]);
        }
        return x;
    }
}