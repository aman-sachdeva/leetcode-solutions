class Solution {
    public List<Integer> grayCode(int n) {
        
        List<Integer> codes = new ArrayList((1 << n));
        codes.add(0);
        
        for(int i = 0; i < n; i++){
            int size = codes.size();
            
            //most significant bit
            int msb = 1 << i;
            
            for(int j = size - 1; j >= 0; j--){
                //append msb
                int num = codes.get(j) | msb;//didnt done by myself
                
                codes.add(num);
            }
        }
        
        return codes;
    }
}