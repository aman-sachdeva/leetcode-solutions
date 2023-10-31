class Solution {
    public int reverse(int x) {
        long ans = 0;
        while(x!=0){
            int y = x%10;
            ans+= y;
            ans = ans*10;
            x= x/10;
        }
        ans = ans/10;
        if(ans > Integer.MAX_VALUE || ans <Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*ans);
        }
        return (int)ans;
    }
}