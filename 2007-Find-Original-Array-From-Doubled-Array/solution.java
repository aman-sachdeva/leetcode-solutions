class Solution {
    public int[] findOriginalArray(int[] changed) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=changed.length;
       if(n%2!=0){
           return new int[0];
       } 
        Arrays.sort(changed);
        for(int i : changed) map.put(i,map.getOrDefault(i,0)+1);
        int[] res = new int[n/2];
         int k = 0;
        for(int i=0; i<n; i++){
            int ele = changed[i];
             if(map.containsKey(ele)){  
                if(map.containsKey(ele*2)){
                    res[k++] = ele;
                    map.put(ele,map.get(ele)-1);
                    map.put(ele*2,map.get(ele*2)-1);
                    if(map.get(ele)<=0) map.remove(ele);
                    if(map.containsKey(ele*2) && map.get(ele*2)<=0) map.remove(ele*2);
                }
                else return new int[0];
                }
            
        }
        return res;
    }
}